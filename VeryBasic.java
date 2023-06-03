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



    }
}
