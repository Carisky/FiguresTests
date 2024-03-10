package org.example.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testCalculateArea() {
        assertEquals(9.0, Square.calculateArea(3), 0.01);
    }
}