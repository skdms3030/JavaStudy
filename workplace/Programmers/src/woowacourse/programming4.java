package woowacourse;
import java.util.*;

public class programming4 {

	public static void main(String[] args) {
		//�׽�Ʈ ���̽�
		//String s = "aaabbaaa";
		String s = "wowwow";
		
		
		//����
		int count = 1;
		String ss = s + s;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		
		//�⺻�ϋ� �迭 �������
		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i-1) == s.charAt(i)) {
				count++;
			}
			else if(s.charAt(i-1) != s.charAt(i)) {
				list.add(count);
				count = 1;
			}
			if(i == s.length()-1) {
				list.add(count);
			}
		}
		System.out.println(list);
		
		
		//�ٿ��ְ� �迭 �������
		for(int j=1; j<ss.length(); j++) {
			if(ss.charAt(j-1) == ss.charAt(j)) {
				count++;
			}
			else if(ss.charAt(j-1) != ss.charAt(j)) {
				list2.add(count);
				count = 1;
			}
			if(j == ss.length()-1) {
				list2.add(count);
			}
		}
		System.out.println(list2);
		
		
		//�ʿ���°� ����
		/*
		for(int x=list.size(); x<=list2.size(); x++) {
			System.out.println(list2.get(x));
			list2.remove(x);
		}
		//list.remove(0);
		 
		 */
		
		for(int x=list2.size()-1; x>=list.size(); x--) {
			System.out.println(list2.get(x));
			list2.remove(x);
		}
		list2.remove(0);
		Collections.sort(list2);
		
		
		//�迭�� ��ȯ
		int[] answer = new int[list2.size()];
		for(int i=0; i<list2.size(); i++){
			answer[i] = list2.get(i);
		}
		
		
		
		
		
		System.out.println(list2);
		
		
		
		
		
	}

}
