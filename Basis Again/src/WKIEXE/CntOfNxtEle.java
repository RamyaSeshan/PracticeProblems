package WKIEXE;

public class CntOfNxtEle {
	
	public static int cntChk(int[] A)
	{
		int cnt=0 ;
		int dupcnt= 0;
		for (int i = 0; i < A.length-1; i++) {
			
			for (int j = i+1; j < A.length; j++) {
				if(A[j] == A[i]+1)
				{
					cnt=cnt+1;
				}else if(A[i] == A[j])
				{
					dupcnt =dupcnt+1;
				}
				}
			System.out.println(A[i] +" has  "+  dupcnt +" duplicates");
			dupcnt= 0;
		}
		return cnt;
	}

	public static void main(String[] args) {
		int[] A = {1,2,3,4,1,3,3};
		int cntChk = cntChk(A);
		System.out.println(cntChk);
		
		
		/*
		 * PSUEDO CODE
		 * input == int array
		 * output -- int 
		 * LOGIC
		 * first for loop , iterate thur array lenght -1
		 * Second  for loop ,j=i+1 , iterate thur array lenght
		 * if A[j] = A[i]+1 , cnt ++
		 */

	}

}
