package session08;

public class Students {
	
		//instance variable
			String name;
			int rollno;
			
		// method to insert record
			void insertRecord(String studentName, int studentRollno)
			{
				name = studentName;
				rollno = studentRollno;
			}

		//methods
			void displayInformation()
			{
				//code to be executed
				System.out.println("display name: " + name);
				System.out.println("display rollno: " + rollno);
			}
			
	

}
