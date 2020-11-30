package codingdojang.level1.wait;
//Cardinal to Ordinal 기수를 서수로 바꾸기

import java.util.Scanner;

//기수를 입력하면 영어 서수로 출력하는 함수를 작성합니다.

//1, 21, 31, 41, ... → 1st, 21st, 31st, 41st, ...
//2, 22, 32, 42, ... → 2nd, 22nd, 32nd, 42nd, ...
//3, 23, 33, 43, ... → 3rd, 23rd, 33rd, 43rd, ...
//11, 12, 13, 111, 112, 113, 211, 212, 213, ...  → 11th, 12th, 13th, 111th, 112th, 113th, 211th, 212th, 213th, ...
//4, 5, 6, 11, 12, 13, 101, 111, 112, ... → 4th, 5th, 6th, 11th, 12th, 13th, 101th, 111th, 112th, ...

//완성
public class Cardinal_To_Ordinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("기수를 입력해주세요.");
		int num = sc.nextInt();
		
		if(num % 10 == 1 && num != 11 && num < 100) {
			System.out.println(num + "st");
		} else if(num % 10 == 2 && num != 12 && num < 100) {
			System.out.println(num + "nd");
		} else if(num % 10 == 3 && num != 13 && num < 100) {
			System.out.println(num + "rd");
		} else {
			System.out.println(num + "th");
		}
		
		
		
		
		
		
		
	}
}
