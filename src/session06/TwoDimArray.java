package session06;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare and instantiate
		//int [] [] a = new int[3][2]; // 3 rows & 2 columns
		
		//insert value in array
		//a[row][col]
		//a[0][0]= 10;  // row 0, col 0
		//a[0][1]= 20; // row 0, col 1
		
		//a[1][0]= 30; // row 1, col 0
		//a[1][1]= 40; // row 1, col 1
		
		//a[2][0]= 50; // row 2, col 0
		//a[2][1]= 60; // row 2, col 1
		
		int [][] a = {{10,20},{30,40},{50,60}};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("multi array value:" + a[i][j]);
			}
		}
		
		//print size of row and column
		System.out.println("no of row:" + a.length);
		System.out.println("no of column:" + a[0].length);
		
	}

}
