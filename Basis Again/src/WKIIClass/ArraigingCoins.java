package WKIIClass;

public class ArraigingCoins {

	//https://leetcode.com/problems/arranging-coins/description/
	
	public static  int  Rows(int n )
	{
		
		int cnt =0 ;		
		for (int i = 1; i <=n; i++) {  // 5   O(lOG N )
			
			if( n >= i) // 3 > 3
			{
				n = n-i;  // 4 , 
				cnt = cnt+1 ; // 1 +1 
			}
			}
	
		return cnt ;		
	}
	
	public static void main(String[] args) {
		
		int rows = Rows(6);
		System.out.println(rows);
		
    /*
     * PseudoCode:
     1) Input - N of coins, remaining = n;
     //  n = 5, remaining = n, row = 0;
     2) For loop to traverse from i <= 5
     3) remaining = remaining - i
     //  remaining = 5 - 1;  ==> 4
     //  remaining = 4 - 2   ==> 2
     //  row++
     4) if (remaining < 0)
        {
        break;
        }
     */
	}

}
