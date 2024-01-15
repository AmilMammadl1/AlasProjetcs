package org.example.Polymorphism;

public class Square implements ShapaInterface{
    public String color;
    public Square(String color) {
        this.color = color;
    }

    public static void test() {

    }
    @Override
    public double calculateAreaInterface() {
        return 0;
    }

    @Override
    public void displayInfo(String color) {
        ShapaInterface.super.displayInfo(this.color);
    }
}
