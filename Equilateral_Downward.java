package logigaclPatternstudy;

public class Equilateral_Downward {

	public static void main(String[] args) {
		
 //		*******
 //		 *****
 //		  ***
 //		   *
		   //no of rows -->4;
		   //no of column-->7
		int space=0;
		int star=7;
		for(int i=1;i<=4;i++) 
		   {
		for(int j=1;j<=space;j++) 
		   {
		System.out.print(" ");
		   }
		for(int j=1;j<=star;j++) 
		   {
			System.out.print("*");
		   }
		 System.out.println();
		 space++;
	     star=star-2;
			
		}
		
		
		
	}

}
