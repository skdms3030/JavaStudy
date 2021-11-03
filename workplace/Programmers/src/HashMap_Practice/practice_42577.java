package HashMap_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//전화번호 목록
public class practice_42577 {
	public static void main(String[] args) {
		boolean result = true;
		//String[] phone_book = {"119", "97674223", "1195524421"};
		//String[] phone_book = {"119", "97674223", "19954", "11244"};
		//String[] phone_book = {"123","456","789"};
		String[] phone_book = {"12","123","1235","567","88"};
		
		
        Arrays.sort(phone_book);
        
        System.out.println(Arrays.toString(phone_book));
		


			for(int j=0; j<phone_book.length-1; j++) {
				if(phone_book[j+1].indexOf(phone_book[j])== 0) {
					result = false;
					break;
				}
				else {
					result = true;
				}
			}

		
		System.out.println(result);
		
		
		
	}

}
