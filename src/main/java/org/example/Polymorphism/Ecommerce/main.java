package org.example.Polymorphism.Ecommerce;

import org.example.Polymorphism.Ecommerce.impls.Product;
import org.example.Polymorphism.Ecommerce.products.clothes.Trousers;
import org.example.Polymorphism.Ecommerce.products.clothes.Tshirt;
import org.example.Polymorphism.Ecommerce.products.electronics.Laptop;
import org.example.Polymorphism.Ecommerce.products.electronics.Phone;

public class main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(1, 16, 512, "MacBook", "Black", 2500);
        Product laptop2 = new Laptop(2, 8, 1024, "Lenovo", "Red", 1500);//upper-casting

        Phone phone1 = new Phone(1, 2, 64, "Iphone", "Black", 700);
        Product phone2 = new Phone(2, 1, 128, "Samsung", "Red", 400);//upper-casting

        Tshirt tshirt1 = new Tshirt(1, "XL", "Tommy", "Red", 50);
        Product tshirt2 = new Tshirt(2, "L", "Nike", "Green", 20);//upper-casting

        Trousers trousers1 = new Trousers(1, "XL", "Pull&Bear", "Black", 40);
        Product trousers2 = new Trousers(2, "L", "Bershka", "White", 30);//upper-casting

        System.out.println(laptop1.getColor());
        System.out.println(laptop1.getStorage());

        System.out.println(laptop2.getPrice());
        System.out.println(laptop2.getBrandName());

        System.out.println(tshirt1.getSize());



    }
}
