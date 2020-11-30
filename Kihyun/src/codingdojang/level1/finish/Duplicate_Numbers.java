package codingdojang.level1.finish;
//0 ~ 9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0 ~ 9까지의 숫자가 각각 한 번 씩만 사용된 
//것인지 확인하는 함수를 구하시오.

//완성
import java.util.Scanner;

public class Duplicate_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		String strNum = sc.next();
		
		boolean state = true;
		
		char[] strNumArr = new char[strNum.length()];
		for(int i = 0 ; i < strNum.length(); i++) {
			strNumArr[i] = strNum.charAt(i);
		}
		int count = 0;
		
		char strArray[] = {'0','1','2','3','4','5','6','7','8','9'};
		
		if(strNum.length() == 10) {
			for(int i = 0; i < strNumArr.length; i++) {
				count = 0;
				for(int j = 0; j < strArray.length; j++) {
					if(strNumArr[i] == strArray[j]) {
						strArray[j] = 'X';
						break;
					}
					else {
						count++;
					}
				}
				if(count == 10) {
					state = false;
					break;
				}
			}
		} else state = false;
		
		
		
		System.out.println(state);
		
	}

}
