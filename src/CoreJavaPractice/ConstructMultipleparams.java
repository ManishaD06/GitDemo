package CoreJavaPractice;

public class ConstructMultipleparams {

	String name ;
	int age ;
	
	public ConstructMultipleparams(String fname, int stuage) {
		
		name=fname;
		age=stuage;
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructMultipleparams obj =new ConstructMultipleparams("Shri", 30);
		System.out.println(obj.name + "  " +obj.age);
		
	}

}
