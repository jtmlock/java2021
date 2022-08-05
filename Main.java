// my second Program
/* long comment */


abstract public class Main
// changing class name to MyClass and saving as MyClass to correctly use
// class saved with file name
{
	final double g = 9.81;
	final double PI = 3.14;

	public String fname = "John";
	public int age = 24;
	public abstract void study(); // abstract method

	int modelYear;
	String modelName;

	int x; // Create a class attribute

	// Create a class constructor for the Main Class
	public Main()
	{
		x = 5; // Set the inital value for the class attribute
	}

	public Main(int y)
	{
		x = y;
	}

	public Main(int year, String name)
	{
		modelYear = year;
		modelName = name;
	}

	// Main method
    public static void main(String[] args)
    {
		// myStaticMethod(); // Call the static method
		// Static methods can be called without creating objects
		//Main myCar = new Main(1696, "Mustang"); // Create an object of class Main
		//System.out.println(myCar.modelYear + " " + myCar.modelName); // Print the value of x

		// Main myCar = new Main(); // Create an object of Main
		// myObj.myPublicMethod();	// Call the public method on the object
		// myCar.fullThrottle();		// Call the fullThrottle() method
		// myCar.speed(200);			// Call the speed() method


	}

	static void myObj()
	{
		int x = 555;
		System.out.println("x = 555");
	}

  	// Create a fullThrottle() method
  	public void fullThrottle()
  	{
    	System.out.println("The car is going as fast as it can!");
  	}

  	// Create a speed() method and add a parameter
  	public void speed(int maxSpeed)
  	{
    	System.out.println("Max speed is: " + maxSpeed);
  	}

	// Public Method
	public void myPublicMethod()
	{
		System.out.println("Public methods must be called by creating objects");
		System.out.println();
	}

	// Static Method
	static void myStaticMethod()
	{
		System.out.println();
		System.out.println("Static methods can be called without creating objects");
		System.out.println();

        System.out.println("Hello, World!");
        System.out.println();
        System.out.println(3 + 3);

        System.out.print("Hello World! ");
		System.out.print("I will print on the same line.");

		System.out.println();

        System.out.println("q");

		// String - stores text, such as "Hello". String values are surrounded by double quotes
        String name = "John";
        System.out.print("print String");
		System.out.println(name);

		// int - stores integers (whole numbers), without decimals, such as 123 or -123
		int myNum = 15;
		System.out.print("print int");
		System.out.println(myNum);

		int testNum;
		testNum = 15;
		System.out.println("print var");
		System.out.println(testNum);

		testNum = 37; // myNum is now 37
		System.out.println("change and print var");
		System.out.println(testNum);

		int myNewNum = 5;
		System.out.println("change and print var");
		System.out.println(testNum);


		float myFloatNum = 5.99f;
		System.out.println(myFloatNum);

		// float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		float myLongFloatNum = 5.998877665544332211001f;
		// prints 5.9988775
		System.out.println(myLongFloatNum);

		// char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		char myLetter = 'D';
		System.out.println(myLetter);

		// boolean - stores values with two states: true or false
		boolean myBool = true;
		System.out.println(myBool);
		String myText = "Hello";
		System.out.println(testNum);

		System.out.println();
		System.out.println("Static methods can be called without creating objects");
		System.out.println();
    }
}

class Student extends Main
{
	public int graduationYear = 2018;

	public void study()
	{
		// the body of the abstract method is provided
		System.out.println("Studying all day long");
	}
}