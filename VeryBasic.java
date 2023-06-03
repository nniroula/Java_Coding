/**
 * Q1. Write a program that prints the sum of first ten positve integers, 1+2+...+10
 */
class SumOfFirstTenIntegers{
    public int sumTen(){
        int sum = 0;
        for(int i = 1; i< 11; i++){
            sum += i;
        }
        return sum;
    }
}

public class VeryBasic {
    public static void main(String[]args){
        SumOfFirstTenIntegers sum1 = new SumOfFirstTenIntegers();
        int result = sum1.sumTen();
        System.out.printf("The sum of first ten integers is %s. ", result);
        System.out.println();

    }
}
