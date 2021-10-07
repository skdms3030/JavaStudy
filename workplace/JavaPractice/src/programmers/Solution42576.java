package programmers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution42576 {
	public static void main(String[] args) {
		
		String[] participant = 	{"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		
		Solution s = new Solution();
		System.out.println(s.solution(participant, completion));
		
	}
}
	class Solution {
	    public String solution(String[] participant, String[] completion) {
		String answer = "";
        
		
		
        String[] p = participant.clone();
        String[] c = completion.clone();
        
       Arrays.sort(p);
       Arrays.sort(c);
       
       for(int i=0; i<c.length; i++) {
    	   if(!p[i].equals(c[i])) {
    		   return p[i];
    	   }
       }
       
       return p[p.length-1];


    }
	}




