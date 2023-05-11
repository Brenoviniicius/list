package com.project.list.servicos;

import com.project.list.dto.GameListDTO;
import com.project.list.entidades.GameList;
import com.project.list.repositorio.GameListRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepositorio gameListRepositorio;

    //Especificando que sera apenas leitura
    //Convertendo a game list para gamelistDTO
    @Transactional(readOnly=true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepositorio.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
