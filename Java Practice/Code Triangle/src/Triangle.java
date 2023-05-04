import java.util.Scanner;
public class Triangle {
	
static Scanner console = new Scanner(System.in);

  public static void main(String[] args){
	  
   int j, x, y, z;
   System.out.println ("Enter number of rows : ");
   Scanner in = new Scanner(System.in);
   		z = in.nextInt();
   		x = z + 4 - 1; 
		    
    for(int i = 1 ; i <= z ; i++) {
    	for(y = x ; y != 0 ; y--)
    	{
   System.out.print(" ");
    }
    	for(j = 1 ; j <= i ; j++)
    	{
    System.out.print(i + " ");
    }
	System.out.println();
    x--;
   }
}
}