package WKIIClass;

public class SumOfNum {
	//https://leetcode.com/problems/two-sum/description/
	
	public static int[] Sum(int[] A, int B) { // [1,1,2,3]  , 4
		
		//int[] res = new int[2];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				if(A[i]+ A[j] == B)
				{
					//res[0] = i;
					//res[1]= j;
					return new int[] {i,j} ;
				}				
			}		
				}
		return new int[] {-1,-1};									
		}


	public static void main(String[] args) {
		int target = 5 ;
		int[] A = {1,1,2,3};
		 int[] sum = Sum(A, target );
		 for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		 
	}

}
