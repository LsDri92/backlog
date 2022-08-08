
package com.games.backlog.repository;

import com.games.backlog.model.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends JpaRepository <Backlog, Long>{
    
    
    
}
