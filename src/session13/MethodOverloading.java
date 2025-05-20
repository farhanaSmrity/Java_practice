package session13;

public class MethodOverloading {
	
	void add(int a, int b)//1
	{
		System.out.println("1:" + (a+b));
	}
	
	void add(double a, double b)//2
	{
		System.out.println("2:" + (a+b));
	}
	
	void add(int a, double b)//3
	{
		System.out.println("3:" + (a+b));
	}
	
	void add(int a, int b, int c)//4
	{
		System.out.println("4:" + (a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MethodOverloading obj = new MethodOverloading();
		obj.add(5, 6);
		obj.add(1.9, 1.4);
		obj.add(6, 0.7);
		obj.add(12,2,3);
	}

}
