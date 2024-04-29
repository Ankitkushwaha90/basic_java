// Java program to read data of various types 
// using Scanner class.
import java.util.Scanner;

// Driver Class
public class ScannerDemo1 {
	// main function
	public static void main(String[] args)
	{
		// Declare the object and initialize with
		// predefined standard input object
		Scanner sc = new Scanner(System.in);


        System.out.println("What is your name:");
		// String input
		String name = sc.nextLine();


        System.out.println("What is your gender:");
		// Character input
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.

        System.out.println("What is your age:");
		int age = sc.nextInt();


        System.out.println("What is your mobileno:");
		long mobileNo = sc.nextLong();

        System.out.println("What is your cgpa:");
		double cgpa = sc.nextDouble();

		// Print the values to check if the input was
		// correctly obtained.
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
	}
}
