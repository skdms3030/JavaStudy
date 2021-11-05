package programmers;

//문자열 내 p와 y의 개수
public class Solution_12916 {

	public static void main(String[] args) {
		//테스트케이스
		//String s = "pPoooyY";
		String s = "Pyy";
		
		//선언
		int count_p = 0;
		int count_y = 0;
		boolean answer;
		
		
		//갯수 세기
		for(int i=0; i<s.length(); i++) {
			if(s.toUpperCase().charAt(i) == 'P') 
				count_p++;
			if(s.toUpperCase().charAt(i) == 'Y') 
				count_y++;
		}
		
		//갯수 비교
		if(count_p == count_y) 
			answer = true;
		else 
			answer = false;
		
		System.out.println(answer);
		
		
	}

}
