package WKIIClassIHW;

import java.util.Iterator;

public class SingleNOReDo {
	
	//https://leetcode.com/problems/single-number/description/
	
	public static int singleno(int[] A)
	{
		
		int cnt=1;
		for (int i = 0; i < A.length; i++) {
			for (int j =0; j < A.length; j++) { // [1,3,2,3,1]
				
				if(i!=j && A[i] != A[j])
				{					
					continue;
				} else if (i!=j && A[i] == A[j])
				{cnt=cnt+1; }
				
			}
			if(cnt ==1 )
				return A[i] ;
			else {cnt =1;}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		 
		int[] A = {4,2,1,2,7,4,1,6};
		int singleno = singleno(A) ;
		System.out.println(singleno);
		
		
		/*
		 * PSUEDO CODE
		 *input --- Int Array
		 *output -- int 
		 *for loop -- till  < Array.lenght
		 *inner for loop  -- j=0 till Array.lenght  [1,2,1,2,3] 
		 *if (i !=j && A[i] != A[J]
		 *{ continue; } 
		 *return A[i]
		 */
		

		}	
	}


