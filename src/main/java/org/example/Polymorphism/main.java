package org.example.Polymorphism;

public class main {
    public static void main(String[] args) {
        Circle c = new Circle("red",5);
        c.displayInfo();
        Circle.sayHi();


        Square square = new Square("green");
        square.displayInfo("red");


    }
}
