package session19;

public class TestAbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BikeClass obj = new TVS();
		obj.start(); //non abstract method
		obj.run(); // abstract method
		obj.stop(); //non abstract method
		
		BikeClass obj1 = new Yamaha();
		obj1.start(); //non abstract method
		obj1.run(); // abstract method
		obj1.stop(); //non abstract method
		
		BikeClass obj2 = new Honda();
		obj2.start(); //non abstract method
		obj2.run(); // abstract method
		obj2.stop(); //non abstract method

	}

}
