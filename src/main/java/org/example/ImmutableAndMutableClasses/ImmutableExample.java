package org.example.ImmutableAndMutableClasses;

public final class ImmutableExample {
    private final int value;

    public ImmutableExample(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ImmutableExample incrementBy(int incrementValue) {
        return new ImmutableExample(this.value + incrementValue);
    }
}



/*
    An immutable class in Java is a class whose instances cannot be modified after they are created.
    (The statement "An immutable class in Java is a class whose instances cannot be modified after they are created" essentially means that once an object of an immutable class is instantiated (created),
     its state or values cannot be changed)
    Once an object of an immutable class is instantiated, its state (the values of its fields) cannot be changed.
    Immutable classes are often preferred in various programming scenarios due to their thread safety, simplicity,
     and reliability.

 Characteristics of an immutable class:

1)Final Fields: The fields (attributes) of the class are usually declared as final, meaning their values cannot be changed after they are assigned.
2)No Mutator Methods: Immutable classes typically do not provide methods that modify the state of the object.
There are no methods, often called mutator methods, that change the values of the fields.
3)Methods Return New Instances: If a method appears to modify the object, it usually returns a new instance of the class with the modified values. This way, the original object remains unchanged.
*/


