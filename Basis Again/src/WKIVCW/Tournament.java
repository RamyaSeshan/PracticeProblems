package WKIVCW;

public class Tournament {
	
	public static int tournament(int Teams)
	{
		
		int matches =0;
		while (Teams >1)  //14
		{
		if (Teams%2==0)
		{
			matches = matches+ Teams/2;  
			Teams = Teams /2;		  
		}
		else
		{
			matches = matches+ 1+ ((Teams-1)/2); 
			Teams = (Teams-1) /2;  
			
		}
		}	
		return matches;
		
	}

	public static void main(String[] args) {
		//int Teams =14;
		int Teams =7;
		int tournament = tournament( Teams);
		System.out.println(tournament);
		
		/*
		 * PSUEDO CODE 
		 * if (N%2==0)     team 3 , match 3 
		 * {
		 *   team = team/2;
		 *   Mateches = Matches + N/2
		 * }
		 * 
		 * else 
		 * {
		 *   team = (team-1) /2;  //  3 ,1
		 *   matches = matches + 1+(team-1) / 4 + 1+1
		 * }
		 * 
		 */

	}

}
