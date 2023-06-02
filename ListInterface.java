
import java.util.ArrayList;
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
        for(String entryInal: al){
            if(entryInal == str){
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
}


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

    }
    
}