package lab4;
import java.util.*;
public class MyCurrentArray extends MyClassicalArray {

	public void sort() {
		Arrays.sort(this.MyArray);
		System.out.print("Sort Array :  ");
		for(int i = 0 ; i < this.MyArray.length; i++) {
			System.out.print(this.MyArray[i]);
				if(i < this.MyArray.length - 1) {
					System.out.print(", ");
			}
		}
		System.out.println();
	}
	public boolean Search(int F) {
		for(int i = 0 ; i < this.MyArray.length; i++) {
			if (this.MyArray[i] == F) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		MyCurrentArray arr = new MyCurrentArray();	
		arr.sort();
		int F = 33;
		int max = arr.FindMax();
		System.out.println("Max value is : "+max);
		int min = arr.FindMin();
		System.out.println("Min value is : "+min);
		
		System.out.print("Search value result : "+F+" = ");
		System.out.print(arr.Search(F));
	}
}