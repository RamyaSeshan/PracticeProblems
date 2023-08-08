package WKVHW;

public class MoneyLetCodeBank {
	
	//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
	
	public static int TotalMoney(int DepositDays)

	{
		int intialmoney =1;
				 int temp =0 ;
				 int Total =0 ;
				 int maxdaycnt=7;
				 int daycnt =1 ;
				 
		for (int i = 1; i <= DepositDays; i++) {
			
			if (daycnt ==1 )
				 { 
				  temp = temp + intialmoney;
				 daycnt++;
				 Total = Total + temp;				   
				 }
			else if ( daycnt > 1 && daycnt <=7)
				  {
				   temp = temp+1  ;
				  daycnt ++;  
				  Total = Total + temp; 
				  }
		    else if (daycnt > 7)
				  {
				 daycnt =2;
				 temp =0;
				 intialmoney =intialmoney +1;
				 temp = temp + intialmoney;
				 Total = Total + temp; 				      
				  }	
				}		
		
		return Total;
	}
	public static void main(String[] args) {
		
		int totalMoney = TotalMoney(20);
		System.out.println(totalMoney);
		/*
		 * PSUEDO CODE
		 * intialmoney =1
		 * temp =0
		 * Total =0
		 * maxdaycnt=7
		 * daycnt =1
		 *  for loop 1 till < = N   1,2,3,4,5,6,7,2,3
		 *  
		 *   if (daycnt =1 )
		 *     { 
		 *       temp = temp + intialmoney;
		 *       daycnt++;
		 *       total = total + temp;
		 *       
		 *     }else if ( daycnt > 1 && daycnt < =7)
		 *       {
		 *          temp = temp+1  ;
		 *          daycnt ++;  
		 *          total = total + temp; 
		 *       }
		 *    else if (daycnt > 7)
		 *      {
		 *         daycnt =2;
		 *         temp =0;
		 *         intialmone =intialmone +1;
		 *         temp = temp + intialmone;
		 *         total = total + temp; 
		 *         
		 *      }
		 *     
		 *     
		 *     return total ;
		 * 
		 * 
		 */

	}

}
