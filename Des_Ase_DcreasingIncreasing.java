package logigaclPatternstudy;

public class Des_Ase_DcreasingIncreasing {

	public static void main(String[] args) 
	{//----------------------------
//	  *****
//	  ****
//	  ***
//	  **
//	  *
//	  **
//	  ***
//	  ****
//	  *****
	//-----------------------------	
		//rows>9;
		//col>5;
		int star=5;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=star;j++) 
			{
				System.out.print("*");
			}
		  System.out.println();
		if(i<=4) {
			star--;
		}
		else {
			star++;
		}
		}
		

		
		
		
	}

}
