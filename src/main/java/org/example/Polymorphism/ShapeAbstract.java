package org.example.Polymorphism;

abstract class ShapeAbstract {
    protected String color;

    public ShapeAbstract(String color) {
        System.out.println("shape");
        this.color = color;
    }
    public abstract double calculateAreaAbstract();
    public final void displayInfo() {
        System.out.println("This is a " + color + " shape.");
    }
    public static void sayHi(){
        System.out.println("hi");
    }
}
