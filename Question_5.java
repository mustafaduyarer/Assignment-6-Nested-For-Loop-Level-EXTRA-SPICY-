package Assignment6_NestedForLoop;

public class Question_5 {

	public static void main(String[] args) {
		
		int totalRows=8;
		
		for(int row=1; row<=totalRows; row++) {
			
			for(int i=1; i<=totalRows-row; i++) {
			System.out.print(1);
			}
			for(int i=1;i<=row; i++) {
				System.out.print(row);
			}	
			System.out.println();
		}
		
		

	}

}
