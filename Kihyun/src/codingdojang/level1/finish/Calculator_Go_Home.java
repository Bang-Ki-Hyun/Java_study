package codingdojang.level1.finish;
//남은 퇴근시간 계산기

import java.nio.channels.AsynchronousServerSocketChannel;
import java.util.Scanner;

//현우는 성인이되어 회사에입사했다.
//하지만 들어간기업이 하필 할일없는 중소기업이라
//퇴근시간까지 놀다가 퇴근시간에 퇴근하는것이 일상화가되어버렸다..
//현우는 심심한지라 좀더효율적으로놀기위해
//현재부터 퇴근시간까지 남은시간을 알려주는 계산기를 만들어
//계산적으로놀고싶었다 우리가현우를 도와주자!!
//(참고로 현우의퇴근시간은 17시30분이다)
//input: 현재시간
//output: 남은시간 : hh:mm:ss
//or
//남은시간 : s


//완성
public class Calculator_Go_Home {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String timeStr = "";
		
		timeStr = sc.next();
		
		String intStr = "";
		
		for (int i = 0; i < timeStr.length(); i++) {
			if(timeStr.charAt(i) != ':') {
				intStr += Integer.valueOf(String.valueOf(timeStr.charAt(i)));
			}
		}
		System.out.println(timeStr);
		System.out.println(intStr);
		
		int sum = 0;
		
		for (int i = 0; i < intStr.length(); i++) {
			if(i == 0) {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i))) * 600 * 60;
			} else if(i == 1) {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i))) * 60 * 60;
			} else if(i == 2) {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i))) * 600;
			} else if(i == 3 ) {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i))) * 60;
			} else if(i == 4) {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i))) * 10;
			} else {
				sum += Integer.valueOf(String.valueOf(intStr.charAt(i)));
			}
		}
		
		System.out.println(sum);
		int minus;
		minus = 17 * 3600 + 30 * 60;
		
		System.out.println(minus - sum);
		
		int sum1 = minus - sum;
		int hCount = 0;
		int mCount = 0;
		
		while(sum1 > 3600) {
			sum1 -= 3600;
			hCount++;
		}
		
		while(sum1 > 60) {
			sum1 -= 60;
			mCount++;
		}
		
		System.out.println("남은시간 정확히 " + hCount + " : " + mCount + " : "  +sum1 );
	}
}
