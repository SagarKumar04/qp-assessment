package com.questionpro.grocery.model;


import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class UnitDetails {
    public enum Unit {
        kg,
        gm,
        l,
        ml,
        box,
        bag,
        packet
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Unit unit;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "available_quantity")
    private Float availableQuantity;

    @ManyToOne(cascade = CascadeType.ALL)
    private Grocery grocery;
}
