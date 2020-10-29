package MyInheritance;


 class Car{
	 
	 int i=20;
	 private String Name = "DreamCar";
	 protected int myNum =200;
	 
	 public void color() {
		 
		 System.out.println("Mustard");
		 
	 }
	 
	 
	 public void Brand() {
		 
		 System.out.println("Mercedez");
		 
	 }
	 
 }

    

public class Vehicle extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Accessing all methods , attributes(except Private) - by creating Child Class Object by inheriting Parent Class with Keyword Extend)*/
		
		Vehicle vl=new Vehicle();
		vl.Brand();
		vl.color();
		System.out.println(vl.i);
		System.out.println(vl.myNum);
		
		
		
		
		/* Accessing all methods , attributes(except Private - by creating parent Class Object)
		Car cr =new Car();
		System.out.println(cr.myNum);
		System.out.println(cr.i);
		cr.Brand();
		cr.color();
		
		*/
		
		
		
	}

}
