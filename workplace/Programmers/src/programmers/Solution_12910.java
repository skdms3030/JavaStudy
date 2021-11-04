package programmers;

import java.util.*;

//나누어 떨어지는 숫자 배열
public class Solution_12910 {

	public static void main(String[] args) {
		//테스트케이스
		//int[] arr = {5, 9, 7, 10};	int divisor = 5;
		//int[] arr = {2, 36, 1, 3};	int divisor = 1;
		int[] arr = {3,2,6};	int divisor = 10;
		
		
		//선언
		List<Integer> list = new ArrayList<>();
		
		//비교
		for(int key : arr) {
			if(key%divisor == 0) {
				list.add(key);
			}
			else {continue;}
		}
		
		//공백처리
		if(list.size()<1) {
			list.add(-1);
		}
		
		//정렬
		Collections.sort(list);
		
		//출력
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(answer);
		System.out.println(list);
		
		
	}

}
