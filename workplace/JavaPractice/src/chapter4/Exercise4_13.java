package chapter4;

public class Exercise4_13 {
	//�������� �Ǻ�
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
			System.out.println(value+"�� �����Դϴ�");
		}
		else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�");
		}

	}

}
