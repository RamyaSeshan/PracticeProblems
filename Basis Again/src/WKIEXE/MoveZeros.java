package WKIEXE;

import java.util.Arrays;

public class MoveZeros {
	
	// https://leetcode.com/problems/move-zeroes/description/
	public static int[]  MOveZeros(int[] A)
	{		
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) { //0,1,0,3,12
			for (int j = i+1; j < A.length; j++) {
			
				if( A[i] == 0 && A[j] !=0)
				{
					int k = A[i];
					  A[i] = A[j];
					  A[j] =k;
					  break;
				}				
			}
			}
		return A;		
	}

	public static void main(String[] args) {
		
		int[] A = {0,1,0,3,12} ;
				
		int[] mOveZeros = MOveZeros(A);
		for (int i = 0; i < mOveZeros.length; i++) {
			
			System.out.println(mOveZeros[i]);
		}
		

		/* PSUEDO CODe
		  Input  - Int Array 
		 output - Int Array 
		 
		 Sort the Array
		 outer for loop , till i=0 TO Array.length - 1
		 inner for loop , from j=0 till Array.length
		 if A[i] == 0 && A[j] !==0 && i!=j
		 {
		  int k = A[i];
		  A[i] = A[j];
		  A[j] =k;
		 }*/	
	}

}
