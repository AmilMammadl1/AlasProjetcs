package org.example.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("MacBook", 16, 2000));
        laptops.add(new Laptop("Lenovo", 17, 1500));
        laptops.add(new Laptop("Asus", 12, 3500));

        Comparator<Laptop> laptopComparator = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lap1, Laptop lap2) {
                 return lap1.getPrice() - lap2.getPrice();
            }
        };

//
        Collections.sort(laptops,laptopComparator);
//
        for (Laptop b : laptops) {
            System.out.println(b);
        }










    }
}
