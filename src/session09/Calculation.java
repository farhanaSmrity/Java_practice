package session09;

public class Calculation {
	
	//modifiyer returetype methodName (parameter list)
	//{
		//method body
	//}
	
	//static method
    static int sum(int a,int b)
	{
		//System.out.println("sum value a & b :" + (a+b));
    	return (a+b);
	}
    
    static int minimum (int a, int b)
    {
    	if(a<b)
    		return a;
    	else 
    		return b;
    }
	
	//non static method
	 void printMessage()
		{
			System.out.println("welcome home");
		}
	 

	//entry point of application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Calculation callObject = new Calculation();
		callObject.printMessage();
		
		int result = sum(5,6); // 5,6 arguments passed to sum method
		System.out.println("sum value a & b : " + result);
		
		System.out.println("mininum value : " + minimum(5,6));
		
	}

}
