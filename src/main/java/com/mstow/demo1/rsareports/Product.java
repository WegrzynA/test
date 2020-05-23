package com.mstow.demo1.rsareports;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    public Product id(int id) {
        this.id = id;
        return this;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }
}
