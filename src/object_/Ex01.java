package object_;

import members_.Member;

/*
절차지향
 - c언어는 절차지향 언어라고 표현한다.
 - 기능들로만 이루어져있다
 - 함수들의 집합으로 만들어진 프로그램이다
 - 객체지향보다 처리 속도가 빠르다
객체지향
 - c++, pytion, java..등의 언어
 - 클래스라는 자료형으로 만들어진 것
 - 재활용이 용이하다
 - 절차지향보다 처리속도는 느리다.\
 - 객체는 변수다. 클래스라는 자료형으로 만들면 객체라고 표현한다.
클래스
 - 사용자 정의 자료형
 - 변수와 기능들의 집합을 만한다
 - 재활용하기 편해서 만들어 사용한다
*/



public class Ex01 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		m.name = "kim";
		m.addr = "시골";
		System.out.println("이름 : "+m.name);
		System.out.println("주소 : "+m.addr);
	}
}