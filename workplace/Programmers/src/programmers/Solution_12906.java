package programmers;

import java.util.ArrayList;
import java.util.List;

//���� ���ڴ� �Ⱦ�
public class Solution_12906 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		
		
		//����
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		
		//answer�� ���ϸ� �߰�
		for(int key : arr) {
			if(list.get(list.size()-1) != key) {
				list.add(key);
			}
			else {continue;}
		}
		
		
		//arraylist�� �迭��
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		
		//���
		for(int key : answer) {
			System.out.println(key);
		}
		
		
		
		
		
		
	}

}
