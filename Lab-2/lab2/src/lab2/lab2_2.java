package lab2;
import java.util.*;

public class lab2_2 {
	public static void main(String[] args) {
		 int i,n,counter, j ,p ;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter your value : ");
	        n=scanner.nextInt();
	        for(j=2;j<=n;j++){
	           counter=0;
	           for(i=1;i<=j;i++){
	              if(j%i==0){
	                 counter++;
	              }
	           }
	           if(counter==2) {
	               System.out.print(j+" = Prime Number ");
	               System.out.println();
	           }else if (counter!=1) {
	               System.out.print(j+" = Not Prime : Divide by ");
	               for(p=2;p<=j;p++) {
	            	   if(j % p == 0 && j != p ) {
	                       System.out.print(p);
	                       System.out.print(", ");
	                   }
	               }
	               System.out.println();
	           }
	        }
    }
}
