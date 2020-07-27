package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
	
		ll.addFirst("Java");
		ll.addLast("python");
		
		ll.set(1, "Automation");
		System.out.println(ll);
		
		//iterating through for lop
		System.out.println("**********for Loop**************8");
		for(int i =0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		//advanced for loop
		System.out.println("**********Adbanve for Loop**************8");
		for(String lst: ll){
			System.out.println(lst);
		}
		
		//using iterator
		System.out.println("**********Iterator**************8");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
		//using while loop
			System.out.println("**********while Loop**************8");
			int num =0;
			while(ll.size()>num){
				System.out.println(ll.get(num));
				num++;
			}
		}
	}
