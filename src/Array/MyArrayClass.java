package Array;



/* .Array:It is container which store multiple values of same Data Type
Single Dimensional Array
int a[]=new int[5]; //declares array and allocate memory to variable
a[0]=5; //initialized values into array
for(i=0;i<a.length;i++){}//retrieving array values

*/


public class MyArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]=new int[5];
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;  */
		
		int a[]= {5,10,15,20,25};
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		
	}

}
