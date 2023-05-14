package com.project.list.servicos;

import com.project.list.dto.GameDTO;
import com.project.list.dto.GameMinDTO;
import com.project.list.entidades.Game;
import com.project.list.projetctions.GameMinProjection;
import com.project.list.repositorio.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //Especificando que sera apenas leitura
    @Transactional(readOnly=true)
    public GameDTO findById (long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
