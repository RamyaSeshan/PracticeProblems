package WKIEXE;

import java.util.ArrayList;
import java.util.List;

public class TargetEleRemove {

	public static List<Integer> RemoveTargetEle(int[] A,int B)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < A.length; i++) { //[1,2,3,3,4} | 4
			if (A[i] != B )
			{
				list.add(A[i]);
				}					
		}
	
		return list;		
	}
	
	public static void main(String[] args) {
        
		 int[] A ={1,2,3,4};
		List<Integer> removeTargetEle = RemoveTargetEle( A, 5) ;
		System.out.println(removeTargetEle);
		
		/*
		 * PSUEDO CODE
		 * input -- int array
		 * output -- int Array
		 * LOGIC
		 * intilze a new list
		 * loop thru array till its lenght 
		 * if A[i] !=target element 
		 * add to the list 
		 * 
		 * return list
		 */

	}

}
