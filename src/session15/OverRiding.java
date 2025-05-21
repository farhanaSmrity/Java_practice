package session15;

class Bank //Parent
{
	double getRateOfInterest()
	{
		return 0.0;
		
	}
}

class axis extends Bank //child1 , method overridden: method definition is same as parent class
{
	double getRateOfInterest()
	{
		//change body
		return 1.4;
		
	}
}

class brac extends Bank //child2
{
	double getRateOfInterest()
	{
		//change body
		return 0.7;
		
	}
}


public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		axis objA = new axis();
		System.out.println(objA.getRateOfInterest());
		
		brac objB = new brac();
		System.out.println(objB.getRateOfInterest());

	}

}
