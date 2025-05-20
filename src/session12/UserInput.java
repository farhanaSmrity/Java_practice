package session12;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter name, age aamd salary:");
		
		// create object of scanner class
		Scanner myObj = new Scanner(System.in);
		
		String name = myObj.nextLine();
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		System.out.println("Name is : " + name + "," + " age is :" + age + "," + "salary is:" + salary);
	}

}
