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

        // 2. find remainder of two numbers
        System.out.println("Enter your first number: ");
        double firstNum = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double secondNum = scanner.nextDouble();
        double result = remainder(firstNum, secondNum);
        System.out.printf("The remainder is %f", result);
        System.out.println();

        // 3.

        // 4.
    }
}
