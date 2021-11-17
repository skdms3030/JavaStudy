package algorithm;

//문자열의 길이 계산
public class Recursion7 {

	public static void main(String[] args) {
		int result = length("ace");
		System.out.println(result);
	}

	private static int length(String str) {
		if(str.equals(""))
			return 0;
		else
			return 1+length(str.substring(1));	//str.substring(1)은 str 문장의 맨앞 1글자를 뺸 문자열이라는 뜻
	}

}
