package WKIV_HW;

import org.junit.Test;

import junit.framework.Assert;

public class ThreeDivisors {
	//https://leetcode.com/problems/three-divisors/
	
	/*
	 * PSUEDO Code
	 * 1 input -- int 
	 * 2 output -- boolean
	 * 3 have var int cnt=0
	 * 4 traverse thru for loop from int i=1 till n
	 *   5 check n% i == 0 [ check n is divisible by i ] 
	 *     6  increase cnt by 1
	 *      
	 *  7 if cnt equals 3 retrun true 
	 *  8 else false 
	 */
	
  public boolean threeDiv(int input)
  {
	  int cnt =0;
	  for (int i = 1; i <=input ; i++) {
		  if(input % i ==0) {cnt = cnt+1;}}
	   
	  if (cnt ==3 ) {return true ;}
	  else {return false ;}	
  }
  
  @Test
  public void test1()
  {
	  int n=2;
	  Assert.assertEquals(threeDiv(n), false);
  }
  
  @Test
  public void test2()
  {
	  int n=4;
	  Assert.assertEquals(threeDiv(n), true);
  }
  
  @Test
  public void test3()
  {
	  int n=6;
	  Assert.assertEquals(threeDiv(n), false);
  }

}
