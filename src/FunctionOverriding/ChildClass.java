package FunctionOverriding;


/*Function Overriding:
Unlike, Function Overloading there is no difference in functions /Methods.-Means there is no difference in the multiple fuctions created for Name,Signature,Return Type,Data Types,Parameters Passed.
Though its get overriden/suppressed for Function created in Parent Class by the Function created 
in Child Class-Local Function.
(This is mainly used in Inheritance - Parent-Child class)
*/


public class ChildClass extends ParentClass{

	
	public void ParentInfo() {    //Function Overriding.
		
									
		//If we commented  this Function here .It will run Parent Class Function
		
		System.out.println("This is from Child Class");
		
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildClass obj =new ChildClass();
		obj.ParentInfo();
		
		
		
		
	}

}
