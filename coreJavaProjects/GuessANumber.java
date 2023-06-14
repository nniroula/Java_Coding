package coreJavaProjects;
import java.util.Scanner;
import java.util.InputMismatchException;

/* To Run this program in command line, run the following commands
 * cd coreJavaProjects
 * javac -d . GuessANumber.java
 * java coreJavaProjects.GuessANumber
 */

/** Write a program to guess a number that computer randomly generates */

/** Test cases:
 * 1. Enter c, and then enter number
 * 2. c, then letter
 * 3. c, then number, then letter
 * 4. Enter letter other than c or q
 */

/** generatge a random number */
class RandomNumberGenrator{
    public int getRandomNumber(){
        int number = (int)Math.floor(Math.random() *10); // Math.random() returns double
        return number;
    }
}

public class GuessANumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // Instantiate Random Number Generator class
        RandomNumberGenrator integerGenerator = new RandomNumberGenrator();
        int generatedNumber = integerGenerator.getRandomNumber();
        System.out.printf("Random number is %d ", generatedNumber);
        System.out.println();
    
        /** create a varible to hold write or wrong and use while loop with that variable */
        boolean inputValidiation = false;
        int numb = -1; // Sentinel value -> value with which program terminates(exits)
        System.out.println("Enter 'c' for continue or 'q' for quit: ");
        String inputChar = scanner.next();
            while(inputValidiation != true){
                // System.out.println("Enter 'c' for continue or 'q' for quit: ");
                // String inputChar = scanner.next();
                if(inputChar.toLowerCase().equals("q")){
                    break;
                }else if(inputChar.toLowerCase().equals("c")){
                    try{
                        System.out.println("Enter an integer number less than 10: ");
                        numb = scanner.nextInt();
                        // System.out.printf("your number is %d ", numb);
                        // System.out.println();
                        inputValidiation = true;
                        boolean win = false;
                        boolean exception = false;
                        while(!win || !exception){
                            // try{
                                if(numb == generatedNumber){
                                    System.out.println("CONGRATULATIONS!!! You won!!!");
                                    win = true;
                                    break;
                                }else if(numb > generatedNumber){
                                    System.out.print("BIG! ");
                                    System.out.print("Enter a smaller number: ");
                                    numb = scanner.nextInt();
                                }else if(numb < generatedNumber){
                                    System.out.print("SMALL! ");
                                    System.out.print("Enter a bigger number: ");
                                    numb = scanner.nextInt();
                                }
                            // }catch(InputMismatchException e){  // numb is not an int type, use try catch to handle it
                            //     exception = true;
                            //     System.out.println("Enter a NUMBER < 10: ");
                            //     // numb = scanner.nextInt();

                            // }
                            
                        }
                    }catch(InputMismatchException e){
                        // System.out.println(e.getStackTrace());
                        System.out.println("Invalid input type");
                        // System.out.println("Please enter an integer number less than 10: ");
                        // numb = scanner.nextInt();
                        System.out.println("enter c to CONTinue or q to QUit: ");
                        inputChar = scanner.next();
                    }
                }else{
                    // numb = Integer.parseInt(inputChar); // convert string to int
                    System.out.print("Not a valid entry! ");
                    System.out.println("Try again please!");
                    System.out.print("enter c to CONTINUE or q to QUIT: ");
                    try{
                        inputChar = scanner.next();
                    }catch(InputMismatchException e){
                        System.out.println("Start over again please. Quitting...");
                    }
                } 
            }
        // close the scanner
        scanner.close();
    }
}
