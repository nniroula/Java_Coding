class JavaMethods{
    void methodOne(){
        System.out.println("I am the first method here");
    }

    // method with one parameter
    public int number(int firstNumber){
        int sum = firstNumber + firstNumber;
        return sum;
    }

    // method with multiple parameters
    String student(String firstName, String lastName){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    // method with array parameter
    int sumArrayElements(int[] nums){
        int sum = 0;
        for(int elem:nums){  // Enhanced for loop
            sum = elem + sum;
        }
        return sum;
    }
}

public class Methods {
    public static void main(String[] args){
        System.out.println("Learning Java Methods");
        JavaMethods javaMethods = new JavaMethods();
        // System.out.println(jm.methodOne()); -> you cannot do this for void return type
        javaMethods.methodOne();

        // second metthod
        System.out.println(javaMethods.number(2));

        // third method
        System.out.println(javaMethods.student("Nabin", "Niroula"));

        // array method call
        int []arrayOfNumbers = {1, 2, 3};
        System.out.println(javaMethods.sumArrayElements(arrayOfNumbers));
    }
}
