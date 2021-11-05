package programmers;

//문자열 다루기 기본
public class Solution_12918 {

	public static void main(String[] args) {
		//테스트케이스
		//String s = "a1234";
		String s = "1234";
		
		//선언
		boolean answer = true;
		
		//비교
		if(s.length()==4 || s.length()==6) {
			for(int i=0; i<s.length(); i++) {
				if(!(s.charAt(i) <= 'z' && s.charAt(i)>='a')) {
					answer = true;
				}
				else {answer = false; break;}
			}
		}
		else{answer = false;}

		
		System.out.println(answer);
		
	}

}
