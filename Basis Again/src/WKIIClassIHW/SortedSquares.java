package WKIIClassIHW;

import java.util.Arrays;

public class SortedSquares {
	
	//https://leetcode.com/problems/squares-of-a-sorted-array/
	
	public static void sortsq(int[] A)
	{
		int temp;
	   for (int i = 0; i < A.length; i++) {
		   		    
		   temp = A[i] * A[i] ;
		   A[i] = temp;			
	}	   
	   Arrays.sort(A);
	 
	   for (int i = 0; i < A.length; i++) {
		System.out.println(A[i]);
	}
	
	}

	public static void main(String[] args) {
		int[] A = {-7,-1,0,3,4 };
		 sortsq(A);
		 
	}

}
