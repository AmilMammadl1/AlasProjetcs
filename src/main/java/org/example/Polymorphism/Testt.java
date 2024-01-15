package org.example.Polymorphism;

public class Testt extends Test{
    public Testt(String color) {
        super(color);
    }

    @Override
    public double calculateAreaInterface() {
        return 0;
    }

    @Override
    public void displayInfo(String color) {
        super.displayInfo(color);
    }

    @Override
    public double calculateAreaAbstract() {
        return 0;
    }
}
