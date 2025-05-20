package session13;

public class ConstructorOverloading {

	
	ConstructorOverloading(int a)
	{
		System.out.println(a);
	}
	
	ConstructorOverloading(double a)
	{
		System.out.println(a);
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorOverloading obj1 = new ConstructorOverloading(6);
		ConstructorOverloading obj2 = new ConstructorOverloading(6.5);
		ConstructorOverloading obj3 = new ConstructorOverloading(6,6);
	}

}
