package session11;

public class Counter {
	
	//int count = 0; // non static variable, will get memory everytime object of the class is created
	
	static int count = 0; //  memory  will be allocated only once
	Counter() //constructor without parameter
	{
		count++; //increment by 1, it's retain its value
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
	}

}
