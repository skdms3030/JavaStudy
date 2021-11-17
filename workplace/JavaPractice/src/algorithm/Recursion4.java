package algorithm;

//피보나치 수열 구하기(피보나치 4번쨰 수 구하기)
public class Recursion4 {

	public static void main(String[] args) {
		int result = fibonacci(4);
		System.out.println(result);
	}

	private static int fibonacci(int n) {
		if(n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}

}
