package algorithm;

//�ִ����� ���ϱ�
public class Recursion5 {

	public static void main(String[] args) {
		int result = gcd(10, 15);
		System.out.println(result);
	}

	private static int gcd(int m, int n) {
		if(m<n) {
			int tmp=m; m=n; n=tmp;	//m�� �� ū���̵��� �ڸ� �ٲ���
		}
		if(m%n==0)
			return n;
		else
			return gcd(n, m%n);
	}

}
