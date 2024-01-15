package org.example.Polymorphism.Ecommerce.products.clothes;

import org.example.Polymorphism.Ecommerce.impls.ClothesProduct;

public class Trousers extends ClothesProduct {
    public Trousers(int id, String size, String brandName, String color, double price) {
        super(id, size, brandName, color, price);
    }
}
