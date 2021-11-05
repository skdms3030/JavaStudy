package programmers;

//문자열을 정수로 바꾸기
public class Solution_12925 {

	public static void main(String[] args) {
		//테스트케이스
		//String str = "1234";
		//String str = "+1234";
		String str = "-1234";
		
		//선언
		int answer = 1;
		
		/*
		//음수, 양수 구분
		if(str.charAt(0)=='-') {
			answer *= -1;
			str.replace("-","");
		}
		if(str.charAt(0)=='+') {
			str.replace("+","");
		}
		*/
		
		answer = Integer.parseInt(str);
		
		System.out.println(answer);
		
		
		
		
		
		
	}

}
