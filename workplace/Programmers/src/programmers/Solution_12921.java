package programmers;
import java.util.*;

//�Ҽ�ã��
public class Solution_12921 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		//int n =10;
		int n =5;
		
		//����
		List<Integer> list = new ArrayList<>();
		//List<Integer> list2 = new ArrayList<>();
		int answer = 0;
		
		
		
		
		//arrayList�� �ֱ�
		for(int i=1; i<=+n; i++) {
			list.add(i);
		}
		
		
		
		//�Ҽ��� �ƴϸ� remove
		for(int i=0; i<list.size(); i++) {
			for(int j=2; j*j<=list.get(i); j++) {
				System.out.println(i+" "+j);
				if(list.get(i)%j==0) {
					list.remove(list.get(i));
				}
			}
		}
		list.remove(0);
		
		
		/*
		for(int i=2; i<=n; i++) {
			for(int j=2; j<i; j++) {
				if(i%j != 0 && i!=j)
					list.add(i);
				else continue;
			}
		}
		*/
		
		/*
		for(int i=2; i<=n; i++) {
			//int count =0;
			boolean thtn = false;
			for(int j=2; j*j<i; j++) {
				//if(i%j == 0)count+=1;
				if(!(i%j == 0)) { 
					thtn = true;
					System.out.println(i);
				}
			}
			if(thtn) {
				answer++;
			}
			//if(count==0) answer++;
		}
		*/
		
		System.out.println(list);
		System.out.println(list.size());
		
		
		
		
	}

}
