package chapter5;

import java.util.Scanner;

public class Exercise5_7 {
	//�Է¹��� �Ž����� �ݾ��� �������� �Ž����ֱ�(�Ž������� �����ϸ� �����ϴٰ� ���)
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
		int money = s.nextInt();
		
		
//		if(args.length!=1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}
//		
//		//���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ��ȸ�� �߻��Ѵ�.
//		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500,100,50,10};  //������ ����
		int[] coin = {5,5,5,5};  //������ ������ ����
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			coinNum = money/coinUnit[i];
			
			if(coinNum<=coin[i]) {
				coin[i] = coin[i]-coinNum;
			}
			else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			money -= coinNum * coinUnit[i];
			System.out.println(coinUnit[i]+"��: "+coinNum);
		}
		if(money>0) {
			System.out.println("�Ž������� �����մϴ�");
			System.exit(0);
			break;
		}
		
		System.out.println("=���� ������ ����=");
		
		for(int j=0; j<coinUnit.length; j++) {
			System.out.println(coinUnit[j]+"��: "+coin[j]);
		}
		}

	}

}
