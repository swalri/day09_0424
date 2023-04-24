package object_;

import java.util.Scanner;

public class TestClass03 {
	//합을 구하는 프로그램
	public void sumFunc(){
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum = 0;
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합 : "+sum);
	}//sumFunc
}


