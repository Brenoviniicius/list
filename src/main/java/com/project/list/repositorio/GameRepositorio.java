package com.project.list.repositorio;

import com.project.list.entidades.Game;
import com.project.list.projetctions.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepositorio extends JpaRepository  <Game, Long> {
    @Query (nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.titulo, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.descricao_curta AS descricaoCurta, tb_pertence.posicao
		FROM tb_game
		INNER JOIN tb_pertence ON tb_game.id = tb_pertence.game_id
		WHERE tb_pertence.list_id = :listId
		ORDER BY tb_pertence.posicao
			""")
    List<GameMinProjection> searchByList(Long listId);
}
