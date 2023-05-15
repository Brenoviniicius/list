package com.project.list.controladores;

import com.project.list.dto.GameMinDTO;
import com.project.list.dto.ReplacementDTO;
import com.project.list.servicos.GameService;
import org.springframework.web.bind.annotation.*;
import com.project.list.dto.GameListDTO;
import com.project.list.servicos.GameListService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findBylist(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId, body.getSoucerIndex(), body.getDestinationIndex());
    }
}
