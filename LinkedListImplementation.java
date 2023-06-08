import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListPractice{
    public LinkedList<String> addElements(){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Java");
        list.addLast("JS");

        // to add to the middle of the linkedList, use listIterator method of linkedList on ListIterator class
        //ListIterator<String> iterator = new ListIterator<String>(); // does not work
        ListIterator<String> iterator = list.listIterator();
        // next() returns next item or exception. hasNext() returns boolean
        System.out.println(iterator.next()); // forwards pointer past next item in the list.
        System.out.println(iterator.next());
   
        System.out.println(list);
        System.out.println("While loop starts ... ");
        while(iterator.hasNext()){
            System.out.println(iterator.next()); // this time, iterator is at the end and prints nothing.
        }
        System.out.println("While loop ends ... ");

        // Now, iterator(cursor/pointer) is at the end of the list, bring it back
        iterator.previous();
        iterator.previous();
        System.out.println("Iterator/pointer is brough back to the beginning and the list elements are ...");
        while(iterator.hasNext()){
            System.out.println(iterator.next()); // this time, iterator is at the beginnig and prints list.
        }
        System.out.println("What about list here ...");
        System.out.println(list);
        System.out.println("What about pointer position at this moment...");
        System.out.println(iterator.hasNext());
        iterator.previous(); // bring cursor one node back
        iterator.previous(); // brings cursor to the beginning of the list
        // Now add item to the middle of the linkedlist
        iterator.next(); // forwards cursor past first element
        iterator.add("Python");
        // System.out.println(list);
        list.addFirst("HTML");
        list.addLast("CSS");

        // add C++ at 3rd position
        list.add(3, "C++");

        return list;
    }

    public LinkedList<Integer> removeElement(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(6);
        list.addFirst(8);
        list.addLast(12);
        list.addLast(05);

        // remove elements
        list.removeFirst();
        list.removeLast();

        //add numbers
        list.addFirst(1987);
        list.addLast(1988);
        // add elements at the middle
        list.add(2, 2014);
        list.add(2, 2021);

        // remove element from the middle of the list
        list.remove(2); // 2 = index
        list.remove(list.size() - 2);


        return list;
    }
 
}


public class LinkedListImplementation{
    public static void main(String[] args){
        LinkedListPractice list = new LinkedListPractice();
        // addElement method
        LinkedList<String> resultantList = list.addElements();
        System.out.println(resultantList);

        // removeElement method
        LinkedList<Integer> resultantList2 = list.removeElement();
        System.out.println(resultantList2);
    }
}
