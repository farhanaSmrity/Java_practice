package session11;

public class Students {
	
	//class variables
	int roll;  //non static variables 
	String studentName; //non static variables
	static String collageName= "Bharti collage"; //static variables memory allocated only once during class loading

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students student1 = new Students();
		student1.studentName = "Smrity";
		student1.roll = 369;
		
		System.out.println(student1.studentName + "," + student1.roll + "," + student1.collageName);

		Students student2 = new Students();
		student2.studentName = "Shompa";
		student2.roll = 131;
		
		System.out.println(student2.studentName + "," + student2.roll + "," + student2.collageName);
	}

}
