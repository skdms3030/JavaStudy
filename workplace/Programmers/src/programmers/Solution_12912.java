package programmers;

//두 정수 사이의 합
public class Solution_12912 {

	public static void main(String[] args) {
		//테스트케이스
		//int a=3;	int b=5;
		//int a=3;	int b=3;
		int a=5;	int b=3;
		
		//선언
		long answer = 0;
		int smallNum = 0;
		int bigNum = 0;
		
		//대소 비교
		if(a>b) {
			smallNum = b;
			bigNum = a;
		}
		else if(a<b) {
			smallNum = a;
			bigNum = b;
		}
		
		
		//계산
		if(a != b) {
			for(int i=smallNum; i<bigNum+1; i++) {
				answer += i;
			}
		}
		else {answer = a;}
		
		//출력
		System.out.println(answer);
		
		
		
		
	}

}
