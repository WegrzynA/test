package com.mstow.demo1.rsareports.result;

import lombok.Data;

import java.util.List;

@Data
public class NetworkValue {
    private List<MonthValue> buy;
    private List<MonthValue> sell;
    private List<MonthValue> stock;

    public NetworkValue buy(List<MonthValue> buy) {
        this.buy = buy;
        return this;
    }

    public NetworkValue sell(List<MonthValue> sell) {
        this.sell = sell;
        return this;
    }

    public NetworkValue stock(List<MonthValue> stock) {
        this.stock = stock;
        return this;
    }
}
