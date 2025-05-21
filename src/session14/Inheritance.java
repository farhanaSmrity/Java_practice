package session14;

class A //parent class
{
	int a;
	void display()
	{
		System.out.println("Class A:" + a);
	}
}

class B extends A // child
{
	int b;
	void print()
	{
		System.out.println("Class B:" + b );
	}
}

class C extends B
{
	int c;
	void printC()
	{
		System.out.println("Class C:" + c );
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A objA = new A();
		objA.a = 10;
		objA.display();

		B objB = new B();
		objB.a = 6; //class A
		objB.b = 12; //class B
		objB.display(); //class A
		objB.print(); //class B
		
		C objC = new C();
		objC.a=20; //class A
		objC.b=14; //class B
		objC.c=7; //class C
		objC.display(); //class A
		objC.print(); //class B
		objC.printC(); //class C
	}

}
