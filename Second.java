class Second {
  public static void main(String[] args)
  {
		Student myObj = new Student();

		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		System.out.println("Graduation Year: " + myObj.graduationYear);

		myObj.study(); // call abstract method

    	// Main myCar = new Main();     // Create a myCar object
    	// myCar.fullThrottle();      // Call the fullThrottle() method
	    // myCar.speed(200);          // Call the speed() method
  }
}