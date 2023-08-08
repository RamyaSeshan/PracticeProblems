package WKVHW;

public class ChessBoard {
	//https://leetcode.com/problems/determine-color-of-a-chessboard-square/description/
	
	public static Boolean chk(String input)
	{
		
	if (input.charAt(0)-'a'==0 || ( input.charAt(0)-'a') %2==0)
		{
			//System.out.println("---------------"); 
			if(Integer.parseInt(input.charAt(1)+"") %2 != 0)				
			 {
				//System.out.println("---------------");  
				return false ;
			 } 
			else {return true;}
			
			}
		 
	else 
		 {
			 if((input.charAt(0)-'a')%2 !=0 && Integer.parseInt(input.charAt(1)+"") %2 != 0 ) 
			 return true;
			 else {return false;}
		 } 
	
	}

	public static void main(String[] args) {  //a1 , b1, c2,d2
		
		 Boolean chk = chk("c7");
		 System.out.println(chk);
		
		/*
		 * PSUEDO code
		 * Input -- String
		 * outout -- boolean 
		 *  eg : a1
		 *  if
		 *    input.chart(0)-'a' ==0 || (input.charat(o)-'a')%2 ==0 
		 *   if 
		 *     Interger.parseint(( input.charAt(1)+""))%2 !==0
		 *      return false else true 
		 *  else if (input.charat(o)-'a')%2 !=0 && input.charAt(1)+""))%2 !==0)
		 *    
		 *       return true else return false
		 *     
		 */     
				 

	}

}
