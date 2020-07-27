package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	//it is similar to hashmap but synchronized
    //stores the values in basis on key and value pair
	//key  --object --hashcode --value
	//does not contains duplicate, allows only unique
    //no null key or null value allowed
		Hashtable<Integer, String> htb = new Hashtable<Integer, String>();
		htb.put(1, "Java");
		htb.put(2, "Selenium");
		htb.put(3, "REST");
		htb.put(4, "SQL");
		htb.put(5, "Jenkins");
		System.out.println(htb);
		
		//creating shallow copy/cloning of hashtable
		Hashtable<Integer,String> htb1 = new Hashtable<Integer,String>();
		htb1 = (Hashtable<Integer,String>)htb.clone();
		System.out.println(htb1);
		
		//clear element from hasbtable but the cloned conetnt will not be removed
		
		htb.clear();
		System.out.println(htb);
		System.out.println(htb1);
		
		//contains method check
		Hashtable<Integer,String> cont = new Hashtable<Integer,String>();
		cont.put(1, "Chethan");
		cont.put(2, "Rashmi");
		cont.put(3, "Avyakkth");
		cont.put(4, "Vibha");
		cont.put(5, "Prabudha");
		cont.put(5, "Prabudha"); //duplicate value not allowed
		System.out.println("The duplicate value not allowed" + cont);	
		//cont.put(6, null); //null value not allowed
		
		if(cont.containsValue("Chethan")){
			System.out.println("The value found");
		}
		//print the values from hashtable using Enumaration method
		Enumeration e = cont.elements();
		
		//to print the values sequentionaly in while loop using "hasMoreElementMethod"
		System.out.println("Print value using Enumeration");
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
	//get all the values of Hashtable using entry set method
	System.out.println("Print value using Entryset");
		Set st =cont.entrySet();
		System.out.println(st);
		for(Entry<Integer, String> st1 : cont.entrySet()){
			System.out.println(st1.getKey() + " " + st1.getValue());
		}
		
		System.out.println(cont.get(1));
		
		//get the hashcode of the hashtable object
		System.out.println("The hashCode of Hashtable is : " + cont.hashCode());
		
	}
	
	//get the values using getkey method 
}
