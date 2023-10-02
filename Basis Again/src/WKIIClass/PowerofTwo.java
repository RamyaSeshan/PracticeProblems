package WKIIClass;

public class PowerofTwo {
	
	public static boolean twopower(int n )
	{
		
		/*while (n >=1)  //8
		{
			float res = n/2; 
			if (res == 1.0)
			{
				return true;
			} else  {n=res;}			
		}	*/
		while (n%2==0)  
		{
			n = n/2;
		}				
		return n==1;
	
	}

	public static void main(String[] args) {
	
		Boolean twopower = twopower(0);
		System.out.println(twopower);
	}

}
