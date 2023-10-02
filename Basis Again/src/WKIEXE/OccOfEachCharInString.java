package WKIEXE;

import java.util.HashMap;
import java.util.Map;

public class OccOfEachCharInString {
	
	// to find the no of times each char repeats in the String 
	
	public static Map<Character, Integer> NoOfCharOccinArray(String input)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String Input = input.toLowerCase();
		char[] InputcharArray = Input.toCharArray();
		
		for (int i = 0; i < InputcharArray.length; i++) {
			
			if(map.keySet().contains(InputcharArray[i]))
			{
				map.put(InputcharArray[i], map.get(InputcharArray[i])+1) ;
				
			}else
			{
				map.put(InputcharArray[i], 1);
			}			
		}
		
		return map;
	}

	public static void main(String[] args) {
		
		String Name = "Ramya-is-Good-Girl";
		 Map<Character, Integer> noOfCharOccinArray = NoOfCharOccinArray(Name);
		 System.out.println(noOfCharOccinArray);
		
		// PSUEDO CODE 
		
		/*INput -- String Array 
		 * output - Map Key is Char ans value is no of times it occurs in string 
		 * LOGIC
		 * convert to CHAR Array
		 * Traverse and , check its presense and add it in map
		 * finally print it 
		 * 
		 */

	}

}
