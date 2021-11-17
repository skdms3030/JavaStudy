package algorithm;

//최대공약수 구하기(더 간단하게)
public class Recursion6 {

	public static void main(String[] args) {
		int result = gcd(10, 15);
		System.out.println(result);
	}

	private static int gcd(int p, int q) {
		if(q==0)
			return p;
		else
			return gcd(q, p%q);
	}

}
