package WKIII_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PlusOne {
	
	public static int[] plusOne(int[] nums) {
		
		for (int i = nums.length - 1; i >= 0; i--) {

			if (nums[i] < 9) {
				nums[i]++;
				return nums;
			}
			nums[i] = 0;
		}
		
		int[] newarray = new int[nums.length + 1];

		newarray[0] = 1;
		return newarray;
	}
	

	public static void main(String[] args) {
		//int[] A  = {1,2,3};
		int[] A  = {9,9,9,9};
		int[] one = plusOne(A);
		System.out.println(Arrays.toString(one));
		
		
		/*
		 * PSUEDO CODE
		 * input -- int array
		 * output -- int array 
		 * in for loop : for (int i = input.lenght-1 ; i >=0 ; i--) //289
		 * if  (input[i] < 9)
		 * input[i] = input[i]+1; return input 
		 *    
		 *   input[i] =0;
		 *   
		 *   outside for loop
		 *   int[] out = new int[input.lenght +1)
		 *   
		 */

	}

}
