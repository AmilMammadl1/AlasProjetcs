package org.example.Enums;

public enum Country {
    USA("United States of America"),
    CA("Canada"),
    AZ("Azerbaijan"),
    TR("Turkiye");

    private final String fullName;

    Country(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
}
