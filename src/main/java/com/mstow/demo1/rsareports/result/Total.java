package com.mstow.demo1.rsareports.result;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Total {
    private BigDecimal buyValue;
    private BigDecimal buyAmount;
    private BigDecimal sellValue;
    private BigDecimal sellAmount;
    private BigDecimal stockValue;
    private BigDecimal stockAmount;

    public Total buyValue(BigDecimal buyValue) {
        this.buyValue = buyValue;
        return this;
    }

    public Total buyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
        return this;
    }

    public Total sellValue(BigDecimal sellValue) {
        this.sellValue = sellValue;
        return this;
    }

    public Total sellAmount(BigDecimal sellAmount) {
        this.sellAmount = sellAmount;
        return this;
    }

    public Total stockValue(BigDecimal stockValue) {
        this.stockValue = stockValue;
        return this;
    }

    public Total stockAmount(BigDecimal stockAmount) {
        this.stockAmount = stockAmount;
        return this;
    }
}
