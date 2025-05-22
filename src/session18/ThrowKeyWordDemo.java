package session18;

public class ThrowKeyWordDemo {
	
	static void checkAge(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException ("Access Denied - Age must be atleast 18 years");
		}
		else 
		{
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		checkAge(16);
		}
		catch(Exception e)
		{
			System.out.println("Catch block : " + e.toString());
		}
		
		System.out.println("rest of the code...............");
	}

}
