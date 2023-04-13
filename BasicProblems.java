// import java.util.InputMismatchException;
import java.util.Scanner;
// 1. add two numbers
// TODO handle the exception
class AddTwoNumbers{
    int addTwoNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}

public class BasicProblems {
    static Scanner scanner = new Scanner(System.in);

    // 2. find remainder of two numbers
    static double remainder(double num1, double num2){
        double fractionalValue;
        fractionalValue = num1/num2;
        return fractionalValue;
    }

    // 3. find an area of a circle
    // public static final double APIE = 3.14; // accessible in main method
    // static final double PIE_VALUE = 3.14;   // accessible in main method
    private static final double PIE_VAL = 3.14;

    static double getPieValue(){
        return PIE_VAL;
    }

    public static double area(double radius){
        // final double PIE = 3.14;
        double PIE = getPieValue();
        double area = PIE * radius*radius;
        return area;
    }
    public static void main(String []args){
      
        // 1. Add two numbers
        /*
        int firstNumber;
        int secondNumber;
        try{
            System.out.print("Enter first integer: ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter your second number: ");
            secondNumber = scanner.nextInt();
            AddTwoNumbers add_two_nums = new AddTwoNumbers();
            int sum;
            sum = add_two_nums.addTwoNumbers(firstNumber, secondNumber);
            System.out.printf("Sum of two numbers is %d", sum);
            System.out.println();
        }catch(Exception e){
            // throw new InputMismatchException("Ivalid data type!");
            System.out.println("Invalid data type");
        }
        */

        /* 
        // 2. find remainder of two numbers
        System.out.println("Enter your first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double secondNum = scanner.nextDouble();
        double result = remainder(firstNum, secondNum);
        System.out.printf("The remainder is %f", result);
        System.out.println();
        */
        // 3. find an area of a circle
        // System.out.println(APIE);
        // System.out.println(PIE_VALUE);
        // System.out.println(PIE_VAL);
        try{
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.printf("Area of circle is %.3f", area(radius)); // .3 => 3 digits after decimal point
            System.out.println();
        }catch(Exception e){
            System.out.println("Invalid input data");
        }
  

        // 4.
    }
}
