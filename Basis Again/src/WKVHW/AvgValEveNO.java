package WKVHW;

import org.junit.Test;

import junit.framework.Assert;

//https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/

/*
 * PSUEDO Code
 * input int[]
 * output int
 * 
 * int cnt=0;
 * sum=0;
 * in for loop iterate thur i=0 till less than  input array lenght 
 *   have if condition input[i]!2==0 and input[i]!3==0
 *      sum = sum + input[i];
 *      cnt ++
 *  return sum/cnt
 */
public class AvgValEveNO {

	public int enevNoDivbyThree(int[] input)
	{

		int cnt=0,sum=0; //1,2,4,7,10
		
		for (int i : input) {
			if(i %2==0 && i %3==0 )
			{
				sum = sum + i ;	cnt =cnt+1;
			} 
		}


		if (sum ==0 || cnt == 0) { return 0;}
		else        
			return sum/cnt; 

	}

	@Test
	public void test1()
	{
		int[] input = {1,3,6,10,12,15};
		Assert.assertEquals( enevNoDivbyThree(input), 9);
	}

	@Test
	public void test2()
	{
		int[] input = {1,2,4,7,10};
		Assert.assertEquals( enevNoDivbyThree(input), 0);
	}

}



