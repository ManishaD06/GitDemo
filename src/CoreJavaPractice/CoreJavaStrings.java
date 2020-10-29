package CoreJavaPractice;

public class CoreJavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="Manisha";
	
	
	System.out.println(str.charAt(1));
	System.out.println(str.indexOf("n"));
	System.out.println(str.intern());
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	System.out.println(str.length());
	System.out.println(str.trim());
	System.out.println(str.replace('M', 'T'));
	System.out.println(str.concat("Desai"));


	//String Reverse
	
	String name="Ritesh";
	String newname = "" ;
	
	for (int i=name.length()-1;i>=0;i--)
	{
		newname=newname+name.charAt(i);
				
	}
	
	System.out.println(name +"     " +newname);
	
	
	if(name==newname) {
		
		System.out.println("It is palindrome");
		
	}
	
	else
	{	
		System.out.println("It is not palindrome");
	
	}
	
	
	}
}
