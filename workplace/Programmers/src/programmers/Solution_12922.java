package programmers;

//수박수박수박수박수박수?
public class Solution_12922 {

	public static void main(String[] args) {
		//테스트케이스
		int n = 3;
		//int n = 4;
		
		//선언
		String answer = "";
		
		//계산
		for(int i=0; i<n; i++) {
		answer += (i%2==0)? "수" : "박";
		}
		System.out.println(answer);
		
		
		
		
		
		
		
	}

}
