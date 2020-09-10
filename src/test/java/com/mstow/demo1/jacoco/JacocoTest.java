package com.mstow.demo1.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JacocoTest {

    @Test
    void testAdd() {
        assertEquals(2, new Jacoco().add(1,1));
    }
}