package HashMap_Practice;

import java.util.*;

//완주하지 못한 선수_해시맵
public class Solution_42576 {

	public static void main(String[] args) {
		//테스트 케이스
		//String[] participant = {"leo", "kiki", "eden"};		String[] completion = {"eden", "kiki"};
		//String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};		String[] completion = {"stanko", "ana", "mislav"};
		
		//선언
		int value = 0;
		
		
		//해시맵 생성
		HashMap<String, Integer> hm = new HashMap<>();
		
		//해시맵에 참가자 리스트 넣기(중복값있으면 value++/ 중복값없으면 1)
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
		
		//성공자 리스트랑 비교(성공자 이름이 해시맵에 있으면 value를 1씩 뺌)
		for(int j=0; j<completion.length; j++) {
			value = hm.get(completion[j]);
			value--;
			hm.put(completion[j], value);
		}
		
		//value값이 0이 아닌 애가 있는지 검사
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
