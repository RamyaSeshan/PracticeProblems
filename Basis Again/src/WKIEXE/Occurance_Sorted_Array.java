package WKIEXE;

import org.junit.Test;

/*
 *  Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[].
arr[] = {1, 1, 2, 2, 2, 2, 3}   x = 2
output = 4
 */
public class Occurance_Sorted_Array {
	
	public int occurance(int[] nums , int x)
	{
		int cnt =0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==x) { cnt ++;  }				
		}		
		return cnt;
	}

	@Test
public void Test1()
{
	int[] nums = {1, 1, 2, 2, 2, 2, 3} ;
	int x =2 ;
	 int occurance = occurance(nums ,  x);
	 System.out.println(occurance);
}
}
