package com.mstow.demo1.rsareports.result;

import lombok.Data;

import java.util.List;

@Data
public class ProductRow {
    private List<NetworkValue> networkValues;
    private Total total;

    public ProductRow networkValues(List<NetworkValue> networkValues) {
        this.networkValues = networkValues;
        return this;
    }

    public ProductRow total(Total total) {
        this.total = total;
        return this;
    }
}
