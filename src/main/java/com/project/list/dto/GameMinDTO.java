package com.project.list.dto;

import com.project.list.entidades.Game;
import com.project.list.projetctions.GameMinProjection;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    //criacao dos metodos
    public GameMinDTO( ) {

    }

    //criacao do metodo princial a partir da exportação da classe Game
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}


