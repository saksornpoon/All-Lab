package Numerus;

import java.util.Scanner;

public class Numerus 
{	
    public static void main(String[] args) 
    {
    	System.out.print("Please enter your value : ");
    		
    		int x;
    		int c = 5 ;
    		Scanner sf = new Scanner(System.in);
    		x = sf.nextInt();
    		
    	System.out.print(" ");
    	System.out.println("------------------------");
    	
    	for (int i = 1 ; i <= x ; i++) {
    		if(i == x) {
    			System.out.print(i);
    		}else {
    		if(i == c) {
    			System.out.print(i);
    			System.out.println();
    			c = c + 5 ;
    		}else {	
    			System.out.print(i +",");
    		}
    		}
    	}
    }
}