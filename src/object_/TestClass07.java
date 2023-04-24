package object_;

public class TestClass07 {
	public void test1(int num) {
		if(num ==1) {
			System.out.println(111);
			return;
		}System.out.println("다음");
	}
	
	public int test2(int n) {
		if(n==1) {
			System.out.println("test1 111");
			return 100;
		}else if(n==1) {
			System.out.println("test2 222");
			return 200;
		}else {
			System.out.println("다음");
			return 0;
		}
	}
	
	public boolean test3() {
		return true;
	}
	public String test4() {
		int num = 1;
		if(num==1) {
			return "aaa";
		}
		return null;
	}
}


