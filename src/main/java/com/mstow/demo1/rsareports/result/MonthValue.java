package com.mstow.demo1.rsareports.result;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class MonthValue {
    private LocalDate date;
    private BigDecimal amount;
    private BigDecimal value;

    public MonthValue date(LocalDate date) {
        this.date = date;
        return this;
    }

    public MonthValue amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public MonthValue value(BigDecimal value) {
        this.value = value;
        return this;
    }
}
