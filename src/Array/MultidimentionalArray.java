package Array;

public class MultidimentionalArray {

	//a[row][coloumn]
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int a[][]=new int [2][3];
	
	a[0][0]=2;
	a[0][1]=5;
	a[0][2]=7;
	
	a[1][0]=3;
	a[1][1]=8;
	a[1][2]=9;
	
	
	
	int b[][]={{2,5,7},{3,8,9}}; //second way of declaring mul. Dim. array 
	
	
	//System.out.println(a[0][1]);
	//System.out.println(b[1][2]);
	
	for(int i=0;i<2;i++) {
		
		for(int j=0;j<3;j++) {
			
			
			System.out.print(b[i][j]);
			//System.out.println("\t");
			
		}
		
		
		
		
	}
	
	
	
	
}	
	
}


