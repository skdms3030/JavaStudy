package chapter4;

public class Exercise4_13 {
	//숫자인지 판별
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0; i<value.length(); i++) {
			if(!('0' <= value.charAt(i) && value.charAt(i) <= '9')) {
				isNumber = false;
			}
		}
		if(isNumber) {
			System.out.println(value+"는 숫자입니다");
		}
		else {
			System.out.println(value+"는 숫자가 아닙니다");
		}

	}

}
