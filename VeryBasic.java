import java.math.BigInteger;
import java.util.Scanner;

/**
 * Q1. Write a program that prints the sum of first ten positve integers, 1+2+...+10
 * 
 * Q2. write a program that prints your name inside a box
 */
class SumOfFirstTenIntegers{
    public int sumTen(){
        int sum = 0;
        for(int i = 1; i< 11; i++){
            sum += i;
        }
        return sum;
    }

    //product of first ten integers
    public int product(){
        int product = 1;
        for(int i = 1; i< 11; i++){
            product = product * i;
        }
        return product;
    }
}

class PrintMyNameInBox{
    public void printMyName(){
        System.out.println(" ________"); //7 // shift -
        System.out.println("| Nabin |");
        System.out.println(" --------");
    }
}

public class VeryBasic {
    public static void main(String[]args){
        SumOfFirstTenIntegers obj = new SumOfFirstTenIntegers();
        int result = obj.sumTen();
        /**  */
        System.out.printf("The sum of first ten integers is %s. ", result);
        System.out.println();
       

        // product
        int product = obj.product();
        System.out.println(product);

        PrintMyNameInBox name = new PrintMyNameInBox();
        name.printMyName();

        // variables declarations
        int age;
        double price;
        String myName;
        long quantity;
        short valu;
        byte _word;
        char a;
            // Wrapper class variables
            Double interest;
            Integer numb;
            Character p;
            Byte b;
            Short st;
            Long l;

        // variable initialization
        int myAge = 0;
        double price1 = 2.3;
        String lastName = "";
        char letter = 'A';
        byte bite = 45;    // byte - accepts int and char values
        byte bt = 'A';    // converts to ascii value, 65

        System.out.println(bite);
        System.out.printf("Byte variable value is %s", bt);   // displays 65 - ascii value of A
        System.out.println();

        // CONSTANT - use capital letters and final keyword
        final double PRICE = 33.4;
        final int AGE = 2;
        final String NAME = "Prabha";
        final byte BITE = 'a';
        final long NUMBER = 84;

        final byte n = -128;  // byte holds numbers between -128 to 127.

        // Big Numbers, data types
        BigInteger bi = new BigInteger("100");
        BigInteger num1  = new BigInteger("500");
        bi.multiply(num1);
        bi.add(num1);
        bi.subtract(num1);

        // Math functions
        Math.pow(2, 3); // 2 to the power of 3, 2^3
        Math.sqrt(4); // square root
        Math.round(3.14);
        Math.max(2, 4);
        Math.min(3, 9);
        Math.abs(4);

        // Cast, casting the value
        double cost = 3.14;
        // int price2 = cost; // throws error
        int price2 = (int) cost;

        // I/O in java
        // use Scanner class, import java.util.Scanner;
        /** 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an ineger value");
        int input1 = sc.nextInt();
        System.out.printf("Your input is %d", input1);
        System.out.println();

        // for double
        sc.nextDouble();
        // for string input
        sc.next();

        */

        // Strings
        String name3;
        String name4 = "nabin";

        name4.length();
        name4.substring(2, name4.length());  // substring method

        // New line characters

        // To print in separate lines
        System.out.println("*\n**\n***\n");

        // to include quotation marks, use backslash and quotation marks
        System.out.println(" Hi \"Hello\" ");

        // characters
        char firstLetter = 'a';
        String myName1 = "Nabin";
        myName1.charAt(0);   // charAt(index) retrieves character at that index








    }
}
