package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterations {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Chethan");
		lst.add("Rashmik");
		lst.add("Avyakkth");
		lst.add("Amma");
		lst.add("Anna");
		
		//iterate using jak 1.8 lamba expresssion
		System.out.println("1. print the list using lambda forEach");
		lst.forEach(family -> {
			System.out.println(family);
		});
		
		//itrate using Iterator
		System.out.println("2. print the list using iterator");
		Iterator<String> it = lst.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	 //iterating using forEachREmaining jdk 1.8 lambda expression
		System.out.println("3. print the list using iterator lamba ");
		Iterator<String> it1 = lst.iterator();
		it1.forEachRemaining(family ->{
			System.out.println(family);
		});
		
		//iterating using for Each loop
		System.out.println("4. print the list using for each loop");
		for(String str : lst){
			System.out.println(str);
		}
		
		//iterating using for loop
				System.out.println("5. print the list using standard for loop");
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i));
		}
		
		//using listIiterator traversing in both the directions
		System.out.println("6. print the list using listIterator");
		ListIterator<String> ListIt= lst.listIterator(lst.size());
		while(ListIt.hasPrevious()){
			System.out.println(ListIt.previous());
		}
	}
}
