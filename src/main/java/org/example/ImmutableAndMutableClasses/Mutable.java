package org.example.ImmutableAndMutableClasses;

public class Mutable {
    private int value;

    public Mutable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void incrementBy(int incrementValue) {
        this.value += incrementValue;
    }
}
/*
        Fields are not necessarily final: Fields of a mutable class can be modified after instantiation.

        Mutator methods are provided: Mutable classes often provide methods that modify the state of the object.

        The object can be modified directly: The state of a mutable object can be changed directly by modifying its fields.

 */
