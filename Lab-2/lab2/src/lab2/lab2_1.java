package lab2;
import java.util.*;  

public class lab2_1 {
	private static Scanner sc;
	  public static void main(String[] args) {
		  int n, i;
		  sc = new Scanner(System.in);		
		  System.out.print(" Please Enter any Number : ");
		  n = sc.nextInt();
		  for(i = 1; i <= n; i++)
		  {
			  System.out.print(i);
			  if (i % 5 == 0){
				  System.out.println();
			  }else {
				  System.out.print(", ");
			  }
		  }
	  }
}