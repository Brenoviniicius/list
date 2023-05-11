package com.project.list.repositorio;

import com.project.list.entidades.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepositorio extends JpaRepository  <GameList, Long> {
}
