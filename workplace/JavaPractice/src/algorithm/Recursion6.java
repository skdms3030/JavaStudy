package algorithm;

//�ִ����� ���ϱ�(�� �����ϰ�)
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
