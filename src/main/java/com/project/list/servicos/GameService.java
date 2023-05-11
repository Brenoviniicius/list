package com.project.list.servicos;

import com.project.list.dto.GameDTO;
import com.project.list.dto.GameMinDTO;
import com.project.list.entidades.Game;
import com.project.list.repositorio.GameRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositorio gameRepositorio;

    //Especificando que sera apenas leitura
    @Transactional(readOnly=true)
    public GameDTO findById (long id) {
        Game result = gameRepositorio.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }

    @Transactional(readOnly=true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositorio.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
