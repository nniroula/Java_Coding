/**
 * Constructor is used to iniitialize an object when a class is instantiated.
 * Constructor is a special type of method and must have public className(){ ... }. className 
 * should be the name of the class of that constructor.
 * You can have multiple consturctors, but they should have different parameters
 * 
 *      How to call constructor inside another constructor - use 'this' keyword
 *      this()  -> calls default constructor
 *      this("nabin", 'coder') -> calls constructor with two parameters etc.
 */
class CodingFun{
    public CodingFun(){
        // call second constructor here
        // this(3, 9.5);
        System.out.println("I am automatically callled when you instantiate CodingFun class");
    }

    public CodingFun(int count, double num){
        this();
        System.out.println("Above output comes from constructor 1 ...");
      
        int sum = count + (int)num;
        System.out.printf("The sum in constructor is %d", sum);
        System.out.println();
    }
}
public class Constructors {
    public static void main(String[]args){
        System.out.println("This is all about java constructor...");
        // one way to instantiate the class is to put result in a variable
        CodingFun cf = new CodingFun();

        // Second way to run constructor is to simply instantiate a class
        new CodingFun();

        new CodingFun(3, 4.5);
    }
    
}
