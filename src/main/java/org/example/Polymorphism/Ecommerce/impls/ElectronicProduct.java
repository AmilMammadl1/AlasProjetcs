package org.example.Polymorphism.Ecommerce.impls;

import org.example.Polymorphism.Ecommerce.interfaces.Displayable;

public abstract class ElectronicProduct extends Product implements Displayable {
    private double ram;
    private double storage;

    public ElectronicProduct(int id,double ram, double storage,String brandName, String color, double price) {
        super(brandName, color, price, id);
        this.ram = ram;
        this.storage = storage;
    }


    @Override
    public double getRam() {
        return ram;
    }

    @Override
    public double getStorage() {
        return storage;
    }
}
