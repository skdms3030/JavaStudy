package programmers;
import java.util.*;

//로또의 최고 순위와 최저 순위
public class Solution_77484 {

	public static void main(String[] args) {
		//테스트케이스
		//int[] lottos = {44, 1, 0, 0, 31, 25};	int[] win_nums = {31, 10, 45, 1, 6, 19};
		//int[] lottos = {0, 0, 0, 0, 0, 0};	int[] win_nums = {38, 19, 20, 40, 15, 25};
		int[] lottos = {45, 4, 35, 20, 3, 9};	int[] win_nums = {20, 9, 3, 45, 4, 35};
		
		
		//선언
		int[] answer = new int[2];		//등수 배열
		int count0 = 0;		//0개수
		int count_win = 0;		//진짜 맞은 개수
		List<Integer> list = new ArrayList<>();
		
		
		//ArrayList에 lottos를 넣기
		for(int i=0; i<lottos.length; i++) {
			list.add(lottos[i]);
		}
		
		
		//정답 비교해서 count_win++ or count0++
		for(int j=0; j<win_nums.length; j++) {
			if(list.contains(win_nums[j])) {
				count_win++;
			}
			if (list.get(j) == 0) {
				count0++;
			}
			else {continue;}
		}
		
				
		//등수 매기기
		answer[0] = 7 - (count_win + count0);
		answer[1] = 7 - count_win;
		
		for(int x=0; x<2; x++) {
			if(answer[x] == 7) {
				answer[x] = 6;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		
	}

}
