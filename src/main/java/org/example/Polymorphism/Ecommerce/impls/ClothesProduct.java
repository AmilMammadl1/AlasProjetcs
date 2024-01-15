package org.example.Polymorphism.Ecommerce.impls;

import org.example.Polymorphism.Ecommerce.interfaces.Wearable;

public abstract class ClothesProduct extends Product implements Wearable {
    private String size;

    public ClothesProduct(int id, String size, String brandName, String color, double price) {
        super(brandName, color, price, id);
        this.size = size;
    }

    @Override
    public String getSize() {
        return size;
    }
}
