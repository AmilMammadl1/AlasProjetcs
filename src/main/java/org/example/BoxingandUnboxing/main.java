package org.example.BoxingandUnboxing;

public class main {
    public static void main(String[] args) {
        //Boxing is the process of converting a primitive data type into its corresponding wrapper class.
        //Unboxing is the process of converting an object of a wrapper class back to its corresponding primitive data type.

        int primitiveInt = 25;

        // Boxing: Convert int to Integer
        Integer wrapperInteger = new Integer(primitiveInt);

        // Unboxing: Get int value from Integer
        int i = wrapperInteger.intValue();
        System.out.println(i);

    }
}
