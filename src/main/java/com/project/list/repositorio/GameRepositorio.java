package com.project.list.repositorio;

import com.project.list.entidades.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepositorio extends JpaRepository  <Game, Long> {
}
