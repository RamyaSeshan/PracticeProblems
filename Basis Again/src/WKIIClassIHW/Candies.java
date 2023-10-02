package WKIIClassIHW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Candies {
	
	
	public static int candies(int[] A)
	{
		
	Set<Integer> set = new HashSet<Integer>();
	
	for (int i = 0; i < A.length; i++) {
		 set.add(A[i]);		 	
	}
	
	if (set.size() == A.length /2)	
	{
		return set.size();
	} 
	else if (set.size() < A.length /2)
	{ return set.size() ;}
	else 
	{  return A.length /2; }
	
		
	}

	public static void main(String[] args) {
		
		int[] A = {1,1,1,1,5,5} ;
		
		int candies = candies(A);
		System.out.println(candies);
		/*
		 * PSUEDO CODE
		 * input - int array
		 * output -- int
		 * get array values in set
		 * get size of set
		 * get input array size /2
		 * if (set size == input array size /2 )
		 * return set size 
		 * else return input array size /2
		 */

	}

}
