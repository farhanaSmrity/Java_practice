package session14;

class parant
{
	int a;
	void displayParant()
	{
		System.out.println("Class parant:" + a);
	}
}

class child1 extends parant 
{
	int b;
	void displayChild1()
	{
		System.out.println("Class child1:" + b );
	}
}

class child2 extends parant
{
	int c;
	void displayChild2()
	{
		System.out.println("Class child2:" + c );
	}
}

public class hierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parant objA = new parant();
		objA.a = 14;
		objA.displayParant();

		child1 objB = new child1();
		objB.a = 6; 
		objB.b = 12; 
		objB.displayParant(); 
		objB.displayChild1(); 
		
		child2 objC = new child2();
		objC.a=20; 
		objC.c=7; 
		objC.displayParant();
		objC.displayChild2();

	}

}
