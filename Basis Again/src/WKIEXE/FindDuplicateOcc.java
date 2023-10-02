package WKIEXE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateOcc {
	//https://leetcode.com/problems/unique-number-of-occurrences/description/
	
	public static Boolean GetDistinctCnt (int[] A) // [ 1,1,2,3 ]
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < A.length; i++) {			 
			if(map.keySet().contains(A[i]))
			{
				map.put(A[i], map.get(A[i])+1) ;
			}
			else 
			{
				map.put(A[i], 1); // 1--1
			}
			
		}
		
		Set<Integer> set = new HashSet() ;
		
		for (Integer res : map.values()) {
			
			 if(!set.add(res) )
			 {
				 return false;
			 }
		}
		 return true;
				
	}

	public static void main(String[] args) {
		Boolean getDistinctCnt = GetDistinctCnt (new int[] {1,1,2,2,2,3,3,3,3 });
  System.out.println(getDistinctCnt);
	}

	
	/*
	 * input == Int Array 
	 * Output -- Boolean 
	 * Contraint -- NO 
	 * 1.Traverse thru the arry
	 * 2.Check firts no with all other for existence of same no , repeat  the step 
	 * 3-- > 2 -- 3 ; 4--1 , 5 --2
	 * int arr [3,2,1 ] 
	 * 
	 * NEXT APPROACH I
	 * Int arry 1 [ 1,2,3,1,2,2,3,3,3,3]
	 * Pass it inside SET  [1,2,3]
	 * traverse : chk for each element in SET inside Array
	 * if exists ,increment counter 
	 * 2nd SET --- > Add counter 
	 * SET .ADD -- TRUE 
	 * SET>ADD -- FALE -- BREAK the lopp 
	 * and return false  
	 * else return true
	 * NEXT APPROACH II
	 * Int arry 1 [ 1,2,3,1,2,2,3,3,3,3]
	 * Create a Map : Key --int , value int 
	 * traverse thry Array
	 * MAp.key CONTAINS Array[i] 
	 * MAP.put (Array[i]  , map.get(Array[i])+1)
	 * ELSE  MAP.put (Array[i]  , 1)
	 * come out of the loop 
	 * Add Map.Values to a set -- with retuen value 
	 * if TRUE -- Over all return TRUE 
	 * ELSE  all return TRUE 
	 * 
	 */
}
