package org.DSA.strings.videoQuestions;

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
