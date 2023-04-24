package object_;

import java.util.Scanner;

public class TestClass06 {
	public int[] myInput() {
		Scanner scan = new Scanner(System.in);
		int n1,n2;
		System.out.print("수 입력 ");
		n1 = scan.nextInt();
		System.out.print("수 입력 ");
		n2 = scan.nextInt();
		int [] arr = {n1,n2};
		return arr;
	}
	public int test(int n1,int n2){
		int sum = n1+n2;
		return sum;
	}
	public void print(int[] arr, int sum) {
		System.out.println(arr[0]+"+"+arr[1]+"="+sum);
	}
}