package com.example.listas;

public class itemListView {
    private int Foto;
    private String nome;
    private String descricao;
    private String seguidores;
    private String seguindo;
    private String frase;


    public itemListView(int foto, String nome, String descricao, String seguindo, String seguidores, String frase) {
        Foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.seguindo = seguindo;
        this.seguidores = seguidores;
        this.frase = frase;
    }

    public int getFoto() {
        return Foto;
    }
    public void setFoto(int foto) {
        Foto = foto;
    }


    public String getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(String seguidores) {
        this.seguidores = seguidores;
    }

    public String getSeguindo() {
        return seguindo;
    }
    public void setSeguindo(String seguindo) {
        this.seguindo = seguindo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getFrase(){
        return frase;
    }
    public void setFrase(String frase){
        this.frase = frase;
    }


}
