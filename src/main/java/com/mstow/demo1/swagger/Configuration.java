package com.mstow.demo1.swagger;

import javax.persistence.*;

@Entity
public class Configuration {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String name;

    @Column
    private String content;
}
