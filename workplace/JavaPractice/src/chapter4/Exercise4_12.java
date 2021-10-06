package chapter4;

public class Exercise4_12 {
	//구구단 출력
	public static void main(String[] args) {
//		for(int i=1; i<=3; i++) {
//			for(int j=2; j<10; j++) {
//				//System.out.print(j+"*"+i+"="+i*j+"\t");
//				System.out.println(j%3+"*"+i+"="+i*j);
//				
//				if(j%3==1) {
//					System.out.print("\n");
//				}
//			}
//		}
		
		
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<3; j++) {
//				int x = j%3==0? 3:j%3;
//				System.out.println(i+"*"+x+"="+i*x);
//			}
//		}
		
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<=3; j++) {
				int x = j+ (((i-1)/3)*3+1);
				int y = i%3==0? 3: i%3;
				
				if(x>9) break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
			if(i%3==0)
				System.out.println();
		}

	}

}
