package org.example.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    public void testCalculateArea() {
        assertEquals(12.0, Rhombus.calculateArea(6, 4), 0.01);
    }
}