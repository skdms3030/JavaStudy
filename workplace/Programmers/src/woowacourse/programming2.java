package woowacourse;
import java.util.*;

public class programming2 {

	public static void main(String[] args) {
		//�׽�Ʈ���̽�
		String[] log = {"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"};
		//String[] log = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};
		
		
		//����
		String[] time = new String[2];
		int bun = 0;
		List<Integer> begin = new ArrayList<>();
		List<Integer> end = new ArrayList<>();
		int study = 0;
		int total = 0;
		String answer = "";
		
		//������ �ٲ㼭 ����/�� ������
		for(int i=0; i<log.length; i++) {
			time = log[i].split(":");
			bun+= Integer.parseInt(time[0])*60;
			bun+= Integer.parseInt(time[1]);
			
			if(i%2==0) {
				begin.add(bun);
			}
			else {
				end.add(bun);
			}
			bun = 0;
		}
		
		//�� ���νð� ���ϱ�
		for(int j=0; j<begin.size(); j++) {
			study = end.get(j) - begin.get(j);
			System.out.println(study);
			
			if(study>=5 && study<105) {
				total += study;
			}
			else if(study >= 105) {
				total += 105;
			}
		}
		System.out.println(begin);
		System.out.println(end);
		System.out.println(total);
		
		
		//��Ʈ������ �ٲٱ�
		if(total/60 <10) {
			answer += "0";
			answer += total/60;
		}
		else {
			answer += total/60;
		}
		
		answer += ":";
		
		if(total%60 < 10) {
			answer += "0";
			answer += total%60;
		}
		else {
			answer += total%60;
		}
		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
