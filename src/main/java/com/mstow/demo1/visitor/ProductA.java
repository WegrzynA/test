package com.mstow.demo1.visitor;

public class ProductA implements Product {
    @Override
    public void accept(ProductVisitor productVisitor) {
        productVisitor.visit(this);
    }
}
