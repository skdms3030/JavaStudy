package algorithm;

//최대공약수 구하기
public class Recursion5 {

	public static void main(String[] args) {
		int result = gcd(10, 15);
		System.out.println(result);
	}

	private static int gcd(int m, int n) {
		if(m<n) {
			int tmp=m; m=n; n=tmp;	//m이 더 큰수이도록 자리 바꿔줌
		}
		if(m%n==0)
			return n;
		else
			return gcd(n, m%n);
	}

}
