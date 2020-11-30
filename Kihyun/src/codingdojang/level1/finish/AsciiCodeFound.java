package codingdojang.level1.finish;

import java.util.Scanner;

//문제에 해당하는 아스키코드를 알아내는 코드

//철이는 아스키코드에 대해 공부하고 있었습니다.
//하지만 기억력이 좋지 않아 순서를 잊어먹게 되는 탓에 프로그램 하나 만들어두려합니다.
//문자를 입력받으면 그 문자에 해당하는 아스키 코드를 출력하는 코드를 작성해주세요.

//출력조건
//a는 아스키코드로 97입니다.
//d는 아스키코드로 100입니다.
//A는 아스키코드로 65입니다.


//완성
public class AsciiCodeFound {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요.");
		String ascii = sc.next();
		
		
		System.out.println(ascii + "는 " + "아스키코드로 " + (int)ascii.charAt(0) + "입니다.");
	}
}
