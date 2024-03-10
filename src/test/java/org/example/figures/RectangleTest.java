package org.example.figures;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void calculateArea() {
        assertEquals(20.0, Rectangle.calculateArea(5, 4), 0.01);
    }
}