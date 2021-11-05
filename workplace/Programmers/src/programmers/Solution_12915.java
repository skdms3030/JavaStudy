package programmers;
import java.util.*;

//문자열 내 마음대로 정렬하기
public class Solution_12915 {

	public static void main(String[] args) {
	 	//테스트케이스
		//String[] strings = {"sun", "bed", "car"};	int n = 1;
		String[] strings = {"abce", "abcd","cdx"};	int n = 2;
		
		//선언
		List<String> list = new ArrayList<>();
		char chr = 'a';
		
		
		//사전순 기준 정렬
		Arrays.sort(strings);
		
		//인덱스 기준 정렬
		for(chr = 'a'; chr<'z'+1; chr++) {
			for(int a=0; a<strings.length; a++) {	
				if(strings[a].charAt(n) == chr) {
					System.out.println(chr);
					list.add(strings[a]);
				}
			}
		}
			
		
		//배열로 변경
			for(int j=0; j<strings.length; j++) {
				strings[j] = list.get(j);
			}
		
		System.out.println(list);
		
		
		
		
		/*
		for(char i='a'; i<'z'+1; i++) {
			System.out.println(strings[0].charAt(1));
			if(strings[a].indexOf(n) == i) {
				list.add(strings[i]);
				//a++;
			}
			else {}
		}
		*/
		
		//System.out.println(list);
		
		
	}

}
