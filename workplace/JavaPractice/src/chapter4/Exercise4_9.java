package chapter4;

public class Exercise4_9 {
	//문자열 12345의 모든 숫자를 더하기
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += (int)(str.charAt(i))-48;
		}
		
		System.out.println(sum);

	}

}
