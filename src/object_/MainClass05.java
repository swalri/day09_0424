package object_;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestClass05 tc05 = new TestClass05();
		int num = 0, sum = 0;
		
		System.out.print("수 입력 : ");
		num = scan.nextInt();	
		
		sum = tc05.sumFunc(num);
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}
}


