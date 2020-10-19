package Assignment6_NestedForLoop;

public class Question_3 {

	public static void main(String[] args) {
		
		for(int row=1 ; row<=7; row++) {
			for(int i=1; i<row;i++) {
				System.out.print(" ");
			}
			for(int col=row; col<=7; col++) {
				System.out.print(col+ " ");			
		}
		
			System.out.println();			
		}
				
		for(int row=6 ; row>=1; row--) {
			
			for(int j=1;j<row; j++) {
				System.out.print(" ");	
			}
			for(int col=row; col<=7; col++) {
				System.out.print(col+ " ");
			
			}
			
			System.out.println();
		}
		
			
			
		}
		
		
		
		
		
		
	}


