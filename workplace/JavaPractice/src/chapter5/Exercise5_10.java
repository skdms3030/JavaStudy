package chapter5;

public class Exercise5_10 {
	//���ĺ��� ���ڸ� ��ȣȭ
	public static void main(String[] args) {
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
							// 0   1   2   3   4   5   6   7   8   9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = "";
			
			// src charAt() result ���ڿ� �� ���ڸ� ���� �ϳ��� �о ��ȯ �� �� ����
			for(int i=0; i<src.length(); i++) {
				char ch = src.charAt(i);
				
				if('a'<=ch && ch<='z') {
					int a1 = ch-'a';
					result += abcCode[a1];
				}
				else if('0'<=ch && ch<='9') {
					int a2 = ch-'0';
					result += numCode[a2];
				}
			}
			
			System.out.println("src="+src);
			System.out.println("result="+result);

	}

}
