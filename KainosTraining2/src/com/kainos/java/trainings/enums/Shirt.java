package com.kainos.java.trainings.enums;

public class Shirt {
    private final ShirtSize size;
    private final Color color;
    private double price;

    public Shirt(ShirtSize size, Color color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    void summerDiscount(){
        this.price -= this.price*0.15;
    }

    @Override
    public String toString() {
        return String.format("%s shirt, size: %s, price: %.2f$", color, size, price);
    }

    public ShirtSize getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
