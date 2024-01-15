package org.example.Polymorphism.Ecommerce.products.electronics;

import org.example.Polymorphism.Ecommerce.impls.ElectronicProduct;

public class Laptop extends ElectronicProduct {

    public Laptop(int id, double ram, double storage, String brandName, String color, double price) {
        super(id, ram, storage, brandName, color, price);
    }

}
