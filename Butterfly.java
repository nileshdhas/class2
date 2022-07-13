package logigaclPatternstudy;

public class Butterfly {

	

	public static void main(String[] args) 
	
	{
		int star=1; // star on the first row left
		int space=5;//space on the first row left
		int star2=1;//star on first row right side
		int space2=4;// spce on the first row right side
		
		for(int i=1;i<=9;i++) //outer loop for row
		{
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int m=1;m<=space2;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=star2;n++) {
				System.out.print("*");
			}
			
			if(i<5) {
				star++;
				space--;
				star2++;
				space2--;
			}
			else {
				star--;
				space++;
				star2--;
				space2++;
			}
			System.out.println();
			}
		
		
		
		
		
		
		

	}

}
