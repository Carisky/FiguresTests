package org.example;

import org.example.figures.Rectangle;
import org.example.figures.Rhombus;
import org.example.figures.Square;
import org.example.figures.Triangle;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        System.out.println("Triangle area 2.0 | 4.0");
        System.out.println(Triangle.calculateArea(2.0,4.0));

        System.out.println("Rectangle area 4.0 | 8.0");
        System.out.println(Rectangle.calculateArea(4.0,8.0));

        System.out.println("Square area 4.0");
        System.out.println(Square.calculateArea(4.0));

        System.out.println("Rhombus area 5.0 | 7.0");
        System.out.println(Rhombus.calculateArea(5.0,7.0));
    }
}