package org.example.Polymorphism.Ecommerce.impls;

import org.example.Polymorphism.Ecommerce.interfaces.Purchasable;

public abstract class Product implements Purchasable {
    private String brandName;
    private double price;
    private String color;
    private int id;

    public Product(String brandName,String color, double price, int id) {
        this.color = color;
        this.brandName = brandName;
        this.price = price;
        this.id = id;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }
}
