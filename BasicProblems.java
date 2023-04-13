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
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args){
        // 1. Add two numbers
        int firstNumber;
        int secondNumber;
        try{
            System.out.print("Enter first integer: ");
            firstNumber = sc.nextInt();
            System.out.print("Enter your second number: ");
            secondNumber = sc.nextInt();
            AddTwoNumbers add_two_nums = new AddTwoNumbers();
            int sum;
            sum = add_two_nums.addTwoNumbers(firstNumber, secondNumber);
            System.out.printf("Sum of two numbers is %d", sum);
            System.out.println();
        }catch(Exception e){
            // throw new InputMismatchException("Ivalid data type!");
            System.out.println("Invalid data type");
        }

     

        // int sum = add_two_nums.addTwoNumbers();


        // 2.

        // 3.

        // 4.
    }
}
