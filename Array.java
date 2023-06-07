import java.util.Arrays;
import java.util.Scanner;

class PartiallyFilledArrays{
    Scanner in = new Scanner(System.in);
    /**
     * this method is called in the main method of public class Array
     * @return returns an array of integers
     * fills the array partially
     */
    public int[] partiallyFilledArrays(){
        int arr[] = new int[5];
        // add array elements
        for(int i = 0; i<3; i++){
            arr[i] = i;
        }
        // print the array
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int countNumberOfElmensInArray(){
        Scanner scr = new Scanner(System.in);
        int currentSizeOfArray = 0;
        String arr1[] = new String[4];
     
        System.out.println("Enter the programming language: ");
        String input = scr.next();
        while(currentSizeOfArray < arr1.length) {
            if(input.equals("q")){
                break;
            }else{
                arr1[currentSizeOfArray] = input;
                System.out.println("Enter the programming language, q for quit: ");
                input = scr.next();
                currentSizeOfArray++;
            }
           System.out.printf("Element count is %d", currentSizeOfArray);
           System.out.println();
        }
        scr.close();
        return currentSizeOfArray;
    }
}

class ArrayMethods{
    /**
     * This is static method and will be called on class, not on object
     * @return array
     */
    public static int[] arrayFilling(){
        int arr[] = new int[3];
        for(int i = 0; i < arr.length; i++){
            // add even numbers to the array
            arr[i] = i * 2;
        }
        return arr;
    }

    public static int sumOfElements(){
        int arr[] = new int[3];
        arr[0] = 2;
        arr[1] = 8;
        arr[2] = 32;
        int sum = 0;
        // enhanced for loop
        for(int elem: arr){
            sum += elem;
        }
        return sum;
    }

    protected int average(){
        int avg = 0;
        int arr[] = {1, 3, 5};
        int sum = 0;
        for(int elem: arr){
            sum += elem;
        }
        avg = sum/arr.length;
        return avg;
    }

    protected int maxValue(int arr[]){
        int maxVal = arr[arr.length - 1];
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    protected double minValue(double arr[]){
        double minVal = arr[0];
        for(double val: arr){
            if(val < minVal){
                minVal = val;
            }
        }
        System.out.println("Minimum value is ... ");
        return minVal;
    }
}

public class Array {
    public static void main(String []args){
        // System.out.println("Java Arrays");

        // how to declare arrays in Java

        // One way is <type> <name of array> [] = new <type> [<length of the array>]
        int numbers[] = new int[3];

        // second way is to delcare and initialize in one go
        int numbers2[] = {1, 2, 3};
        String languages [] = {"JS", "PY", "Java", "C#"};

        /* print array elements */ 

        // print array elements in java -> string array
        // System.out.println(Arrays.toString(languages));

        // print array elements - int array
        // System.out.println(Arrays.toString(numbers2));

        /* Add array elements */
        int numbs1 [] = new int [5];
        numbs1[0] = 4;
        numbs1[1] = 8;
        numbs1[2] = 12;
        numbs1[3] = 16;
        /* NOTE: array length is 5, if we assign 4 elements, last element gets default int value, which is 0 */
        // System.out.println(Arrays.toString(numbs1)); // to print all array elements, last one is 0(default value)

        //  access array elements
        int element = numbs1[0];  // should return 4
        // System.out.println(element);

        int lastElem = numbs1[numbs1.length - 1];
        // System.out.println(String.format("Last element is %d", lastElem)); 

        /* Print all array element with for loop */
        /* 
        int arr1[] = {1, 2, 3, 4};
        for(int i = 0; i< arr1.length; i++){
            System.out.println(arr1[i]);
        }
        */

        // Array methods

        // 1 compare two arrays with Arrays.equals(arr1, arr2) method -> returns true or false
        String str1[] = {"java", "go", "C#", "C++"};
        String str2[] = {"Py", "JS", "CSS", "HTML"};

        // System.out.println(Arrays.equals(str1, str2));

        // 2 sort array elements
       Arrays.sort(str1);
        //    System.out.println(Arrays.toString(str1));


        // 2D arrays and also Multiple Dimensional arrays

        // 2D array
        int numbers1[][] = new int[2][3];

        // assign values to 2D arrays in java

        // row 0
        numbers1[0][0] = 5;  // row 0 column 0
        numbers1[0][1] = 10;
        numbers1[0][2] = 15;

        // row 1
        numbers1[1][0] = 2;  // row 1 coulumn 0
        numbers1[1][1] = 4;
        numbers1[1][2] = 6;

        // display the 2D array
        /* NOTE: Arrays.toString(arrayName) does not work for 2D arrays
         *  Use Arrays.deepToString(arrayName) to dispaly 2D array
         */
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(numbers1.length);

        int nums2 [][] = new int [3][3];

        int arr1[] = {1,2,3};
        int arr2[] = {3,6,9};
        int arr3[] = {10, 15, 20};

        nums2[0] = arr1;
        nums2[1] = arr2;
        nums2[2] = arr3;
        System.out.println(Arrays.toString(nums2));

        /* 
        // print individual elements in the 2D array
        for(int i = 0; i< nums2.length; i++){
            for (int j = 0; j< nums2.length; j++){
                System.out.println(nums2[i][j]);
            }
        }
        // print out arrays in 2D array
        for(int i = 0; i< nums2.length; i++){
            System.out.println(Arrays.toString(nums2[i]));
        }
        */

        // declare and iniitialize 2D array in one go
        int nums3[][] = {
                            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}

                        };

