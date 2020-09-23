package com.mstow.demo1.visitor;

public interface ProductVisitor {
    void visit(ProductA productA);
    void visit(ProductB productB);
}
