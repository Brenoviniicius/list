package com.project.list.dto;

import com.project.list.entidades.Game;

public class gameMinDTO {

    private long id;
    private String titulo;
    private Integer year;
    private String imgUrl;
    private String descricaoCurta;

    //criacao dos metodos
    public gameMinDTO( ) {

    }

    //criacao do metodo princial a partir da exportação da classe Game
    public gameMinDTO(Game entity) {
        id = entity.getId();
        titulo = entity.getTitulo();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        descricaoCurta = entity.getDescricaoCurta();
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }
}


