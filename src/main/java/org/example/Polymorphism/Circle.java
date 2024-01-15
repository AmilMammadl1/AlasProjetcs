package org.example.Polymorphism;

class Circle extends ShapeAbstract {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateAreaAbstract() {
        return 0;
    }
//    @Override
//    public void displayInfo() {
//        System.out.println("dispLayInfo In ShapeAbstract");
//    }

//    @Override
//    public static void sayHi() {
//        System.out.println("say not hi");
//    }

}
