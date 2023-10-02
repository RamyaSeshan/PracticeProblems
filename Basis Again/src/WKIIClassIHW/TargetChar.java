package WKIIClassIHW;

import java.util.Arrays;

public class TargetChar {
	/*
	 * Given a sorted character array and a target character, 
find the next biggest character in the array. 

Example:
char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
Output -> h

	 */
	
	public static char TargetChar(char[] A , char B) //char[] cha = {‘b’, ‘d’ , ‘h’}; char k = ‘e’ 
	{
		int[] input = new int[A.length];
		Arrays.sort(A);
		char ouput = 0;
		
		for (int i = 0; i < A.length; i++) {
			int a= A[i];
			input[i]=a;
				}
		
		int target = B;
		System.out.println("The value of target char is " + target);
		
		 for (int i = 0; i < input.length; i++) {
		  
		  if(target > input[i]) 
		  { int res1 =input[i+1]; 
		  ouput = (char) res1 ;}
		  
		 }		 
		 return ouput;		
	}


	public static void main(String[] args) {
		char[] A = {'a','h','d'} ;
		char targetChar = TargetChar( A, 'e') ;
		System.out.println(targetChar);
		
	}

}
