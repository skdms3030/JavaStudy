package chapter4;

public class Exercise4_10 {
	//대문자를 소문자로 바꾸는 코드
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println(sum);

	}

}
