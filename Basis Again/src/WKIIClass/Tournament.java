package WKIIClass;

public class Tournament {
	
	public static int Check(int Teams)  /// 14
	{
		int Matches =0;
		
	  while(Teams > 1)
	  {
		  if (Teams %2==0)
		  {
			  Matches = Matches + (Teams /2); //3+2=5+1 =6
			  Teams = Teams-(Teams / 2);  // 4- 2=2  |1 
			  
			   }
		  else 
		  {
			  Matches = Matches + ((Teams-1)/2); //0+3 =3  |
			  Teams = Teams- ((Teams-1)/2);  // 7- 3=4 |			 
			 	  }
	  }	
		return Matches ;
		
	}

	public static void main(String[] args) {		
		int check = Check(7);
		System.out.println(check);

	}

}
