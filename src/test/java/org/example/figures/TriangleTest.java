package org.example.figures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    public void testCalculateArea() {
        assertEquals(10.0, Triangle.calculateArea(5, 4), 0.01);
    }
}