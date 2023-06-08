
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Use List interface
 * implement ArrayList, LinkedList, Stack, and Vector
 */


/** 1.  ArrayList, also using List */
class ArrayListImplementation{
    // array list delcaration
    public void arrayList(){
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("Nabin");
        arrayList.add("Joe Biden");
        arrayList.add("Kamala Harrish");
        System.out.println(arrayList);

        // arraylist declarations and initializations
        ArrayList<String> StringAl = new ArrayList<>();
        ArrayList<Double> doubleAl = new ArrayList<>();
        List<Float> floatAl = new ArrayList<>();
        ArrayList<Boolean> booleanAl = new ArrayList<>();
        ArrayList<Integer> integerAl = new ArrayList<>();
        ArrayList<Character> characterAl = new ArrayList<>();
        ArrayList<Byte> byteAl = new ArrayList<>();
        ArrayList<Short> shortAl = new ArrayList<>();
        ArrayList<Long> longAl = new ArrayList<>();
    }

    // array list functions
    // Arraylist must be parameterized means you must have diamond operator used
    public ArrayList<Integer> addElemsToArrayList(){
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(5);
        ar.add(9);
        return ar;
    }

    // remove arraylist elements
    public List<Integer> removeArrayListElement(){
        /** First way to declare */
        // List<Integer> al = new ArrayList<>();
        /** Second way to delcare */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(6);
        al.add(40);

        al.remove(1); // removes element at index 1
        al.remove(Integer.valueOf(40)); // removes the value 40 from arrayList

        return al;
    }

    // access and update arraylist elements
    public ArrayList<String> accessAndUpdateElems(){
        ArrayList<String> str = new ArrayList<>();
        str.add("Nabin");
        str.add("pabitra");
        // insert value at index 0
        str.add(0, "John Doe");
        
        // update the value at index 1(Nabin). Change Nabin to Donald Trump
        str.set(1, "Donald Trump");

        // access values
        String val1 = str.get(0);
        System.out.printf("Retrieved value from array list is %s.", val1);
        System.out.println();

        // for loop and forEach(Enhanced for loop) to access array list values
        System.out.println("Traditional for loop in action ...");
        for(int i = 0; i < str.size(); i++){
            System.out.println(str.get(i));
        }
        System.out.println("Done traditional for loop *** ");

        System.out.println("ForEach loop on fire ...");
        for(String entry: str){
            System.out.println(entry);
        }
        System.out.println("ForEach loop DONE ***");

        return str;
    }

    // check if arraylist contains an element, pass arraylist as parameter
    public boolean checkElemInArrayList(String str, ArrayList<String> al){
        // traditional for loop
        /** 
        for(int i = 0; i<al.size(); i++){
            if(al.get(i) == str){
                return true;
            }
        }
        */

        // forEach loop
        for(String entryInAl: al){
            if(entryInAl == str){
                return true;
            }
        }
        
        // array list contains method
        /** 
        if(al.contains(str)){
            return true;
        }
        */
        return false;
    }

    // arrayList as a parameter to the function
    public ArrayList<String> alParameterizedFunc(ArrayList<String> names){
        // ArrayList<String> languages = new ArrayList<>();
        names.set(0, "COBALT");
        for(String element: names){
            System.out.println(element);
            
        }

        return names;
    }

    // array list as parameter to a function
    public int[] convertArrayListToArray(ArrayList<Integer> integers){

        int [] arr1 = new int[integers.size()];
        for(int i =0; i< arr1.length; i++){
            arr1[i] = integers.get(i);
        }
        return arr1;
    }

}


/** It is the main class that implements other classes in this file */
public class ListInterface{
    public static void main(String[]args){
        ArrayListImplementation arrayList = new ArrayListImplementation();
        // arrayList.arrayList();
        arrayList.arrayList();

        // store result in a variable and display it
        //   System.out.println(arrayList.addElemsToArrayList());
        ArrayList<Integer> intAL =  arrayList.addElemsToArrayList();
        System.out.println(intAL);

        // remove method for arraylist implementation
        List<Integer> list1 = arrayList.removeArrayListElement();
        System.out.println(list1);

        // access and update arraylist elements method
        ArrayList<String> str1 = arrayList.accessAndUpdateElems();
        System.out.println(str1);

        // check elem in array list function
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("CU Denver");
        arrayList1.add("MSU Denver");
        arrayList1.add("CCA");

        boolean result1 = arrayList.checkElemInArrayList("CCA", arrayList1);
        System.out.println(result1);
        boolean result2 = arrayList.checkElemInArrayList("Spring Board", arrayList1); // false
        System.out.println(result2);

        // alParameterizedFunc call
        ArrayList<String> langs = new ArrayList<>();
        langs.add("Java");
        langs.add(0, "HTML");
        langs.add("Python");
        langs.add("JS");

        ArrayList<String> list = arrayList.alParameterizedFunc(langs);
        System.out.println(list);
        System.out.printf("The size of array list is %d.",list.size());
        System.out.println();

        // convertArrayListToArray method invocation
        ArrayList<Integer> alIntegers = new ArrayList<>();
        alIntegers.add(1);
        alIntegers.add(12);
        alIntegers.add(24);
        int [] numbers = arrayList.convertArrayListToArray(alIntegers);
        System.out.println(Arrays.toString(numbers));

    }
    
}