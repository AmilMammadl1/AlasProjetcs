package org.example.Polymorphism;

public interface ShapaInterface {
    public static final int a = 5;
    double calculateAreaInterface();

    default void displayInfo(String color) {
        System.out.println("This is a " + color + " square.");
    }

    static void sayHi() {
        System.out.println("hi");
    }
}
