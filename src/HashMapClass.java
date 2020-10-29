import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map:A map is a object that maps keys to values.Map cannot contain duplicate keys.
Below are main Implementations of Map Interface
HashMap
TreeMap
LinkedHashMap
*/


public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> Hm = new HashMap<Integer, String>();
		
		Hm.put(0, "Spec");
		Hm.put(1, "NHS");
		Hm.put(2, "LN");
		Hm.put(3, "AOSS");
		
		Hm.put(null, "Homeaway");
		
		Hm.put(4, "");
	System.out.println(Hm.get(0));
	System.out.println(Hm.get(3));
	System.out.println(Hm);

	Hm.remove(2);
	
	System.out.println(Hm);
	
	Set Sn =Hm.entrySet();  //Converting Map in to set
	Iterator It=Sn.iterator(); //Using Iterator on set
	
	while(It.hasNext()) {
		
		
		Map.Entry Mp=(Map.Entry)It.next();
		System.out.println(Mp.getKey());
		System.out.println(Mp.getValue());
		
	}
	
	
	}

}
