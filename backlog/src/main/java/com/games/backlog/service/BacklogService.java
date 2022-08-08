package com.games.backlog.service;

import com.games.backlog.model.Backlog;
import com.games.backlog.repository.BacklogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class BacklogService implements IBacklogService {

    @Autowired
    BacklogRepository gamesRepo;
    
    @Override
    public List<Backlog> readGames() {
      return  gamesRepo.findAll();
    }

    @Override
    public void addGame(Backlog game) {
         gamesRepo.save(game);
    }

    @Override
    public void deleteGame(Long id) {
        gamesRepo.deleteById(id);
        
    }

    @Override
    public Backlog findGame(Long id) {
       return gamesRepo.findById(id).orElse(null);
    }

    @Override
    public void editGame(Backlog game) {
        gamesRepo.save(game);
    }

    
    
    
}
