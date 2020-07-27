package ListConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionLogics {

	public void Arraylist(){
	//ArrayList create object
	ArrayList<String> alst = new ArrayList<String>();
	
	//add syntax
	alst.add("");
	
	//iterate trough lambda java 8 foreach
	alst.forEach(action ->{
		System.out.println(action);
	});
	
	//iterate through iterator
	Iterator<String> it = alst.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	
	//using ForeachRemaining
	Iterator<String> it1 = alst.iterator();
	it1.forEachRemaining(movies ->{
		System.out.println(movies);});
	
	//using listIterator
	ListIterator itlst = alst.listIterator(alst.size());
	while(itlst.hasPrevious()){
		System.out.println(itlst.previous());
	}
	
	//*************Linkd List*******************
	
	LinkedList<String> lnkd = new LinkedList<String>();
	
	//add element to list
	lnkd.add("");
	lnkd.addFirst("");
	lnkd.addLast("");
	lnkd.set(1, "");
	
	//iterator
	Iterator<String> itr = lnkd.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	//**************hashMap******************
	
	HashMap<Integer, String> hmp = new HashMap<Integer, String>();
	hmp.put(1, "SElenium");
	System.out.println(hmp.get(2));
	
	for(Entry<Integer, String> set : hmp.entrySet()){
		System.out.println(set.getKey() + "  " + set.getValue());
	}
	
	//*************HashTable**************
	Hashtable<Integer,String> cont = new Hashtable<Integer,String>();
	cont.put(1, "Chethan");
	
	Set st = cont.entrySet();
		System.out.println(st);
	
	//Entry set
		for(Entry<Integer, String> st1 : cont.entrySet()){
			System.out.println(st1.getKey() + " " + st1.getValue());
		}
		
	//using Enumeration
		Enumeration enm = cont.elements();
		while(enm.hasMoreElements()){
			System.out.println(enm.nextElement());
		}
	}
}