package org.example.homework.four.ex1;

public abstract class Car {
    private boolean isClean;
    private double width;
    private double height;
    private double length;

    public Car(double width, double height, double length) {
        this.isClean = false;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }
}
