// create a class and use it inside public class
/*
In java, you can have only one high level public class, but can have any number of classes
Create a class, instantiate it inside main function of public and add data to the class variable & more
 */

 class Language{
	// variables
	String name;
	String backendFrameWork;
	String packageManger;

	// methods -> methods are called subroutines in java as well
	// returnType methodName(parameter1, parameter2, ..){}
	void displayName(){
		System.out.println(name);
	}
	String displayFrameWork() {
		return this.backendFrameWork;
	}

} // end of Language class

public class OOPConcepts {
	public static void main(String[] args){
		System.out.println("Hey all, Learn OOP with Nabin");

		// instantiate Language class

		// Object 1
		Language codingLanguage1 = new Language();

		codingLanguage1.name = "JavaScript";
		codingLanguage1.backendFrameWork = "ExpressJS";
		codingLanguage1.packageManger = "NPM";

		System.out.println(codingLanguage1); // this does not work coz it's an object.
		// Is there a way to print object in java?
		// add spaces before displaying object data
		System.out.println();

		System.out.printf("Language: %s", codingLanguage1.name);
		System.out.println();
		System.out.printf("Backend framework: %s", codingLanguage1.backendFrameWork);
		System.out.println();
		System.out.printf("Package Manger: %s", codingLanguage1.packageManger);

		// call method on this object
		System.out.println();
		System.out.println();
		System.out.println("Displaying language name .....");
		codingLanguage1.displayName();

		// add space between two objects for display purpose
		System.out.println();
		System.out.println();

		// Object 2
		Language codingLanguage2 = new Language();
		codingLanguage2.name = "Python";
		codingLanguage2.backendFrameWork = "Flask";
		codingLanguage2.packageManger = "Pip";
		System.out.printf("Language: %s", codingLanguage2.name);
		System.out.println();
		System.out.printf("Backend framework: %s", codingLanguage2.backendFrameWork);
		System.out.println();
		System.out.printf("Package Manager: %s", codingLanguage2.packageManger);

		// call method on this object
		System.out.println();
		System.out.println();
		System.out.printf("Framework of language 2 is %s", codingLanguage2.displayFrameWork());

	} // end of main method
} // end of OOPConcepts class
