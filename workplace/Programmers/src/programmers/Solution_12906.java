package programmers;

import java.util.ArrayList;
import java.util.List;

//같은 숫자는 싫어
public class Solution_12906 {

	public static void main(String[] args) {
		//테스트케이스
		//int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		
		
		//선언
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		
		//answer와 비교하며 추가
		for(int key : arr) {
			if(list.get(list.size()-1) != key) {
				list.add(key);
			}
			else {continue;}
		}
		
		
		//arraylist를 배열로
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		
		//출력
		for(int key : answer) {
			System.out.println(key);
		}
		
		
		
		
		
		
	}

}
