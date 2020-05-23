package com.mstow.demo1.rsareports.result;

import lombok.Data;

@Data
public class NetworkKey {
    private int id;
    private String name;

    public NetworkKey id(int id) {
        this.id = id;
        return this;
    }

    public NetworkKey name(String name) {
        this.name = name;
        return this;
    }
}
