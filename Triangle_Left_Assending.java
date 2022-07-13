package logigaclPatternstudy;

public class Triangle_Left_Assending {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//ROW-->5 COL-->5
		int star=1;// write no of star in first row
		for(int i=1;i<=5;i++)// outer loop for row 
		{
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
		
		
		
	}

}
