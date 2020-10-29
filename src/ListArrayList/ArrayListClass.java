package ListArrayList;

import java.util.ArrayList;

//In ArrayList , no need to create For Loop to retrieve entire Array List , which required for Array
/*
 * List is an ordered collection(Sometimes called Sequence)List may contain duplicate numbers/elements.
Below Classes implement List Interface.
ArrayList
LinkedList
Vector
*/

//Array:Follow Sequence : Like it allow to add no only by sequence
//ArrayList:We can add elements anywhere.It is Dynamic.

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer ArrayList
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(39);
		a.add(0, 80); // we can add element at any index , which is having already any value
		
		System.out.println(a.get(2));    //Retrieves value of Index 2
		System.out.println(a.indexOf(80)); // Get index of any element by the element 
		System.out.println(a);
		a.remove(2); //Remove Element
		System.out.println(a);
		
		
		//String ArrayList
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("Manisha");
		str.add("Rucha");
		str.add("Nidhi");
		str.add(3, "Ritesh");
		str.add("Ritesh");  //It allows to add Duplicate Element
		System.out.println(str);
	    System.out.println(str.get(2));
		System.out.println(str.indexOf("Ritesh"));
		System.out.println(str.contains("Rucha"));
		str.remove("Rucha");
		System.out.println(str);
		str.remove(0);
		System.out.println(str);
		System.out.println(str.size());
		str.removeAll(str);              //Remove all ArrayValues
		System.out.println(str);
		
		System.out.println(str.isEmpty());
		
		
		
	}
		
	

}
