package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		//Hashmap is a class which extends Map interface
		//extends AbstractMap
		//it contains only unique elements
		//stores the elements in key -- value format
		//it may have one null key and multiple null values
		//it maintains no order
		//it is not synchronized
		//concurrent fail exception --Fail fast condition
		//The entryset is used to iterate the Hashmap
		
		HashMap<Integer, String> hmp = new HashMap<Integer, String>();
		hmp.put(1, "SElenium");
		hmp.put(2, "Cypress");
		hmp.put(3, "QTP");
		System.out.println(hmp);
		
		System.out.println(hmp.get(2));
		
		for(Entry<Integer, String> mp : hmp.entrySet()){
			System.out.println("{" +mp.getKey() + "," + mp.getValue()+ "}");
		}
		
		Employee e1= new Employee(25, "Chethan", "QA");
		Employee e2= new Employee(24, "Nagesh", "DB");
		Employee e3= new Employee(26, "Madhu", "Manager");
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
				
		for(Entry<Integer, Employee> val : emp.entrySet()){
			int key = val.getKey();
			Employee e = val.getValue();
			System.out.println(key + " Info");
			System.out.println(e.age +" "+ e.name +" "+ e.dept);
			
		}
		
		
	}

}
