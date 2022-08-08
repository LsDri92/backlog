
package com.games.backlog.service;

import com.games.backlog.model.Backlog;
import java.util.List;


public interface IBacklogService {
    
    public List<Backlog> readGames ();
    public void addGame (Backlog game);
    public void deleteGame (Long id);
    public Backlog findGame (Long id);
    public void editGame (Backlog game);
    
    
    
}
