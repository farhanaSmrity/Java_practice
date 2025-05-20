package session13;

public class MainMethodLoading {
	
	void main (int a)
	{
		System.out.println("a:" + a);
	}

	void main (double a)
	{
		System.out.println("a:" + a);
	} 
	
	void main (int a, int b)
	{
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainMethodLoading obj = new MainMethodLoading();
		obj.main(6);
		obj.main(2.5);
		obj.main(5, 6);

	}

}
