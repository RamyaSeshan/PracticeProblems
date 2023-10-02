package WKIEXE;

public class MajorityOccOfNO {
	
	// This is find the majority of occurance of element in an Int array 
	// Majority ele occurance > n/2 ; n - Size of the array
	
	public static int MajorityOcc(int[] A )
	{
	    int count =1 ;	
		for (int i = 0; i < A.length; i++) { // [1,2,1,2,1]
			for (int j = i+1; j < A.length; j++) {
				
				if(A[i] == A[j])
				{
					count = count+1;
				}
				
				if (count >  (A.length)/2)
				{ return A[i];  }
		
		}
			count=1;
		}
		return -1;
		
	}

	
	
	public static void main(String[] args) {
		
		 int[] A = {2,1,1,1,3,1,3}; int majorityOcc = MajorityOcc(A);
		 System.out.println(majorityOcc);
		 
		
		
		
		/*
		 * PSUDEO CODE
		 * input  - Int Array and a no to find its occurance 
		 * out put int 
		 * No Constriants ;
		 * LOGIC
		 *  public static int Occ(int[] A, int B)
		 *  int cnt = 0; 
		 *  
		 *  for(int i=0; i< A.lenght ;i++) [1,2,3,4,4,4,5,6]  B = 4
		 *  {
		 *    if (A[i] == B)
		 *    {
		 *     cnt = cnt+1;
		 *    
		 *     }		 *    
		 *  }
		 *   return cnt ;
		 *  
		 *  
		 * 
		 * 
		 */

	}

	
	
	/*
	 * Input == In Array 
	 */
}
