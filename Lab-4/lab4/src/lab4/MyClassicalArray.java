package lab4;
import java.util.*;
public class MyClassicalArray {
	public int [] MyArray = new int[10];
	
	
	public MyClassicalArray() {
		this.MyArray= new int[10];
		Random R = new Random();
		for(int i = 0 ; i < 10; i++) {
			this.MyArray[i] = R.nextInt(99) + 1;
			System.out.println(this.MyArray[i]);
			
	}
}
	
		public static void main(String[] args) {
			
			MyClassicalArray arr = new MyClassicalArray();
			
				int max = arr.FindMax();
				System.out.println("Max value is : "+max);
				int min = arr.FindMin();
				System.out.println("Min value is : "+min);
			}
		
		public int FindMax() {

			int max = this.MyArray[0];
			for(int i = 0 ; i < this.MyArray.length ; i++) {
				if(this.MyArray[i] > max) {
					max = this.MyArray[i];
				}
			}
			return max;
		}
		public int FindMin() {

			int min = this.MyArray[0];
			for(int i = 0 ; i < this.MyArray.length ; i++) {
				if(this.MyArray[i] < min) {
					min = this.MyArray[i];
				}
			}
			return min;
		}
	}