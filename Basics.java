// You can use packages for the better coding. Here all the code is written without package
/**
 * One Java file has only one high level public class. But it can have any number of classes
 * The name of the top level public class must be same as the file name
 * .class file such as Main.class is called bypte code. Compiler creates the byte code for each class in your codebase
 * 
 * static in method definition indicates that it is a class method and you can call that method without
 * instantiating its class
 */

//  Variables
/**
 * start with underscore, lowercase, and camelCase, case sensitive
 * 
 * CONST in java = static final(eg; static final int age ) => static final = phrase
 *      final keyword means once value is assigned it can never be changed (final int age = 27)
 */

//  2 data types - Primitive data types and Reference data types
/**
 *  8 primiitve data types
 *      byte(8 bits), 
 *      short(16 bits), 
 *      int(32 bits or 4 bytes), 
 *      long(64 bits), 
 *      float(32 bits, it is single precision), 
 *      double(64 bits, double precision), 
 *      boolean, 
 *      char(16 bits)
 * 
 * NOTE: Every number with decimal in java is treated as double. So, use f or F at the end to represent float.
 *  Eg: float age = 34.5f; or float age = 34.5F;
 */

//  Q1. create a class and declare method in it to be static, and call that method in top-level class


public class Basics{

    // static keyword means that you can call main method without instantiating its class.
    public static void main(String []args){

        // Basic syntax
        System.out.println("This is Nabin getting ready for full stack java development");

        // Casting - implicit casting and explicit casting

        // implicit casting -> compiler converts smaller type to bigger type
        int num1 = 24;
        double num2 = num1; 
        // System.out.println(num2);

        double value1 = 34.5;
        int modified1 = (int) value1;  // trauncated the decimal part
        // System.out.println(modified1);

        float price = 12.5F;
        // System.out.println(price);
        // string float format 1
        String floatPrice = String.format("Price is %f ", price); // returns 12.500000
        // System.out.println(floatPrice);

        // string float format 2
        String floatPrice2 = String.format("Price is %12.3f", price); // returns    12.500(right aligned)
        // System.out.println(floatPrice2);

        // - (hyphen) indicates left alignment
        // System.out.printf("The floating point price is %-12.3f", price);
        // System.out.println();
    }
}
