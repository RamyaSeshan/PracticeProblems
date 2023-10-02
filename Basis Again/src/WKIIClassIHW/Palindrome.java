package WKIIClassIHW;

import java.util.Iterator;

public class Palindrome {
	
	//https://leetcode.com/problems/palindrome-number/description/

	public static boolean Palin(int x)
	{
		String A = Integer.toString(x);
		char[] charArray = A.toCharArray();
		char[] res =new char[charArray.length];
		
		int j=0;
		for (int i = charArray.length-1; i >= 0; i--) {		
				res[j] = charArray[i];
				j++;				
		}
		
		for (int i = 0; i < res.length; i++) {
          if(res[i] != charArray[i])
          {
        	  return false ;
          }         	
		}
		
		return true;
		
	}
	
	
	public static boolean WayTWO(int N)
	{
		String res = "";
		int Q;
		while (N > 0)
		{
			Q = (N%10);
			res = res + Q;
		    N = N /10;
			 //System.out.println(res +"---------------" +N);
			
		}
		 int parseInt = Integer.parseInt(res);
		 
		 if(N == parseInt)
		 { return true;}
		
		 return false;
		
	}
	
	public static void main(String[] args) {
		
		int C = 1221;
		boolean palin = Palin(C);
		System.out.println(palin);
		
		
		WayTWO(C);
		
		
		/*
		 * input integer 
		 * output boolean 
		 * 
		 */

	}

}
