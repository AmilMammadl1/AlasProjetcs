package org.example.Generics.UpperBoundedAndLowerBounded;

public class UpperBoundedWildcard <T extends Number>{
//UpperBoundedWildcard<Integer>, Integer is the type argument.

}

/*
An upper-bounded wildcard allows you to specify that the type argument must be a specific type or any type that extends that specific type.
It is denoted by the ? extends Type syntax.
In this example, the type parameter T can be any type that is a subclass of Number.
        For instance, you can instantiate Box<Integer>, Box<Double>, etc.

 */