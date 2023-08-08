package WKVHW;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNo {
	// https://leetcode.com/problems/self-dividing-numbers/

	public static List<Integer> chk(int N1, int N2) {
		List<Integer> list = new ArrayList<Integer>(); // 22,23,24 22%10

		String temp = "";
		int value = 0;

		for (int i = N1; i <= N2; i++) {

			temp = Integer.toString(i);

			for (int j = 0; j <= temp.length() - 1; j++) {
				value = Integer.parseInt(temp.charAt(j) + "");

				// System.out.println(value +"*************");

				if (value == 0 || i % value != 0) {
					break;
				} else if (i % value == 0 && j == temp.length() - 1) {
					list.add(i);
				}

			}
		}

		return list;

	}

	public static void main(String[] args) {
		List<Integer> chk = chk(1, 15);
		System.out.println(chk);

		/*
		 * 128 22%10 ==2 22/10= 12
		 */
		/*
		 * PSUEDO CODE input int : N1 N2 for i= N1 , till N2 ---inner for loop ------
		 * check start from N1 , go till N2 , check whether N1%N2!==0 , if so break
		 * ------ outside 2nd for loop , add N1 to lis
		 */

	}

}
