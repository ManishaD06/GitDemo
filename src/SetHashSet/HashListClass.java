package SetHashSet;

import java.util.HashSet;
import java.util.Iterator;



/* 
 Set:
 Is a collection which cannot contain duplicate elements.
However it makes no guarantees concerning order of Iteration. 
Below are the classes which Implements List Interfaces.

HashSet
LinkedSet
TreeSet
 
*/

//Does not accept duplicate values
//There is no guarantee that elements inserted are stored in Sequence, it might be saved Randomly

public class HashListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> Hs=new HashSet<String>();
		Hs.add("UK");
		Hs.add("USA");
		Hs.add("India");
		
		//If we tried to add duplicate Element, it removes the Duplicate one.It means it wont allow duplicate elements.
		
		Hs.add("India");
		System.out.println(Hs);
		
		//As it saves element randomly, indexof method not there to use on HashSet
		
		System.out.println(Hs.size());
		System.out.println(Hs.contains("UK"));
		System.out.println(Hs.remove("USA"));
		System.out.println(Hs);
		
		Hs.add("Norway");
		Hs.add("AUS");
		
		System.out.println(Hs.isEmpty());
		
		System.out.println(Hs);
		
		
		//Iterator .  We can Iterate by creating Object of Iterator on Hs
		
	   //java.util.Iterator<String> it=Hs.iterator();
	   
	   Iterator<String> Ht= Hs.iterator();
	   
	   System.out.println(Ht.next());
	   System.out.println(Ht.next());
	   
	   
	   //To Iterate all values use While Loop
	   
	  while(Ht.hasNext()){
		  
		  System.out.println(Ht.next());
		  
	  }
 			

	}

}
