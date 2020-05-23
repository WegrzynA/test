package com.mstow.demo1.rsareports.result;

import lombok.Data;

import java.util.List;

@Data
public class Response {
    private List<NetworkKey> networkKeys;
    private List<ProductRow> productRows;

    public Response networkKeys(List<NetworkKey> networkKeys) {
        this.networkKeys = networkKeys;
        return this;
    }

    public Response productRows(List<ProductRow> productRows) {
        this.productRows = productRows;
        return this;
    }
}
