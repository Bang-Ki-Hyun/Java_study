package codingdojang.level1.finish;
//이차 방정식

import java.util.Scanner;

//A씨는 학교숙제로 이차방정식 문제를 풀어야 한다. 하지만 시간이 얼마 없다. 이 A씨를 도와주기 위한 이차방정식 풀이
//프로그램을 작성해라(단, 이차 방정식은 ax^2 + bx + c = 0의 꼴에서 a,b와 c를 입력받아 해를 구하고 해를 구하기 위해
//근의 공식을 사용해야 한다. 또, 해는 정수로 반올림 한 값을 구하고 해가 ㅇ벗거나 여러개인 경우도 모두 구해야한다.
//근의 공식은 무시해도 됩니다



public class Twochar_bangjungsik {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a를 입력해주세요.");
		int a = sc.nextInt();
		
		
		System.out.println("b를 입력해주세요.");
		int b = sc.nextInt();
		
		System.out.println("c를 입력해주세요.");
		int c = sc.nextInt();
		
		boolean st = false;;
		
		for(int x = -100; x < 100; x++) {
			if(a*x*x + b*x + c == 0) {
				System.out.println("이차 방정식의 해는 x : " + x);
				st = true;
			} 
		}
		if(st == false) {
			System.out.println("해가 없습니다.");
		}
		
		
		
	}
}
