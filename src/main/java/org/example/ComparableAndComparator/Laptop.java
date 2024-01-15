package org.example.ComparableAndComparator;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Laptop lap2) {
        if(this.getRam() > lap2.getRam()){
            return -1;
        }
        else if(this.getRam() < lap2.getRam()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
//return lap2.getRam() - this.getRam();

        //If the result is positive, it indicates that the current object (this) is greater than the object being compared (lap2). This leads to an ascending order because larger values will come last.
        //If the result is negative, it indicates that the current object (this) is smaller than the object being compared (lap2), resulting in a descending order because smaller values will come first.
        //If the result is zero, it means the two objects are considered equal in terms of ordering.

