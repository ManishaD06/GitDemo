package CoreJavaPractice;

public class CoreJavaMethods {

	static int a=4;
	
	//Methods must be created in Class , not in main Method
	
	
	static int myMethod(int x,int y) {
		
		System.out.println("First Method");
		return x+y;
	}
	
	
	//passing integer parameter to method.Here a is parameter and the value passed for this parameter from method is called as Argument
	
	static void myparamMethod(int a) {
		
		System.out.println(a);
		
		
	}
	
	
	//passing string parameter to method.
	
	
	static void mystringMethod(String str) {
		
		System.out.println(str);
	
		
	}
	
	
	//passing multiple parameters to method
	
	static void multipleparams(String str, int age) {
		
		System.out.println(str +  " "  + age);
	
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int z = myMethod(5,15);//static methods can be called directly without creating class object
		System.out.println(z);
		
		myparamMethod(10);  //10 is the argument
		mystringMethod("Manisha") ; 
		multipleparams("Ritesh is", 15);
		System.out.println(a);
		System.out.println("NHS");
		
		
	}

}
