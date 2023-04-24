package object_;

public class TestClass05 {
	//합을 구하는 프로그램
	public int sumFunc(int num){
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		//return
		// - 값을 돌려주면서 해당 메소드를 종료
		// - 값이 없으면 해당 메소드만 종료
		// - return으로 값을 돌려줄 경우 하나만 가능하다
		return sum;
	}//sumFunc
}


