package FunctionOverloading;



/*If in a same class there are multiple methods/Functions with same name then we can say it is Function Overloading
only we need to take care about it follows below cndn
1.Either Arguments Count should be different which are passed to method
2.OR Argument Data Type should be different */


public class MyClassOverloading {
	
////Below methods are having different no. of arguments  1, 2	
	
	public void accessData(int a) {
		
		System.out.println(a);
	}
	
	public void accessData(int a, int b) {
		
		
		System.out.println(a+"   "+b);
	}
	
	//Below methods are having different no. of arguments  1, 2
	
	public void getData(int a) {
		
		System.out.println(a);
	}
	
	public void getData(int a, String b) {
		
		
		System.out.println(a +"   "+b);
	}
	
	//Having different argument type int, str
	
	public void storeData(int b) {
		
		System.out.println(b);	
	}
	
		
	public void storeData(String str) {
		
	System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyClassOverloading obj = new MyClassOverloading();
		
		obj.accessData(5);
		obj.accessData(10, 200);
		
		
		obj.getData(30);
		obj.getData(40, "Manisha");
		
		
		obj.storeData(100);
		obj.storeData("NHS");
	}

}
