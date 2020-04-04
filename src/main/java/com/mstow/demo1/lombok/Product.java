package com.mstow.demo1.lombok;

import lombok.Data;

@Data
public class Product {
    private String name;
    private String ean;
    private String price;
}
