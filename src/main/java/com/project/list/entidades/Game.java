package com.project.list.entidades;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tb_games")
public class Game {

    //Criaçao das entidades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    @Column(name="game_year")
    private Integer year;
    private String genero;
    private String plataforma;
    private Double score;
    private String imgUrl;
    @Column(columnDefinition="TEXT")
    private String descricaoCurta;
    @Column(columnDefinition="TEXT")
    private String descricaoLonga;

    //Criacao dos metodos

    public Game(){

    }

    public Game(long id, String titulo, Integer year, String genero, String plataforma, Double score, String imgUrl, String descricaoCurta, String descricaoLonga) {
        this.id = id;
        this.titulo = titulo;
        this.year = year;
        this.genero = genero;
        this.plataforma = plataforma;
        this.score = score;
        this.imgUrl = imgUrl;
        this.descricaoCurta = descricaoCurta;
        this.descricaoLonga = descricaoLonga;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDescricaoLonga() {
        return descricaoLonga;
    }

    public void setDescricaoLonga(String descricaoLonga) {
        this.descricaoLonga = descricaoLonga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
