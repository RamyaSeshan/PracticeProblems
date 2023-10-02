package WKIEXE;

public class containsduplicate {

	//https://leetcode.com/problems/contains-duplicate/description/
	/*
	 * Given an integer array nums, return true if any value appears at least
	 *  twice in the array, and return false if every element is distinct.
	 */
	
	
		public static Boolean ChkRepeatedValues(int[] A)
		{
			//Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			int cnt = 1;
			for (int i = 0; i < A.length; i++) { // {1,2,4,3,1}
				
				for (int j = i+1; j < A.length; j++) {
					if(A[i]== A[j])
					{
						cnt ++;
						return true;
					}
		}
				
			}  return false;}
		
		

		public static void main(String[] args) {
			int[] A = {1,9,4,0,8,5} ; //{1,2,4,3,5,6,6}  {1,2,4,0} 
			Boolean values = ChkRepeatedValues(A);
			System.out.println(values);
			
			
			/*
			 * PSUEDO CODE
			 * Input = int array
			 * Output -- Boolean 
			 * 
			 * have a map of Key -Integer and Value -- Integer 
			 * in for loop compare each element of the array with other element 
			 * if  same ele occurs , increase count by 1 in map 
			 * complete the loop and come out of the loop
			 * Check if any of the Values in Map is 2 , if so return true else false 
			 * 
			 * 
			 */

		}

}
