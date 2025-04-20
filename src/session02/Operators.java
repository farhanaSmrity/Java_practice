package session02;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int b = 10;
		 System.out.println(a+b);
		 System.out.println(b-a);
		 System.out.println(a*b);
		 System.out.println(b/a);
		 System.out.println(b%a);
		 
		 System.out.println("...............incremental operation..............");
		// System.out.println(++a);
		 System.out.println(a++);
		 System.out.println(a);
		 
		 System.out.println(".................Relational operation....................");
		 System.out.println(a==b);//false
		 System.out.println(a!=b);//true
		 System.out.println(a>b); //false
		 System.out.println(a<b); //true
		 System.out.println(a>=b);//false
		 System.out.println(a<=b);//true
		 
		 
		 System.out.println("...................logical operation....................");
		 
		 boolean x = true;
		 boolean y = false;
		 
		 System.out.println(x&&y);//false
		 System.out.println(x||y);//true
		 System.out.println(!x);//false
		 System.out.println(!y);//true
		 
		 System.out.println(".................conditional operation..................");
		 int minimum = a<b? a:b;
		 System.out.println(minimum);
	}

}
