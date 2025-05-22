package session17;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//		//Arithmetic exception
//		int result = 100/0;
//		}
//		
//		catch(ArithmeticException e)
//		{
//			System.out.println(e.toString());
//		}
		
//		finally()
//		{
//			
//		}
		
		//null pointer exception
//		try {
//		String s = null;
//		System.out.println(s.length());
//		}
//		
//		catch(NullPointerException e)
//		{
//			System.out.println(e.toString());
//		}
		
		
		
		//number format exception
		try {
		String s = "abc";
		int i = Integer.parseInt(s);
		System.out.println(i);
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Catch block : " + e.toString());
		}
		
		finally
		{
		System.out.println("finally block executed");
		}
		
		// array index out of bound exception
		try
		{
		int a[] = new int[5];
		a[4] = 5; // a[0] a[1] a[2] a[3] a[4]
		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch block : " + e.toString());
		}
		
		finally
		{
		System.out.println("finally block executed");
		}
		
	}

}
