package object_;

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 tc_06 = new TestClass06();
		int [] arr;
		int sum;
		arr = tc_06.myInput();
		sum = tc_06.test(arr[0],arr[1]);
		tc_06.print(arr,sum);
	}
}