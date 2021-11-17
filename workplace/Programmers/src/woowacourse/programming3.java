package woowacourse;
import java.util.*;

public class programming3 {

	public static void main(String[] args) {
		//테스트케이스
		String[] ings = {"r 10", "a 23", "t 124", "k 9"};	String[] menu = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"}; String[] sell = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};	
		//String[] ings = {"x 25", "y 20", "z 1000"};	String[] menu = {"AAAA xyxy 15", "TTT yy 30", "BBBB xx 30"}; String[] sell = {"BBBB 3", "TTT 2"};		
		
		
		//선언
		HashMap<String, String> ingshm = new HashMap<>();
		HashMap<String, String> sellhm = new HashMap<>();
		int income = 0;
		int outcome = 0;
		int result = 0;
		
		
		
		//재료 해시맵에 넣기
		for(int i=0; i<ings.length; i++) {
			String[] ings2 = ings[i].split(" ");
			ingshm.put(ings2[0], ings2[1]);
			System.out.println(ingshm);
		}
		
		//판매 해시맵에 넣기
		for(int i=0; i<sell.length; i++) {
			String[] sell2 = sell[i].split(" ");
			sellhm.put(sell2[0], sell2[1]);
			System.out.println(sellhm);
		}
		
		
		//income outcome 계산
		for(int i=0; i<menu.length; i++) {
			String[] menu2 = menu[i].split(" ");
			String num = "";
			
			for(int j=0; j<menu2[1].length(); j++) {
				
				String wofy = ingshm.get(Character.toString(menu2[1].charAt(j)));
				//System.out.println(menu2[1].charAt(j));
				//System.out.println(wofy);
				if(sellhm.containsKey(menu2[0])) {
					num = sellhm.get(menu2[0]);
				}
				else {num = "0";}
				
				//System.out.println(num);
				//String qodyd = Character.toString(sellhm.get(menu2[0]));
				//System.out.println(sellhm.get(menu2[0]));
				outcome += Integer.parseInt(wofy) * Integer.parseInt(num); 
				//System.out.println(outcome);
			}
			if(sellhm.containsKey(menu2[0])) {
				num = sellhm.get(menu2[0]);
			}
			else {num = "0";}
			
			income += Integer.parseInt(menu2[2]) * Integer.parseInt(num);
			//System.out.println(menu2[2]);
			//System.out.println(num);
			//System.out.println(income);
			System.out.println(outcome);
		}
		
		

			System.out.println(income);
			result += income - outcome;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}

}
