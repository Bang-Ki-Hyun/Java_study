package codingdojang.level1.finish;

/* DashInsert 함수는 숫자로 구성된 문자열을 입력받은 뒤, 문자열 내에서 홀수가 연속되면 두 수 사이에 - 를
 * 추가하고, 짝수가 연속되면 * 를 추가하는 기능을 갖고 있다.(예, 454 = > 454, 4546793 = > 454*67-9-3) 
 * DashInsert함수를 완성하자.
 * 입력 - 화면에서 숫자로된 문자열을 입력받는다.
 * 
 * 출력 - *, -가 적절히 추가된 문자열을 화면에 출력한다.
 */
//완성
import java.util.Scanner;

public class Dash_Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String strStore = "";
		int num = 0;
		//4546793
		for(int i = 0; i < str.length(); i++ ) {
			num = Integer.valueOf(String.valueOf(str.charAt(i)));
			
			strStore += String.valueOf(str.charAt(i));
			if(num % 2 == 0) {
				if(i != (str.length() - 1) ){
					num = Integer.valueOf(String.valueOf(str.charAt(i + 1)));
					if(num % 2 == 0) {
						strStore += "*";
					}
				}
			} else {
				if(i != (str.length() - 1)) {
					num = Integer.valueOf(String.valueOf(str.charAt(i + 1)));
					if(num % 2 == 1) {
						strStore += "-";
					}
				}
			}
		}
		System.out.println(strStore);
	}
}
