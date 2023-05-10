package com.project.list.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="tb_pertence")
public class Pertence {

    @EmbeddedId
    private PertencePK id = new PertencePK();

    private Integer posicao;

    public Pertence(){}

    public Pertence (Game game, GameList list, Integer posicao) {
        id.setGame(game);
        id.setList(list);
        this.posicao = posicao;
    }

    public PertencePK getId() {
        return id;
    }

    public void setId(PertencePK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pertence pertence = (Pertence) o;
        return Objects.equals(id, pertence.id) && Objects.equals(posicao, pertence.posicao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, posicao);
    }


}

