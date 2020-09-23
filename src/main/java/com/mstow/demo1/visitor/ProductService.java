package com.mstow.demo1.visitor;

import java.util.Arrays;
import java.util.List;

public class ProductService {
    public List<Product> getProducts() {
        return Arrays.asList(new ProductA(), new ProductB());
    }

    public Product getProductById(int id) {
        return new ProductA();
    }
}
