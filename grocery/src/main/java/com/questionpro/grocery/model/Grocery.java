package com.questionpro.grocery.model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Grocery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "grocery")
    private Collection<UnitDetails> unitDetails;
}
