import java.util.Scanner;
public class StarRectangle {
	static Scanner console = new Scanner(System.in);
	private static Scanner in;
	public static void main(String[] args) {
		int rows, columns, i, j;
		in = new Scanner(System.in);
		
		System.out.print(" Enter Number of Rows : ");
		rows = in.nextInt();	
		
		System.out.print(" Enter Number of Columns : ");
		columns = in.nextInt();		
			
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= columns; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	
	}
}