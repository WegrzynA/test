package com.mstow.demo1.visitor;

import java.util.function.Consumer;

public interface Product extends Consumer<ProductVisitor> {
}
