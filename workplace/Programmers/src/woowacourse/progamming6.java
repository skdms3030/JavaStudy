package woowacourse;
import java.util.*;

public class progamming6 {

	public static void main(String[] args) {
		//Å×½ºÆ®ÄÉÀÌ½º
		String[][] plans = {{"È«Äá", "11PM", "9AM"},{"¿¤¿¡ÀÌ", "3PM", "2PM"}};
		double time = 3.5;
		
		
		//¼±¾ð
		String begin = "";
		String beginNum = "";
		int vacation = 0;
		String end = "";
		String endNum = "";
		HashMap<Integer, String> hm = new HashMap<>();
		String answer = "";
		
		for(int i=0; i<plans.length; i++) {
			begin = plans[i][1];
			if(begin.substring(begin.length()-2, begin.length()).equals("AM")) {
				beginNum = begin.replace(begin.substring(begin.length()-2, begin.length()), "");
				if(12 + (6-Integer.parseInt(beginNum)) >0)
					vacation += 12 + (6-Integer.parseInt(beginNum));
			}
			else if(begin.substring(begin.length()-2, begin.length()).equals("PM")) {
				beginNum = begin.replace(begin.substring(begin.length()-2, begin.length()), "");
				if((6-Integer.parseInt(beginNum)) >0)
						vacation += (6-Integer.parseInt(beginNum));
				System.out.println(Integer.parseInt(beginNum));
			}
			//System.out.println(begin.substring(begin.length()-2, begin.length()));
			
			end = plans[i][2];
			if(end.substring(end.length()-2, end.length()).equals("AM")) {
/*				endNum = end.replace(end.substring(end.length()-2, end.length()), "");
				vacation += 12 + (6-Integer.parseInt(endNum));*/
			}
			else if(end.substring(end.length()-2, end.length()).equals("PM")) {
				endNum = end.replace(end.substring(end.length()-2, end.length()), "");
				if((Integer.parseInt(endNum)-1) >0)
					vacation += (Integer.parseInt(endNum)-1);
				System.out.println(1-Integer.parseInt(endNum));
			}
			
			if(vacation<time) {
				System.out.println(vacation);
				System.out.println(plans[i][0]);
				answer = plans[i][0];
			}
			
			vacation = 0;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
