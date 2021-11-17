package woowacourse;
import java.util.*;

public class programming4 {

	public static void main(String[] args) {
		//테스트 케이스
		//String s = "aaabbaaa";
		String s = "wowwow";
		
		
		//선언
		int count = 1;
		String ss = s + s;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		
		//기본일떄 배열 만들어줌
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
		
		
		//붙여주고 배열 만들어줌
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
		
		
		//필요없는거 제거
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
		
		
		//배열로 변환
		int[] answer = new int[list2.size()];
		for(int i=0; i<list2.size(); i++){
			answer[i] = list2.get(i);
		}
		
		
		
		
		
		System.out.println(list2);
		
		
		
		
		
	}

}
