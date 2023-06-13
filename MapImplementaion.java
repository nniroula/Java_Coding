import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;

class HashMaps{
    public Map<Integer, String> addElementsToMap(){
        Map<Integer, String> newMap = new HashMap<>();
        newMap.put(1, "Java");
        newMap.put(2, "Python");
        newMap.put(3, "JavaScript");
        newMap.put(4, "HTML");
        System.out.println(newMap);

        // update html with CSS
        newMap.put(4, "CSS");
        System.out.println(newMap);

        // replace CSS with null
        newMap.replace(4, null);
        System.out.println(newMap);

        // get the values
        String value1 = newMap.get(1);
        System.out.println(value1);

        // put if absent - if key is not present, adds element to the map
        newMap.putIfAbsent(5, "C++");
        newMap.putIfAbsent(1, "No Coding"); // does not add anything b/c key alredy exist

        // get all keys
        Set<Integer> keys = newMap.keySet(); // in the form of set
        System.out.println("all keys are ...");
        System.out.println(keys);

        // get all values

        // remove an element
        newMap.remove(4);

        // containsKey
        boolean bool1 = newMap.containsKey(1);
        System.out.println(bool1);
        // containsValue
        boolean bool2 = newMap.containsValue("C++");
        System.out.println(bool2);
        int size = newMap.size();
        System.out.printf("Size of the map is %d", size);
        System.out.println();

        // is empty
        boolean empty = newMap.isEmpty();
        System.out.printf("Is the map empty? %s", empty);
        System.out.println();

        return newMap;
    }

}

public class MapImplementaion {
    public static void main(String[] args){
        // instantiate the Maps class
        HashMaps map = new HashMaps();

        // addElementsToMap method invocation
        Map<Integer, String> hashmap = map.addElementsToMap();
        System.out.println(hashmap);

        // TreeMaps class
        TreeMaps treeMaps = new TreeMaps();
        Map<String, String> result = treeMaps.treeMapElement();
        System.out.println(result);
    }
}
/**
 * TreeMap gives natural ordering of the output elements.
 */
class TreeMaps{
    public Map<String, String> treeMapElement(){
        Map<String, String> treeMaps = new TreeMap<>();
        treeMaps.put("Backend", "Java");
        treeMaps.put("Framework2", "ReactJS");
        treeMaps.put("Frontend", "JavaScript");
        treeMaps.put("Framework1", "SpringBoot");

        return treeMaps;
    }
}
