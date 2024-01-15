package org.example.StringBuilderAndStringBuffer;

public class main {
    public static void main(String[] args) {
        String str = "our";
        String concat = str.concat(" group");

        StringBuilder stringBuilder = new StringBuilder("our");
        stringBuilder.append(" group");

        System.out.println(concat +" | " + stringBuilder.toString());

    }
}
//StringBuffer is synchronized, but string builder is not synchronized and both are mutable