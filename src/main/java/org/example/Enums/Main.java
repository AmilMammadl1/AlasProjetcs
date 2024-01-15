package org.example.Enums;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //========================================================================================
//        System.out.println("Full name of USA: " + Country.USA.getFullName());
//        System.out.println("Full name of Ca: " + Country.CA.getFullName());
//        System.out.println("Full name of Aze: " + Country.AZ.getFullName());
//        System.out.println("Full name of Turkiye: " + Country.TR.getFullName());
        //========================================================================================


        ArrayList<Country> countriesList = new ArrayList<>();

        // Adding enum constants to ArrayList
        for (Country country : Country.values()) {
            countriesList.add(country);
        }

        // Printing the contents of the ArrayList
        for (Country country : countriesList) {
            System.out.println(country + ": " + country.getFullName());
        }


        //========================================================================================
//        Country firstCountry = Country.AZ;
//        Country secondCountry = Country.TR;
//
//        int comparison = firstCountry.compareTo(secondCountry);
//
//        if (comparison < 0) {
//            System.out.println(firstCountry + " comes before " + secondCountry);
//        } else if (comparison > 0) {
//            System.out.println(firstCountry + " comes after " + secondCountry);
//        } else {
//            System.out.println(firstCountry + " and " + secondCountry + " are the same");
//        }
        //========================================================================================
//        boolean equals = firstCountry.equals(secondCountry);
//        System.out.println("equals:"+equals);
        //========================================================================================
//        Country country = Country.valueOf("AZ");
//        System.out.println(country.getFullName());
        //========================================================================================

    }
}
