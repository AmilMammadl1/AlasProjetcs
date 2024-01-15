package org.example.Polymorphism.Ecommerce.products.clothes;

import org.example.Polymorphism.Ecommerce.impls.ClothesProduct;

public class Tshirt extends ClothesProduct {

    public Tshirt(int id, String size, String brandName, String color, double price) {
        super(id, size, brandName, color, price);
    }
}
