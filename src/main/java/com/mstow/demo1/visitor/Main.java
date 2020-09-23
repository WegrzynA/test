package com.mstow.demo1.visitor;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product product = productService.getProductById(1);
        product.accept(new ProductVisitorImpl());
    }
}
