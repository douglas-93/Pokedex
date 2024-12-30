package com.dolts.pokedex.models;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {

    private int id;
    private String nome;
    private String habilidade1;
    private String habilidade2;
    private int altura;
    private int hp;
    private int ataque;
    private int defesa;
    private int ataqueEspecial;
    private int defesaEspecial;
    private int velocidade;
    private int peso;
    private String tipo1;
    private String tipo2;
    private String imagemURL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade1() {
        return habilidade1;
    }

    public void setHabilidade1(String habilidade1) {
        this.habilidade1 = habilidade1;
    }

    public String getHabilidade2() {
        return habilidade2;
    }

    public void setHabilidade2(String habilidade2) {
        this.habilidade2 = habilidade2;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefesaEspecial() {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial) {
        this.defesaEspecial = defesaEspecial;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getImagemURL() {
        return imagemURL;
    }

    public void setImagemURL(String imagemURL) {
        this.imagemURL = imagemURL;
    }

    public void parseAttributes(JsonNode json) {
        this.setId(json.path("id").asInt());
        this.setNome(json.path("name").asText("Não Identificado"));
        this.setHabilidade1(json.path("abilities").path(0).path("ability").path("name").asText("Não Possui"));
        this.setHabilidade2(json.path("abilities").path(1).path("ability").path("name").asText("Não Possui"));
        this.setAltura(json.path("height").asInt());
        this.setHp(json.path("stats").path(0).path("base_stat").asInt());
        this.setAtaque(json.path("stats").path(1).path("base_stat").asInt());
        this.setDefesa(json.path("stats").path(2).path("base_stat").asInt());
        this.setAtaqueEspecial(json.path("stats").path(3).path("base_stat").asInt());
        this.setDefesaEspecial(json.path("stats").path(4).path("base_stat").asInt());
        this.setVelocidade(json.path("stats").path(5).path("base_stat").asInt());
        this.setTipo1(json.path("types").path(0).path("type").path("name").asText("Não Possui"));
        this.setTipo2(json.path("types").path(1).path("type").path("name").asText("Não Possui"));
        this.setPeso(json.path("weight").asInt());

        this.setImagemURL(json.path("sprites").path("front_default").asText("Não Encontrada"));
    }

    @Override
    public String toString() {
        return "Pokemon {\n"
                + "  ID: " + id + "\n"
                + "  Nome: " + nome + "\n"
                + "  Habilidade 1: " + habilidade1 + "\n"
                + "  Habilidade 2: " + habilidade2 + "\n"
                + "  Altura: " + altura + "\n"
                + "  HP: " + hp + "\n"
                + "  Ataque: " + ataque + "\n"
                + "  Defesa: " + defesa + "\n"
                + "  Ataque Especial: " + ataqueEspecial + "\n"
                + "  Defesa Especial: " + defesaEspecial + "\n"
                + "  Velocidade: " + velocidade + "\n"
                + "  Peso: " + peso + "\n"
                + "  Tipo 1: " + tipo1 + "\n"
                + "  Tipo 2: " + tipo2 + "\n"
                + "  Imagem URL: " + imagemURL + "\n"
                + "}";
    }
    
    public Object[] toArray() {
        return new Object[] {
            id, nome, habilidade1, habilidade2, altura, hp, ataque, defesa,
            ataqueEspecial, defesaEspecial, velocidade, peso, tipo1, tipo2, imagemURL
        };
    }

      public List<Object> toList() {
        List<Object> list = new ArrayList<>();
        list.add(id);
        list.add(nome);
        list.add(habilidade1);
        list.add(habilidade2);
        list.add(altura);
        list.add(hp);
        list.add(ataque);
        list.add(defesa);
        list.add(ataqueEspecial);
        list.add(defesaEspecial);
        list.add(velocidade);
        list.add(peso);
        list.add(tipo1);
        list.add(tipo2);
        list.add(imagemURL);
        return list;
    }
}
