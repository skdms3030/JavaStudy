package woowacourse;
import java.util.*;

public class programming1 {

	public static void main(String[] args) {
		//테스트 케이스
		int[] arr = {2, 1, 3, 1, 2, 1};
		//int[] arr = {3, 3, 3, 3, 3, 3};
		//int[] arr = {1, 2, 3};
		
		//선언
		int count3 = 0;
		int count2 = 0;
		int count1 = 0;
		int max = 0;
		List<Integer> list = new ArrayList<>();
		int[] answer = new int[3];
		
		
		//갯수세기
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 3) count3++;
			else if(arr[i] == 2) count2++;
			else if(arr[i] == 1) count1++;
		}
		
		//최댓값 구하기
		if(count3>=count1 && count3>=count2) {max = count3;}
		else if(count2>=count1 && count2>=count3) {max = count2;}
		else if(count1>=count2 && count1>=count3) {max = count1;}
		
		//배열에 추가
		list.add(max-count1);
		list.add(max-count2);
		list.add(max-count3);
		
		System.out.println(list);
		
		
		//배열로 변환
		for(int j=0; j<3; j++) {
			answer[j] = list.get(j);
		}
		
		
		
		
		
		
		
		
	}

}
