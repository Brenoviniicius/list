package com.project.list.controladores;

import com.project.list.dto.GameDTO;
import com.project.list.dto.GameMinDTO;
import com.project.list.entidades.Game;
import com.project.list.servicos.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    //Especificando o tipo de get que será pelo id
    @GetMapping(value= "/{id}")
    public GameDTO findById(@PathVariable long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
