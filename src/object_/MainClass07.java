package object_;

import java.util.ArrayList;

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 tc_07 = new TestClass07();
		tc_07.test1(1);
		tc_07.test2(1);
		
		ArrayList<String> arr = new ArrayList<>();
		boolean bo = arr.add("111");
		
		boolean bool = tc_07.test3();
	}
}


