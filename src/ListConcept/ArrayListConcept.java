package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Arraylist is dynamic array
		//size not fixed
		//duplicate values allowed
		//allow to select random value from list
		//<Integer> is called generics, in arraylist we will specify which data type of array list it is
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(10);
		ar.add(30);
		System.out.println(ar.get(4));
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		//user defiend class object values using constructor
		Employee e1 = new Employee(35, "Chethan", "QA");
		Employee e2 = new Employee(36, "Nagesh", "QC");
		Employee e3 = new Employee(37, "Mdhu", "QE");
		
		ArrayList<Employee> arcls = new ArrayList<Employee>();
		arcls.add(e1);
		arcls.add(e2);
		arcls.add(e3);
		
		Iterator<Employee> it = arcls.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println("**************");
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println(emp.name);
		}
	}

}
