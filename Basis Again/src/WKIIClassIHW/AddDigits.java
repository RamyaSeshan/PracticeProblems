package WKIIClassIHW;

public class AddDigits {
	
	//https://leetcode.com/problems/add-digits/description/
	
	
	public static int noOfDigi(int n )
	{
	    int q,r=0;
		 while (n >=10)
		 {
			q = n%10;
			r =n/10; 
			n = q+r ; 
			//System.out.println(n);
		 }
		
		return n;
		
	}

	public static void main(String[] args) {
		int n =187908; //
		int noOfDigi = noOfDigi(n );
		System.out.println(noOfDigi);
		
		
		/*
		 * input = int
		 * output --int 
		 * while n >0 && n <10[ n being the input ]   //321   1+2
		 * Q = n%10  1
		 * r = n/10 ==32
		 * n = Q+r 
		 */

	}

}
