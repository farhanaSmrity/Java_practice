package session11;

public class Student2 {
	
	int roll;  //non static variables 
	String studentName; //non static variables
	static String collageName= "Simla collage"; //static
	
	Student2(int rollNo, String stName)
	{
		roll = rollNo;
		studentName = stName;
	}

	void display()
	{
		System.out.println(roll + "," + studentName + "," + collageName);
	}
	
	static void changeValue()
	{
		collageName= "siddheshowri girls collage";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 obj1 = new Student2(99,"Farhana");
		Student2 obj2 = new Student2(100,"Sultana");
		
		obj1.display();
		obj2.display();
		changeValue();
		
		System.out.println("after collage name change");
		
		obj1.display();
		obj2.display();
	}

}
