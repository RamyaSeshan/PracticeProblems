package WKIII_HW;

public class MergeAltSrt {
	//https://leetcode.com/problems/merge-strings-alternately/description/
	
	public static String merAltStr(String A , String B)
	{
		String out ="";
		int i = A.length();
		int j = B.length();
		
		int len = Math.min(i, j);
		
		for (int k = 0; k <len; k++) {			
			out = out + A.charAt(k)+B.charAt(k);			
		}
	
		if (i >j) { out = out + A.substring(j) ;}
		else { out = out + B.substring(i) ;  }
				
		return out;
		
	}

	public static void main(String[] args) {
		
		String A = "abcRRRQQ";
		String B = "defOO";
		String merAltStr = merAltStr( A ,  B);
		System.out.println(merAltStr);
		
      /*
       * PSUDO CODE    abge cde
       * input -- string A , String B
       * output -- String C
       * int i = A.lenght() ; int j = B.lenght();
       * int len = min (i,j);
       *  for (int k =0 ; k < len ; k++)
       *  {
       *    C = A.chatAt[k] + B.charAT[k] ;       *  
       *  }
       *    
       *    if (i > j)  4 >2 
       *    C = C+ A.substring(j)
       *    else C = C + B.substring(i);
       *    
       *    return C;
       * 
       * 
       */
		
		
	}

}
