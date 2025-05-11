package session05;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare and initialization
		/*
		 * int[] roll = new int[5];
		 * 
		 * roll[0]=12; //1st element roll[1]=13; //2nd element roll[2]=14; //3rd element
		 * roll[3]=15; //4th element roll[4]=16; //5th element
		 */		
		
		int[] roll = {12,13,14,15,16};
		//print the length of array
		System.out.println("Length of array:" + roll.length);
		
		//read value from array
		System.out.println("value of 4th element:" + roll[3]);
		
		//read all the value of roll array
		for(int i=0;i<roll.length;i++)
		{
			System.out.println("List of array:" + roll[i]);
		}
		



	}

}
