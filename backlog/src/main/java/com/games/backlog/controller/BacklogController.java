package com.games.backlog.controller;

import com.games.backlog.model.Backlog;
import com.games.backlog.service.IBacklogService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BacklogController {

    @Autowired
    private IBacklogService gameServ;

    List<Backlog> listBacklog = new ArrayList();

    @PostMapping("/add/game")
    public void addGame(@RequestBody Backlog game) {
        gameServ.addGame(game);
    }

    @GetMapping("/read/backlog")
    @ResponseBody
    public List<Backlog> readGames() {
        return gameServ.readGames();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameServ.deleteGame(id);
    }
    
    @PutMapping("/edit/game")
    public void editGame(@RequestBody Backlog game){
        gameServ.editGame(game);
    }
}
