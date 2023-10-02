package WKIIClassIHW;

public class StairCase {

	//https://leetcode.com/problems/climbing-stairs/
	
	public static int StepsWay(int N)
	{
	   int cnt =1; int res;int rem;
	
		cnt = (N-1) + (N-2) ;
				
		return cnt;
		
	}
	public static void main(String[] args) {   // All 1 , All 2 , 2 +1+1 , 1+1+2 , 1+2+1 
		// TODO Auto-generated method stub
		int N =2;
		int stepsWay = StepsWay(N);
		System.out.println(stepsWay);
		
		/*
		 * PSUEDO CODE
		 * input int 
		 * output int 
		 * Int n divide by no ==0
		 */

	}

}
