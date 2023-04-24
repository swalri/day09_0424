package object_;

import java.util.Scanner;

public class MainClass03 {
/*
method
 - 함수 와 메소드는 비슷하다.
 - 어떤한 기능을 가지고 있다면 함수 또는 메소드라고 표현한다.
 - 소괄호가 있으면 대부분 기능이라고 보면된다.
 - 함수는 절차지향언어에서 표현하는 방식이며 메소드는 객체지향 표현
*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("main start");
		TestClass03 tc03 = new TestClass03();
		tc03.sumFunc();
		System.out.println("main end");
		
		
		
		
		
		
	}
}


