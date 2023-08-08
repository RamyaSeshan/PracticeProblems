package WKVHW;

import org.junit.Assert;
import org.junit.Test;

public class ProductofArray {

	// https://leetcode.com/problems/sign-of-the-product-of-an-array/

	public int Product(int[] nums) {
		int res = 1;

		for (int i : nums) {
			res =res * i;
		}

		return Integer.signum(res);
	}

	@Test
	public void test1() {
		int[] input = { -1, 1, -1, 1, -1 };	
		Assert.assertEquals(Product(input), -1);
	}

	@Test
	public void test2() {
		int[] input = {-1,-2,-3,-4,3,2,1};	
		Assert.assertEquals(Product(input), 1);
	}

	@Test
	public void test3() {
		int[] input = {1,5,0,2,-3};	
		Assert.assertEquals(Product(input), 0);
	}

	// PSUEDO Code
	/*
	 * input -- int[] output --int int res =1; in for loop from i =0 , go till <
	 * input.lenght; res = res *input[i] outside for loop return result
	 */

}
