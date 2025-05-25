package session19;

interface showDisplay
{
	void showDetails(String name, int age); //methods are abstract
	int a = 0; //static or final
}

interface showName
{
	void ShowName(String name); //methods are abstract
	
}

interface showAge
{
	void ShowAge(String name); //methods are abstract
	
}

public class InterfaceDemo implements showName,showAge {

	public void ShowName(String name)
	{
		System.out.println("name: " + name);
		
	}
	
	public void ShowAge(int age)
	{
		System.out.println("age: "+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo obj = new InterfaceDemo();
		obj.ShowName("Smrity");
		obj.ShowAge(15);
	}

}
