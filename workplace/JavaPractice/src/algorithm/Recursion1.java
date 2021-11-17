package algorithm;

//해당숫자까지 모든 수 더하기
public class Recursion1 {

	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}

	private static int func(int n) {
		if(n<=0)
			return 0;
		else {
			return n+func(n-1);
		}
	}

}
