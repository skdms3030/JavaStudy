package programmers;

public class Solution42577_1 {
	public static void main(String[] args) {
		
		String[] participant = 	{"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		
		Solution1 s = new Solution1();
		System.out.println(s.solution(participant, completion));
		
	}
}
	class Solution1 {
	    public String solution(String[] participant, String[] completion) {
		String answer = "";
        
		
		
        String[] p = participant.clone();
        String[] c = completion.clone();
        
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<c.length; j++) {
				if(p[i].equals(c[j])) {
					//System.out.println(participant[i] +""+ completion[j]);
					p[i]="0";
					c[j]="0";
				}
			}
		}
		
		for(int i=0; i<p.length; i++) {
			//System.out.println(participant[i]);
		}
		
		
		for(int i=0; i<p.length; i++) {
			if(!p[i].equals("0")) {
				answer = p[i];
			}
		}
		
		
		return answer;

    }
	}




