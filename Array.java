import java.util.Arrays;

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
    }

  
}
