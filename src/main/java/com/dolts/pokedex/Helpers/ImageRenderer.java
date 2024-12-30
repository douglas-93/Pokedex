package com.dolts.pokedex.Helpers;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.IOException;

public class ImageRenderer extends JLabel implements TableCellRenderer {

    public ImageRenderer() {
        setHorizontalAlignment(JLabel.CENTER); // Centraliza a imagem na célula
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof String) {
            String imageUrl = (String) value;
            try {
                URL url = new URL(imageUrl);
                Image image = ImageIO.read(url);
                if (image != null){
                    //Redimensiona a imagem para caber na célula
                    int largura = table.getRowHeight();
                    int altura = table.getRowHeight();
                    Image imagemRedimensionada = image.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);
                    setIcon(new ImageIcon(imagemRedimensionada));
                } else{
                    setText("Imagem não encontrada");
                    setIcon(null);
                }
            } catch (IOException e) {
                setText("Erro ao carregar a imagem");
                setIcon(null);
                System.out.println("Erro ao carregar imagem: " + e.getMessage());
            }
        } else {
            setIcon(null);
            setText("");
        }
        return this;
    }
}