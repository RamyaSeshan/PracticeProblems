package WKIII_HW;

import java.util.Iterator;

public class MissingNo {
	 //https://leetcode.com/problems/missing-number/description/
	
	public static int check(int[] A)  //[3,0,1]
	{
		//int i=0;
		for ( int i = 0; i <= A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				   if(A[j] == i)   { break;} 
				   else if (A[j]!= i && j == A.length-1 ) {return i;}
			}
			 //return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		//int[] A = {3,0,1,2};
		//int[] A = {0,1};
		int[] A = {9,6,4,2,3,5,7,0,1} ;
		int check = check(A);
		
		System.out.println(check);

	}
	
	/*
	 * PSUEDO CODE  //[3,0,1]
	 * input int array
	 * output -- int 
	 * 1St for loop int i=0 ; i <=array.lenght
	 * 2nd for loop int j=0; j <array.lenght
	 * {   if (A[j] == i ) {break;} }
	 *    return i;  }
	 * 
	 */

}
