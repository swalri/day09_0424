package object_;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestClass04 tc04 = new TestClass04();
		int num = 0, sum = 0;
		
		System.out.print("수 입력 : ");
//parameter : 메소드에 넘겨주는 값
//			  인자값
		num = scan.nextInt();	
		
		tc04.sumFunc(num);
		System.out.println("main end");
		
		
		
		
		
	}
}