package org.example.Generics;

public class MyClass<T> {
    // Class definition with a type parameter 'T'
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}


    /* A generic class in Java is a class that can work with any data type.
     It allows you to create a class that can be used with different types, providing flexibility and type safety.


     Why Use Generics?
Type Safety: Generics provide compile-time type checking, which helps catch type-related errors at compile time rather than at runtime. This enhances the safety and reliability of your code.

Code Reusability: Generics allow you to write classes and methods that can work with different data types. This promotes code reusability by reducing the need for duplicating code for different data types.

Flexibility: Generics provide flexibility in creating classes and methods that are not tied to a specific data type. This makes the code more adaptable and versatile.

Elimination of Type Casting: With generics, you don't need to explicitly cast objects to a specific type since the type information is retained.

Enhanced Readability: Generics make the code more readable and self-explanatory by expressing the intent of the code in a clearer way.
     */