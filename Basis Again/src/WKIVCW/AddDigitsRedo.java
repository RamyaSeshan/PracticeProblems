package WKIVCW;

public class AddDigitsRedo {
	
	public static int DigitsAdd(int N)  //38
	{
		int q=0;
		int r =0;
		while (N >0)
		{
			if (N < 9 ) {return N;}
			q = N%10;  
			r = N/10; 
			N = q+r;
		}
					
		return N;
		
	}

	public static void main(String[] args) {
		
		//int digitsAdd = DigitsAdd(187908);    //  18798  
		//int digitsAdd = DigitsAdd(0);
		int digitsAdd = DigitsAdd(187);  
		System.out.println(digitsAdd);
		
		
		/*
		 * PSUEDO 
		 * input -- int n
		 * output - int 
		 * while (n >0)
		 * {
		 *   if (n <9)
		 *   {
		 *       return n}
		 *   q = n %10 ;
		 *   r = n/10;
		 *   n= Q+r ;
		 *   
		 * 
		 * }
		 */

	}

}
