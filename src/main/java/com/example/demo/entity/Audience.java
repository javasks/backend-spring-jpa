package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AUDIENCE")
public class Audience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "shows_audience",
            joinColumns = @JoinColumn(name = "aud_id"),
            inverseJoinColumns = @JoinColumn(name = "sh_id")
    )
    private List<Shows> shows= new ArrayList<>();

    public Audience(String name) {
        this.name = name;
    }

    public void watchShows(Shows show){
        shows.add(show);
    }
}
