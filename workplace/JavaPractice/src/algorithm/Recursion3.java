package algorithm;

//Á¦°ö °á°ú ±¸ÇÏ±â (4ÀÇ 3Á¦°ö)
public class Recursion3 {

	public static void main(String[] args) {
		int result = power(4,3);
		System.out.println(result);
	}

	private static int power(int x, int n) {
		if(n==0)
			return 1;
		else
			return x*power(x, n-1);
	}

}
