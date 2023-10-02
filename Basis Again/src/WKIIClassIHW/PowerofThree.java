package WKIIClassIHW;

public class PowerofThree {
	
	public static boolean powerthree(int n )
	{
		//while (n>1)
		while(n%3 ==0)
		{
			n = n/3;
			System.out.println(n);
		}
		
		return n==1;
	}
	
	public static void main(String[] args) {
		
		boolean powerthree = powerthree(27);
		System.out.println(powerthree);
		
	}

}