        System.out.println(Arrays.deepToString(nums3));

        // print array at index 0
        System.out.println(Arrays.toString(nums3[0]));

        // access value 2 in first array
        int value2 = nums3[0][1]; // 0 = first array, 1 = index 1 of that first array
        System.out.println(value2);

        // compare 2D arrays with Arrays.deepEquals(arr1, arr2)

        int nums_arr1[][] = { {1, 2, 3}, {4, 5, 6} };
        int nums_arr2 [][] = { {2, 4, 6}, {3, 6, 9} };

        boolean val = Arrays.deepEquals(nums_arr1, nums_arr2);  // false
        System.out.println(val);

        
        /* For .. Each loop */
        // if you do not need index, use for ... each loop
        char letters[] = {'a', 'c', 'd'};
        for(char character: letters){       // data type should be same as the array data type
            System.out.println(character);
        }

        // array declarations
        int[] nums1 = new int[4];
        String names[] = new String[2];
            // good way is to declare constant and use it in size
        final int size = 4;
        double prices [] = new double[size];
        final int arraySize = 5;
        String students[] = new String[arraySize];

            // initialize the array
        String [] stds = {"John Doe", "Mirela"};
        int len = stds.length;
       System.out.printf("The length of the initialized array is %d.", len);
       System.out.println();

        //copy the array into another, change the value in one of then, it should update both arrays
        int [] integers = {1, 2, 3};
        int [] integersCopy = integers;
        System.out.println("Copied array is ...");
        System.out.println(Arrays.toString(integersCopy));
            // modify 2 to 0 in integerCopy array and then print out original array
        integersCopy[1] = 0;  // this gets update in original array as well
        System.out.println(Arrays.toString(integersCopy)); 
        // now print out the original array
        System.out.println(Arrays.toString(integers));


        // Invoke partillyFilledMethod
        PartiallyFilledArrays array = new PartiallyFilledArrays();
        array.partiallyFilledArrays();
        // invoke countNumberOfElmensInArray method
        // array.countNumberOfElmensInArray();

        // ArrayMethod class invocation
        int resultantArray[] = ArrayMethods.arrayFilling();
        System.out.println(Arrays.toString(resultantArray));
        // sum of elements
       int sum = ArrayMethods.sumOfElements();
       System.out.printf("Sum of array elements is %d", sum);
       System.out.println();

    //    average method
    ArrayMethods arrayMethod = new ArrayMethods();
    System.out.println("The average is ... ");
    System.out.printf("The average from protected method is %d", arrayMethod.average());
    System.out.println("\n");

    // maxValue method
    int arr4[] = {2, 4, 1, 8, 6};
    System.out.println(arrayMethod.maxValue(arr4));

    // minVal method
    double[] values = {1.2, 2.4, 3.8};
    System.out.println(arrayMethod.minValue(values));

    }
}
