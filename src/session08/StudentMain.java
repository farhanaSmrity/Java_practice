package session08;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// classname reference classname = new classname ; created a object
		Students student1 = new Students();
		Students student2 = new Students();
		
		// intialize object / store data to the object student1
		//student1.name = "farhana";
		//student1.rollno = 369;
		
		//student2.name = "sultana";
		//student2.rollno = 131;
		
		
		student1.insertRecord("Farhana",99);
		student2.insertRecord("Sultana",1);
		
		//display information
	    student1.displayInformation();
		student2.displayInformation();
		
	}

}
