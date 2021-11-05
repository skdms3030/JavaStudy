package programmers;

//시저암호
public class Solution_12926 {

	public static void main(String[] args) {
		//테스트케이스
		//String s = "AB";	int n=1;
		//String s = "z";	int n=1;
		String s = "a B z";	int n=4;
		//String s = "bC"; 	int n=25;
		
		//선언
		String answer = "";
		char replacestr;
		String big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String blank = " ";
		
		
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<big.length(); j++) {
				if(s.charAt(i) == big.charAt(j)) {
					answer += big.charAt((j+n)%big.length());
				}
				else if(s.charAt(i) == small.charAt(j)) {
					answer += small.charAt((j+n)%small.length());
				}

			}
			if(s.charAt(i) == 0x20) {
				answer += " ";
			}
		}
		
		
		
		
		
		
		/*
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'z') {
				replacestr = (char)('a'-1+(n%25));
			}
			else if(s.charAt(i) == 'Z') {
				replacestr = (char)('A'-1+(n%25));
			}
			else if((int)s.charAt(i) == 0x20) {
				replacestr = (char)(0x20);
			}
			else {
			 replacestr = (char)(s.charAt(i) +(n%25));
			}
			answer += replacestr;
		}
		*/
		System.out.println(answer);
		
		
		
		
		
		
		
	}

}
