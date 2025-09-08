package com.example.api.jogos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "jogos")
public class Jogos {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name= "titulo")
    private String titulo;
    @Column(name= "genero")
    private String genero;
    @Column(name= "plataforma")
    private String plataforma;
    @Column (name = "desenvolvedora")
    private String desenvolvedora;
    @Column (name = "anoLancamento")
    private int anoLancamento;
    @Column (name = "nota")
    private double nota;
    @Column (name= "finalizado")
    private boolean finalizado;

    public Jogos() {
    }

    public Jogos(String id, String titulo, String plataforma, String genero, String desenvolvedora, int anoLancamento, double nota, boolean finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.desenvolvedora = desenvolvedora;
        this.anoLancamento = anoLancamento;
        this.nota = nota;
        this.finalizado = finalizado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", desenvolvedora='" + desenvolvedora + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", nota=" + nota +
                ", finalizado=" + finalizado +
                '}';
    }
}
