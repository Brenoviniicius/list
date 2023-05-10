package com.project.list.servicos;

import com.project.list.dto.GameMinDTO;
import com.project.list.entidades.Game;
import com.project.list.repositorio.GameRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositorio gameRepositorio;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositorio.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
