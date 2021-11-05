package programmers;
import java.util.*;

//문자열 내림차순으로 배치하기
public class Solution_12917 {

	public static void main(String[] args) {
		//테스트케이스
		String s = "Zbcdefg";
		
		//선언
		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		//문자를 배열에 저장
		for(int i=0; i<s.length(); i++) {
			String ch = Character.toString(s.charAt(i));
			list.add(ch);
		}
		
		//거꾸로 정렬
		Collections.sort(list);
		for(int j=list.size()-1; j>=0; j--) {
			list2.add(list.get(j));
		}
		
		//list를 문자열로 바꾸기
		s = "";
		for(String key : list2) {
			s += key;
		}
		
		System.out.println(s);
		
		
		
		
		
	}

}
