package com.javacourse;

public class Circle {
    int radius;
    int diameter;
    int area;

    public Circle() {
        radius = 1;
        diameter = radius * 2;
        area = 22 / 7 * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void displayCircle() {
        System.out.println("Small circle value" + " " + radius + " " + diameter + " " + area);

        System.out.println("Large circle value" + " " + radius + " " + diameter + " " + area);
    }
}