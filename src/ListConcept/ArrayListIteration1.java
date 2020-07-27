package ListConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayListIteration1 {

	public static void main(String[] args) {
		
		//How to check the given number is prime number or not
		int a =3;
		boolean flag= false;
		
		for(int i=2;i<a/2;i++){
			if(a%i ==0){
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println(a + " : is a prime number");
		}else
		{
			System.out.println(a + " : is not a prime number");
		}
		
	//How to reverse the integer
		int num=12345;
		int rev=0;
		while(num!=0){
			rev = rev * 10 + num%10;
			num = num/10;
		}
		System.out.println(rev);
		
		//How reverse string
		String str = "chethan";
		String revstr = "";
		
		for(int i = str.length()-1;i>=0;i--){
			revstr = revstr + str.charAt(i);
		}
		System.out.println(revstr);
		
		//find the duplicate elements in string array object
		
		String dup[] = {"java", "c", "c++", "pythin", "java", "c", "java"};
		
		//using for loop
		for(int i=0; i<dup.length;i++){
			for(int j=0; j<i;j++){
				if(dup[j].equals(dup[i])){
					System.out.println("The duplicate sting is : " + dup[j]);
				}
			}
		}
		
		//using set
		Set<String>set = new HashSet<String>();
		for(String st : dup){
			if(set.add(st)== false){
				System.out.println("The repeated string is :" + st);
			}
		}
		
		//using HashMap key value pair
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String mp : dup){
			Integer count = map.get(mp);
			if(count == null){
				map.put(mp, 1);
			}else{
				map.put(mp, ++count);	
			}
		}
//		Set<Entry<String, Integer>> set1 = map.entrySet();
		for(Entry<String, Integer> set2 : map.entrySet()){
			if(set2.getValue()>1){
				System.out.println("The repeated string using map : " + set2.getKey() + " repeated " + set2.getValue() + " times");
				
			}
		}
		
		//Finding Large number and small number
		int a1[] = {10, -23, 1000, 30, 40, -2, 3};
		 int large = a1[0];
		 int small = a1[0];
		 
		 for(int i=0;i<a1.length;i++){
			 if(a1[i] > large){
				 large = a1[i];
				 
			 }else if(a1[i] < small){
				 small = a1[i];
			 }
		 }
		System.out.println("the large number is : " + large);
		System.out.println("the small number is : " + small);
		
		//finding fibnacci series 
		int fib =1;
		int fib2 = 1;
		for(int i =1; i<10;i++){
			int tmp = fib + fib2;
			fib = fib2;
			fib2 = tmp;
			System.out.println(fib + " Is a Fibonacci number");
		}
		
		//finding Duplicate Number in array, in Set--HashSet duplicates values are not allowed
		int dp[] = {1, 2, 3, 1, 3, 5, 6};
		Set<Integer> dupnum = new HashSet<Integer>();
		for(Integer dupn : dp){
			if(dupnum.add(dupn)== false){
				System.out.println("The repeated numbers are : " + dupn);
			}
		}
		
		//Finding missing number in array
		int mis[] = {1 ,3, 4, 5, 6};
		int sum =0;
		int sum1 =0;
		
		for(int i =0;i<mis.length;i++){
			sum = sum + mis[i];
		}
		
		for(int j=1; j<=6;j++){
			sum1 = sum1 + j;
		}
		System.out.println("The missing number is : " + (sum1-sum));
	}
}
