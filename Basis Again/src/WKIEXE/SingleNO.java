package WKIEXE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNO {
	
	//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	//https://leetcode.com/problems/single-number/description/
	
	public static int  ChkNO(int[] A)
	{
	   Arrays.sort(A);
	   
		for (int i = 0; i < A.length; i++) {
			int cnt=1;    // {1,1,2,3,2}
			
			for ( int j = 0; j < A.length; j++) {
				
				if(A[i] == A[j] && i!=j)
				{
					cnt =cnt+1 ;		
				}					
				}						
				 if(cnt == 1 ) {return A[i] ;} else cnt=1;				 
			}
			return -1;		
	
	}

	public static Integer  ReDoChkNO(int[] A) { //{1,2,1,3,2 }
		
		Map<Integer, Integer > map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++) {
			
		 if (map.keySet().contains(A[i]))
		 {
			 map.put(A[i], map.get(A[i])+1);
			 
		 } else 
		 {
			 map.put(A[i], 1);		 }		
			}
		
	for (Entry<Integer,Integer> entry  : map.entrySet()) {
		if(entry.getValue().equals(1))
		{
		return entry.getKey();
		}
		
	}
	return null;		
	}
	
	public static void main(String[] args) {
		
		int[] A = {2,1,1,2}; //{4,3,1,3,4}
		/*
		 * Integer chkNO = ReDoChkNO(A) ; System.out.println(chkNO);
		 */
		
		System.out.println(ChkNO(A));		
		
		/*
		 * PSUEDO CODE@;
		 * input int[]
		 * output -int 
		 * LOgic	
		 * in FOr loop , till Array lenght traverse thu 
		 * in next forr loop , from j- i+1 , traverse till < Array.lenght
		 * compare A[i] ==A[j] , if so , increase cnt by 1
		 * 
		 * after inner loop completion , chkeck cnt ==1 , then return A[i]
		 * else keep cnt=1 
		 */

	}

}
