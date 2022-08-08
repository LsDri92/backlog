package com.games.backlog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Backlog {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Boolean started;
    private String url;
    private String description;
    


    public Backlog() {
    }
    
    public Backlog(Long id, String name, Boolean started, String url, String description) {
        this.id = id;
        this.name = name;
        this.started = started;
        this.url = url;
        this.description = description;
    }
}