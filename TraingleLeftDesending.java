package logigaclPatternstudy;

public class TraingleLeftDesending {

	public static void main(String[] args) 
	{
//		*****
//		****
//		***
//		**
//		*
	
		//no of rows-->5;
		//no of clo-->5;
		int star=5;// star in first line
		
		for(int i=1;i<=5;i++) 
		{
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		star--;//reducing the one star in one line
		}
		
		
		
	}

}
