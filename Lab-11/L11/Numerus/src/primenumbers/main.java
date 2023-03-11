package primenumbers ;

import java.util.Scanner ;

public class main {
	static void findNum(int num) {
		System.out.print(" : Divide by ") ;
		for(int i = 2 ; i < num ; i++) {
			if(num%i == 0) {
				System.out.print(i + ", ") ;
			}//end if
		}//end for
				System.out.println("\b\b") ;
	}//end findNum
	static void checkPrime(int num) {
		boolean prime ;
			for(int i = 2 ; i <= num ; i++) {
				prime = true ;
				System.out.print(i + " = ") ;
			for(int j = 2 ; j < i ; j++) {
				if(i%j == 0) {
				prime = false ;
				System.out.print("Not Prime") ;
				findNum(i) ;
				break ;
				}//end if1
			}//end for2
				if(prime) {
				System.out.println("Prime Number") ;
				}//end if2
			}//end for1
	}//end checkPrime
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in) ;
		System.out.print("Please enter your value : ") ;
		int num = userInput.nextInt() ; 
		System.out.println("-----------------------") ;
		checkPrime(num) ;
	}//end main
}//end class