package chapter4;

public class Exercise4_3 {

	public static void main(String[] args) {
		int i;
		int hap1=0;
		int hap2=0;
		
		for(i=1; i<=10; i++) {
			hap1 += i;
			hap2 += hap1;
		}
		
		System.out.println(hap2);

	}

}
