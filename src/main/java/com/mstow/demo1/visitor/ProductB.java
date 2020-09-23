package com.mstow.demo1.visitor;

public class ProductB implements Product {
    @Override
    public void accept(ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
