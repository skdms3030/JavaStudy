package HashMap_Practice;

import java.util.*;

//�������� ���� ����_�ؽø�
public class Solution_42576 {

	public static void main(String[] args) {
		//�׽�Ʈ ���̽�
		//String[] participant = {"leo", "kiki", "eden"};		String[] completion = {"eden", "kiki"};
		//String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};		String[] completion = {"stanko", "ana", "mislav"};
		
		//����
		int value = 0;
		
		
		//�ؽø� ����
		HashMap<String, Integer> hm = new HashMap<>();
		
		//�ؽøʿ� ������ ����Ʈ �ֱ�(�ߺ��������� value++/ �ߺ��������� 1)
		for(int i=0; i<participant.length; i++) {
			if(hm.containsKey(participant[i])) {
				value = hm.get(participant[i]);
				value++;
				hm.put(participant[i], value);
			}
			else {
				hm.put(participant[i], 1);
			}
		}
		
		//������ ����Ʈ�� ��(������ �̸��� �ؽøʿ� ������ value�� 1�� ��)
		for(int j=0; j<completion.length; j++) {
			value = hm.get(completion[j]);
			value--;
			hm.put(completion[j], value);
		}
		
		//value���� 0�� �ƴ� �ְ� �ִ��� �˻�
		Set<String> ks = hm.keySet();
		List<String> list = new ArrayList<>();
		for(String key : ks) {
			if(hm.get(key) > 0) {
				//list.add(key);
				System.out.println(key);
				//return hm.get(key);
			}
			else {continue;}
		}
		
		
		
	}

}
