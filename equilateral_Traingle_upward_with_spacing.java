package logigaclPatternstudy;

public class equilateral_Traingle_upward_with_spacing {

	public static void main(String[] args) {
		
//		    *
//		   * *
//		  * * * 
//		 * * * *
//		* * * * *
		
	//rows=5;
   //col=7;
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		
	}

}
