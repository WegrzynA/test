package com.mstow.demo1.rsareports;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class ReportMonth {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

    @Column
    private LocalDate date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pharmacyId")
    private Pharmacy pharmacy;

    @Column
    private BigDecimal sell;

    @Column
    private BigDecimal sellv;

    @Column
    private BigDecimal buy;

    @Column
    private BigDecimal buyv;

    @Column
    private BigDecimal stock;

    @Column
    private BigDecimal stockv;

    public ReportMonth id(int id) {
        this.id = id;
        return this;
    }

    public ReportMonth date(LocalDate date) {
        this.date = date;
        return this;
    }

    public ReportMonth product(Product product) {
        this.product = product;
        return this;
    }

    public ReportMonth pharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
        return this;
    }

    public ReportMonth sell(BigDecimal sell) {
        this.sell = sell;
        return this;
    }

    public ReportMonth sellv(BigDecimal sellv) {
        this.sellv = sellv;
        return this;
    }

    public ReportMonth buy(BigDecimal buy) {
        this.buy = buy;
        return this;
    }

    public ReportMonth buyv(BigDecimal buyv) {
        this.buyv = buyv;
        return this;
    }

    public ReportMonth stock(BigDecimal stock) {
        this.stock = stock;
        return this;
    }

    public ReportMonth stockv(BigDecimal stockv) {
        this.stockv = stockv;
        return this;
    }
}
