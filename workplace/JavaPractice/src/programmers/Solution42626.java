package programmers;

import java.util.Arrays;

public class Solution42626 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		Solution2 s = new Solution2();
		System.out.println(s.solution(scoville, K));
	}

}

class Solution2{
	
    public int solution(int[] scoville, int K) {
    	
    	int[] s = scoville.clone();
    	int k = K;
        int count = 0;
        
        for(int i=0; i<s.length; i++) {
        	Arrays.sort(s);
        	if(s[i] != 0 && s[i]<7) {
        		s[i] = 0;
        		s[i+1] = (s[i] + (s[i+1]*2));
        		count++;
        		if(s[i+1]>k) {
        			return count;
        		}
        		else {
        			break;
        		}
        	}
        	else {
        		continue;
        	}
        }
        
        
//        while(ture) {
//        	int i=1;
//        	if(s[i] != 0 && s[i]<7) {
//        		s[i] = 0;
//        		s[i+1] = (s[i] + (s[i+1]*2));
//        		count++;
//        		if(s[i+1]>k) {
//        			return count;
//        			break;
//        		}
//        		else {
//        			continue;
//        		}
//        	}
//        	else {
//        		continue;
//        	}
//        }
        
        
        return count;
    }
    
}
