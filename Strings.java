/**
 * This file deals with java strings
 */
public class Strings {
    public static void main(String []args){
        /**
         *      1. Create strings in java
         */

        // first way
        String name = "Nabin";
        // System.out.println(name);

        // second way with new keyword
        String name2 = new String("Nk");
        // System.out.println(name2);

        /**
         *      Formatted strings in java like string template in js and f string in python
         */

        // one way
        String formatedName = String.format("My name is %s", name);
        System.out.println(formatedName);

        // second way directly in the printf statement
        String language1 = "Java";
        System.out.printf("The first programming language I learned was %s.", language1); // . = period to end sentence
        // after printf, do println() to print empty line
        System.out.println();
    }
}
