package session19;

public abstract class BikeClass {
	
	//constructor
	BikeClass()
	{
		System.out.println("Bike class created");
	}
	
	//create abstract method, it does not have body
	abstract void run();
	
	//create non-abstract methods
	 void start()
	{
		System.out.println("Bike started.........");
	}
	
	void stop()
	{
		System.out.println("Bike stop.........");
	

}
}
