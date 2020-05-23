package com.mstow.demo1.rsareports;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pharmacy {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "networkId")
    private Network network;

    public Pharmacy id(int id) {
        this.id = id;
        return this;
    }

    public Pharmacy name(String name) {
        this.name = name;
        return this;
    }

    public Pharmacy network(Network network) {
        this.network = network;
        return this;
    }
}
