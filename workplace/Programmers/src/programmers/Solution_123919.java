package programmers;

//서울에서 김서방 찾기
public class Solution_123919 {

	public static void main(String[] args) {
		//테스트케이스
		String[] seoul = {"Jane", "Kim"};
		
		//선언
		int location = 0;
		
		//김서방찾기
		for(int i=0; i<seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				location = i;
				break;
			}
		}
		
		System.out.println("김서방은 "+location+"에 있다");
		
		
		
		
		
		
		
	}

}
