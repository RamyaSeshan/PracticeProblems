package WKIEXE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Isogram {
	
	// This has Isogram & FiZZBUZZ prg

	public static List<String> FizzBuzz(int n) // 3
	{
		//String[] res = new String[n];
		List<String> list  = new ArrayList<String>();

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				//res[i - 1] = "FIZZB BUZZ";
				list.add("FIZZB BUZZ");
			} else if (i % 3 == 0) {
				//res[i - 1] = "FIZZ";
				list.add("FIZZ");

			} else if (i % 5 == 0) {
				//res[i - 1] = "BUZZ";
				list.add("BUZZ");
			} else {
				//res[i - 1] = i + "";
				list.add(Integer.toString(i) );
			}

		}

		return list;

	}

	public static String[] Check(int n) {

		if (n >= 1 && n <= 10000) {
			String[] result = new String[n];

			for (int i = 1; i <= n; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					result[i - 1] = "FIZZBUZZ";
				} else if (i % 3 == 0) {
					result[i - 1] = "FIZZ";
				} else if (i % 5 == 0) {
					result[i - 1] = "BUZZ";
				} else {
					result[i - 1] = i + "";
				}

			}
			return result;
		}
		return null;

	}

	// This function is to check whether given String is a Isogram
	public static boolean ChkIsogram(String A) {
		String input = A.toLowerCase();
		char[] charArray = input.toCharArray();

		for (int i = 0; i < charArray.length - 1; i++) { // ABC

			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					System.out.println("Given string is NOT a Iogram");
					return false;
				}
			}
		}

		return true;

	}

	public static void main(String args[])

	{

		
		 String[] res = Check(3); for (int i = 0; i < res.length; i++) {
		 System.out.println(res[i]); }
		 
		System.out.println("--------------- ISOGRAM CHECK ----------------");
		 
		 String Val = new String("GOD INME") ; Boolean res1 = ChkIsogram(Val);
		 System.out.println(res1);
		 

		System.out.println("--------------- FIZZBUZZ CHECK ----------------");
	 List<String> fizzBuzz = FizzBuzz(15);
		System.out.println(fizzBuzz);

		/*
		 * input = Any no Out put - String Array No constrians -- 1 <= n <= 10 power 4
		 * -- test data [ 1 to 10,000]
		 * 
		 * 
		 * 
		 * pseudo code
		 */

		/*
		 * 1.Input -- should be >= 1 && < = 10,000 2.Iterate from 1 till n - i 3.if
		 * i%3==0 && i%5=0 , string array -- Fizzbuzz elseif i%3==0 , string array --
		 * Fizz elseif i%5==0 , string array -- buzz else string array --add i
		 */

	}
}
