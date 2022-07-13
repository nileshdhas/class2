package logigaclPatternstudy;

public class AScDecs_IncreasingDcresing {

	
	public static void main(String[] args) 
	{
		
//	*
//	**
//	***
//	****
//	***
//	**
//	*
		//ROWS>7;
		int star=1;
		for(int i=1;i<=7;i++) 
		   {
			for(int j=1;j<=star;j++) 
			  {
				System.out.print("*");
			  } 
			System.out.println();
			if(i<4) 
			 {
				star++;
			 }
			else 
			 {
				star--;
			 }
		}
		
		

	}

}
