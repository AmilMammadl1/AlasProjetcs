package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        //======================================================================================
        MyClass<Integer> intObj = new MyClass<>(42);
        System.out.println("Value: " + intObj.getValue());

        MyClass<String> strObj = new MyClass<>("Hello, Generics!");
        System.out.println("Value: " + strObj.getValue());

        // Using a generic method
        Integer result1 = myGenericMethod(10);
        String result2 = myGenericMethod("Generics are awesome!");

        System.out.println(result1);
        System.out.println(result2);
//        ======================================================================================

        System.out.println(sumOfNumberList(List.of(1,2.0,3f,4)));
        System.out.println(sumOfNumberList(List.of()));

        //======================================================================================
//        List<Object> objectList = new ArrayList<>();
//        objectList.add("s");
//        objectList.add(5);
//        addIntegers(objectList);
//        for(Object obj:objectList){
//            System.out.println(obj);
//        }
    }

    public static <T> T myGenericMethod(T parameter) {
        // Method definition with a type parameter 'T'
        // Method logic using the generic type 'T'
        return parameter;
    }

    //this method accept any List that extends Number class, ? = wildcard, this wildcard is called upperbounded wildcard
    public static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers){
            sum+=number.doubleValue();
        }
        return sum;
    }

    //lowerbounded wildcard,You can pass a List<Object>, List<Number>, List<Integer>, or any other type that is a supertype of Integer to this method.
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
    }


}
/*
Reading vs. Writing:

Upper-Bounded: Primarily used for reading elements from a collection.
Lower-Bounded: Primarily used for adding elements to a collection.
Flexibility Direction:

Upper-Bounded: Provides flexibility to work with subtypes.
Lower-Bounded: Provides flexibility to work with supertypes.

 */