package org.example.ImmutableAndMutableClasses;

public class main {
    public static void main(String[] args) {
        ImmutableExample immutableObj = new ImmutableExample(10);
        int currentValue = immutableObj.getValue();
        System.out.println("Current value: " + currentValue);
        ImmutableExample incrementedObj = immutableObj.incrementBy(5);

        System.out.println("Original value: " + immutableObj.getValue());
        System.out.println("Incremented value: " + incrementedObj.getValue());



        String yazi = "a";
        yazi.concat("sss");

    }
}
