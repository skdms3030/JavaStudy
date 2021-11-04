package programmers;

//가운데 글자 가져오기
public class Solution_12903_2 {

	public static void main(String[] args) {
		//테스트케이스
		String s = "abcde";
		//String s = "qwer";
		//String s = "1";
				
				
				
		//선언
		String answer;
		answer = s;
		
		//홀짝 판단
		if(s.length()%2 == 0) {
			int gijun = s.length()/2-1;
			answer = s.substring(gijun, gijun+2);
		}
		else {
			int gijun = s.length()/2;
			answer = s.substring(gijun, gijun+1);
		}
		
		System.out.println(answer);

	}

}
