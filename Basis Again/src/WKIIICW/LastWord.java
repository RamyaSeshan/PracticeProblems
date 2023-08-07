package WKIIICW;

public class LastWord {
	
	//https://leetcode.com/problems/length-of-last-word/
	
	public static int lastword(String input )
	{
		
		String temp =input.trim();
		String res="";
		
		for (int i = temp.length()-1; i >=0; i--) {
			
			if( temp.charAt(i) != ' ')
			{
				res = res + temp.charAt(i);
			}else {break;}
			
		}
		
	return res.length();	
	
	}

	public static void main(String[] args) {
	
		String input = "I am good!";
		int lastword = lastword (input);
		System.out.println(lastword);
		/*
		 * input -- string {" i am a good  "}
		 * output --int 
		 * input.trim -- "i am goo d"
		 * String res =""
		 * for (int i=input.lenght-1 , i >=0 ; i--)
		 * if (input.charAT[input.lenght-1] !="" )
		 * res= res+input.charAT[input.lenght-1]  //doog 
		 * 
		 * 
		
		 * int n = res.lenght()
		 * 
		 * 
		 */

	}

}
