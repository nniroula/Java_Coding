class Getters{
    String name;
    String getName(String myName){
        return myName;
    }

    String getLastName(String myName){
        this.name = myName;
        return this.name;
    }

    // setters do not return any values, they just set(update) values
    void setName(){

    }

}

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
      
    }
}
