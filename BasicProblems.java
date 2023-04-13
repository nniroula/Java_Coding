// import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;


// TODO handle the exception

// 1. add two numbers
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

    // 4. calculate perimeter of a circle
    static double perimeterOfCircle(double radius){
        return 2*getPieValue()*radius;
    }

     // 5. Swap values in 2 variables
    static int []swapVariables(int para1, int para2){  // return two variables without array
        int tempVariable;
        tempVariable = para1;
        para1 = para2;
        para2 = tempVariable;

        int valueSwappedArray[] = new int[2];
        valueSwappedArray[0] = para1;
        valueSwappedArray[1] = para2;
        return valueSwappedArray;
    }

    //6. get user input of first and last names and concatenate them
    static String fullName(String firstName, String lastName){
        // String fullName = "";
        // fullName = firstName + "" + lastName;
        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
            .append(" ")
            .append(lastName);
        // return fullName;
        // System.out.println(sb);
        return sb.toString();       // stringbuilder type to string type
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
        /* 
        try{
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            System.out.printf("Area of circle is %.3f", area(radius)); // .3 => 3 digits after decimal point
            System.out.println();
        }catch(Exception e){
            System.out.println("Invalid input data");
        }
        */


        // 4. calculate perimeter of a circle
        /* 
        try{
            System.out.print("Enter radius of a circle: ");
            double radius1 = scanner.nextDouble();
            System.out.printf("Perimeter of the circle is %.3f", perimeterOfCircle(radius1));
            System.out.println();
        }catch(Exception e){
            System.out.println("Invalid data type. Please try again.");
        }
        */

        // 5. Swap values in 2 variables
        /* 
        int resultantArray[] = new int[2]; //swapVariables
        resultantArray = swapVariables(2, 4);
        System.out.println(Arrays.toString(resultantArray));
        */

        //6. get user input of first and last names and concatenate them
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); // or next() ->No, takes input until ""(space)
        System.out.print("Enter you last name: ");
        String lastName = scanner.nextLine(); // nextLine() takes input until new line(\n)
        // String resulantNames = fullName(firstName, lastName); // cannot make static reference
        // Name the method to be static b/c its inside static maiin method
        String resulantNames = fullName(firstName, lastName);
        // System.out.printf("The full name becomes %S", resulantNames); // %S converts to all caps
        System.out.printf("The full name becomes %s", resulantNames);
        System.out.println();

    }
}