package programmers;

//가운데 글자 가져오기
public class Solution_12903 {

	public static void main(String[] args) {
		//테스트케이스
		//String s = "abcde";
		//String s = "qwer";
		String s = "1";
		
		
		
		//선언
		String answer;
		answer = s;
		
		//홀짝 판단
		if(s.length()%2 == 0) {
			for(int i=0; i<s.length()/2-1; i++) {
				String sFirst = Character.toString(s.charAt(i));
				String sLast = Character.toString(s.charAt(s.length()-i-1));
				answer = answer.replaceFirst(sFirst, "");
				answer = answer.replaceFirst(sLast, "");
			}
		}
		else {
			for(int j=0; j<s.length()/2; j++) {
				String sFirst = Character.toString(s.charAt(j));
				String sLast = Character.toString(s.charAt(s.length()-j-1));
				answer = answer.replaceFirst(sFirst, "");
				answer = answer.replaceFirst(sLast, "");
			}
		}
		
		System.out.println(answer);
		
		
	}

}
