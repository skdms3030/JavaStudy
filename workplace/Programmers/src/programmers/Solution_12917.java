package programmers;
import java.util.*;

//���ڿ� ������������ ��ġ�ϱ�
public class Solution_12917 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		String s = "Zbcdefg";
		
		//����
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		//���ڸ� �迭�� ����
		for(int i=0; i<s.length(); i++) {
			String ch = Character.toString(s.charAt(i));
			list.add(ch);
		}
		
		//�Ųٷ� ����
		Collections.sort(list);
		for(int j=list.size()-1; j>=0; j--) {
			list2.add(list.get(j));
		}
		
		//list�� ���ڿ��� �ٲٱ�
		s = "";
		for(String key : list2) {
			s += key;
		}
		
		System.out.println(s);
		
		
		
		
		
	}

}
