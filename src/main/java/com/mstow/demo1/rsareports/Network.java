package com.mstow.demo1.rsareports;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Network {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    public Network id(int id) {
        this.id = id;
        return this;
    }

    public Network name(String name) {
        this.name = name;
        return this;
    }
}
