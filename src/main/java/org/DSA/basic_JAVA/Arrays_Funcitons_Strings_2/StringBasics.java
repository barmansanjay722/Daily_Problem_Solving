package org.DSA.basic_JAVA.Arrays_Funcitons_Strings_2;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Sanjay";
        String sameName = "Sanjay";
        String newName = new String("Sanjay");

        System.out.println(name == sameName);
        System.out.println(name == newName);
        System.out.println(name.equals(newName));
    }
}
