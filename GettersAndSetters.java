class Getters{
    // class to get values
    String name;
    String getName(String myName){
        return myName;
    }

    String getLastName(String myName){
        this.name = myName;
        return this.name;
    }
}


class Setters{
    // class to set up or update values
    // setters do not return any values, they just set(update) values

    String name;
    void setName(String newName){
        // setter does not return any value
        this.name = newName;
    }
}

// Main class to run this program 
public class GettersAndSetters {
    public static void main(String []args){
        System.out.println("Getters and setters in java ...");

        // instantiate Getters class
        Getters getter = new Getters();
        System.out.println(getter.getName("Nabin"));

        // invoke lastName method
        String lastName = getter.getLastName("Niroula");
        System.out.printf("Last name is %s ", lastName);
        System.out.println();

        // setter classs instantiation
        Setters setter = new Setters();
        setter.setName("Prinsha"); // updates new name here
        System.out.printf("New name is now %s ", setter.name);
        System.out.println();
    }
}
