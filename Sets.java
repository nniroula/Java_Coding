import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

// inner class
class HashSetImplementation{
    public static HashSet<String> addItems(){
        HashSet<String> hashset = new HashSet<>();
        hashset.add("Java");
        hashset.add("Python");
        hashset.add("HTML");
        return hashset;
    }

    public Set<Integer> removeElement(Set<Integer> integers){
        /** traditional for and forEach loop does not work to access middle set elements, 
         * use set iterator to loop and remove element from middle of the set 
         * You have to import Iterator(not ListIterator), java.util.Iterator
         * Use imported iterator with the set's iterator method
        */
        Iterator<Integer> iter = integers.iterator();
         
        while(iter.hasNext()){
            // System.out.println(iter.next() instanceof Integer); //check type of
            int num = iter.next();
            System.out.println(num);
        }
        // Integer num = iter.next();
        // contains method
        System.out.println(integers.contains(1));
    
        if(integers.contains(1)){
            integers.remove(1);
        }
        int size = integers.size();
        System.out.printf("The lenght of hashset is %d", size);
        System.out.println();
        System.out.printf("Is the set empty? %s",integers.isEmpty());
        System.out.println();
        // integers.clear(); // removes all elements of the set
        // integers.remove(iter.next()); // does not work
        // integers.remove(1); // does not work
        
        // for(int number: integers){
        //     integers.remove(number); // does not work
        // }
        // System.out.println(integers);
        return integers;
    }
    
    // method to print a set of strings
    public void printSet(Set<String> set){ // Set<String> type variable
        System.out.println(set);
    }

    // TreeSet implementaion, TreeSet provides natural ordering of the output. It's slow than Hashset
    public static Set<Double> treeSetImplemenation(){
        Set<Double> floatingPoints = new TreeSet<>();
        floatingPoints.add(3.5);
        floatingPoints.add(9.9);
        floatingPoints.add(0.9);
        System.out.println(floatingPoints.size());
        System.out.println(floatingPoints.contains(3.5));
        floatingPoints.remove(3.5);
        System.out.println(floatingPoints.isEmpty());
        return floatingPoints;
    }
}

/**
 * This class will implement two type of sets -> HashSet and TreeSet.
 */
public class Sets {
    
    public static void main(String [] args){
        HashSet<String> set1 = HashSetImplementation.addItems();

        HashSetImplementation setObject = new HashSetImplementation();
        setObject.printSet(set1);

        // removeElement method
        HashSet<Integer> numbs = new HashSet<>();
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        // System.out.println(numbs);
        Set<Integer> hashSet = setObject.removeElement(numbs);
        System.out.println(hashSet);

        // treeSetImplemenation static method - invoke it on its class
        Set<Double> set3 = HashSetImplementation.treeSetImplemenation();
        System.out.println(set3);

    }
    
}
