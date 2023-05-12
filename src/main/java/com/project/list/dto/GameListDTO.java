package com.project.list.dto;

import com.project.list.entidades.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private long id;
    private String nome;

    public GameListDTO() {}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        nome = entity.getNome();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
