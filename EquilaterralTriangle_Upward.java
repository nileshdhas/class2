package logigaclPatternstudy;

public class EquilaterralTriangle_Upward {

	public static void main(String[] args) 
	{
//		
//	     *
//	    ***
//	   *****
//	  *******
		//no of rowes..>4;
		//no of colu..>7
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++) 
		{
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		System.out.println();
		space--;
		star=star+2;
		}
		
	}

}
