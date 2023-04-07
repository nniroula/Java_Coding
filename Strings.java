/**
 * This file deals with java strings
 */

import java.util.Arrays;

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

       /**
        *       String methods
        */

        String developer = "Backend";

        // 1. length
        int lenght_Of_string = developer.length();
        // System.out.println(lenght_Of_string);
        // System.out.printf("The length of the string is %d", developer.length());
        // System.out.println();

        // 2. isEmpty() -> returns boolean, true or false
        // System.out.println(developer.isEmpty());

        // 3. split() -> returns an array of characters

        // String splittedString = developer.split(""); -> wrong, data type should be an array of string
        // String splittedStringArray [] = developer.split("");
        // System.out.println(splittedStringArray);  // You cannot print java arrays directly like in JS or Python
        
        /* Arrays.toString(array) makes array printable */
        // System.out.println(Arrays.toString(splittedStringArray));  // import Arrays

        // 4. join() -> you can join characters of an array and return a string
        
        //  join the above splitted string
        /*
        String rejoinned = String.join("", splittedStringArray);
        System.out.printf("The re-joinned string is %s", rejoinned);
        System.out.println();
        */

        // 5. toUpperCase()
        // System.out.println(developer.toUpperCase());

        // 6. toLowerCase()
        // System.out.println(developer.toLowerCase());

        // 7. Compare two strings with equals(), equalsIgnoreCase() methods -> returns true or false
        String str1 = "java";
        String str2 = "Java";
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2));

        // 8. contains() -> check if a string contains substring
        System.out.println(str1.contains("av"));
        System.out.println(str2.contains("gg"));

        // 8. Concatenate two strings

    }
}
