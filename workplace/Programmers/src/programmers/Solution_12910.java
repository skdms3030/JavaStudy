package programmers;

import java.util.*;

//������ �������� ���� �迭
public class Solution_12910 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//int[] arr = {5, 9, 7, 10};	int divisor = 5;
		//int[] arr = {2, 36, 1, 3};	int divisor = 1;
		int[] arr = {3,2,6};	int divisor = 10;
		
		
		//����
		List<Integer> list = new ArrayList<>();
		
		//��
		for(int key : arr) {
			if(key%divisor == 0) {
				list.add(key);
			}
			else {continue;}
		}
		
		//����ó��
		if(list.size()<1) {
			list.add(-1);
		}
		
		//����
		Collections.sort(list);
		
		//���
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println(answer);
		System.out.println(list);
		
		
	}

}
