package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Solution42627_1 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		
		Solution3 s = new Solution3();
		System.out.println(s.solution(scoville, K));
	}

}

class Solution3{
	
    public int solution(int[] scoville, int K) {
    	
    	int[] s = scoville.clone();
    	int k = K;
        int count = 0;
        ArrayList<Integer> list = new ArrayList();
        
        for(int i=0; i<s.length; i++) {
        	list.add(s[i]);
        }
        
        
        int i=0;
        while(true) {
        	
        	Collections.sort(list);
        	
        	if(list.get(i)>k) {break;}
        	else if(list.get(i)<k && list.get(i)!=0) {
        		//list.add(list.get(i) + list.get(i+1));
        		
        		list.set(i+1, list.get(i) + (list.get(i+1)*2));
        		//System.out.println(list.get(i+1));
        		list.set(i,0);
        		//System.out.println(list.get(i));
        		count++;
        		i=0;
        		continue;
        	}else {i++;}
        }
        
//        for(int i=0; i<list.size(); i++) {
//        	if(list.get(i) == 0) {
//        		continue;
//        	}
//        	else if(list[i]+)
//        }
        
        return count;
    }
    
}