package application.controller;

import application.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import application.service.gameService;

import java.util.List;

@RestController
public class gameController {

    @Autowired
    private gameService gameService;


    @RequestMapping("games")
    public List<Games> getAllGames()
    {
        return gameService.getAllGames();
    }
}
