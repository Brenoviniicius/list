package com.project.list.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name="tb_belonging")
public class Beloging {

    @EmbeddedId
    private BelogingPK id = new BelogingPK();

    private Integer position;

    public Beloging(){}

    public Beloging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public BelogingPK getId() {
        return id;
    }

    public void setId(BelogingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beloging beloging)) return false;
        return Objects.equals(id, beloging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

