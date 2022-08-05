import java.util.Scanner;

public class Person
{
	private String name; // private = restricted access

	// Getter
	public String getName()
	{
		return name;
	}

	// Setter
	public void setName(String newName)
	{
		this.name = newName;
	}



	public static void main(String[] args)
	{
		Person myObj = new Person();
		myObj.setName("John");
		System.out.println(myObj.getName());

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username");

		String userName = myObj.nextLine();
    	System.out.println("Username is: " + userName);
	}
}
