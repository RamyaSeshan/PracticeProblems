package WKIEXE;

import java.util.ArrayList;
import java.util.List;

// to check whether a given no is prime no 

public class primeNo {
	
	public static Boolean ChkPrimeNO(int n )
	{
		
		int cnt=0;
		
		for (int i = 1; i <= n; i++) {
			if ( n%i==0 )
			{ cnt = cnt + 1; }
				
		}
		if (cnt == 2) 
		{return true;}
		else 
			return false	;		
		
	}
	
	public static List<Integer> CountPrimeNo(int n)
	{
         List<Integer> list = new ArrayList<Integer>();
         int k ;
         int i ;
         int j=0;
		for (k = 2; k < n; k++) {
			int cnt=0;
			
			for ( i = 1; i <= k; i++) {
				if ( k%i==0 )
				{ cnt = cnt + 1; }					
			}
			if (cnt == 2) 
			list.add(k);
		
		}
		return list;		
		
	}

	public static void main(String[] args) {
		/*
		 * Boolean chkPrimeNO = ChkPrimeNO(13); 
		 * System.out.println(chkPrimeNO);
		 */
		
		 List<Integer> countPrimeNo = CountPrimeNo(9);
		
			System.out.print(countPrimeNo);
	
		
		/*PSUEDO CODE
		 * input ont n 
		 * output , boolean 
		 * Logic :
		 * Get the no , divide that no from 2 to n-1 , return cnt of N% i ==0
		 * if cnt ==2 , its prime , else NOt Prime 
		 * 
		 * 
		 * COUNT no of Prime btn > given no n 
		 * Input int n 
		 * Output Int Array or int 
		 * Get the no 
		 * intialize n =2  ; n < given NO 
		 * In For loop traverse the no btn 2 to n and chk whether  its Prime 
		 * if Prime add to Int Array 
		 * increment n and do the same logic 
		 * 
		 * 
		 */

	}

}
