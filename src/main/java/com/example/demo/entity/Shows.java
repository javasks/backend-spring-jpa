package com.example.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SHOWS")
public class Shows {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "shows")
    private List<Audience> audiences= new ArrayList<>();

    public void addAudiene(Audience audience){
        audiences.add(audience);
    }

    public Shows(String name) {
        this.name = name;
    }
}
