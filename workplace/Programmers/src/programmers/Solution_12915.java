package programmers;
import java.util.*;

//���ڿ� �� ������� �����ϱ�
public class Solution_12915 {

	public static void main(String[] args) {
	 	//�׽�Ʈ���̽�
		//String[] strings = {"sun", "bed", "car"};	int n = 1;
		String[] strings = {"abce", "abcd","cdx"};	int n = 2;
		
		//����
		List<String> list = new ArrayList<>();
		char chr = 'a';
		
		
		//������ ���� ����
		Arrays.sort(strings);
		
		//�ε��� ���� ����
		for(chr = 'a'; chr<'z'+1; chr++) {
			for(int a=0; a<strings.length; a++) {	
				if(strings[a].charAt(n) == chr) {
					System.out.println(chr);
					list.add(strings[a]);
				}
			}
		}
			
		
		//�迭�� ����
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
