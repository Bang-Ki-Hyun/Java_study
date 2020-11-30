package codingdojang.level1.wait;

import java.util.Scanner;

//정수와 소수 구별하기


//프로그래머 X는 코딩을 하다가 문득, 수학 시간에 배운 정수와 소수를 구별하는 방법을 떠올렸다. 정수와 소수의 차이는
//분수로 표현이 되느냐, 되지 않느냐에 따라 차이가 나기도 하며, 또한 파이 등 특정한 값을 나타내는 것에 의하여 소수인지
//정수인지 판별이 나게 된다.

//프로그래머 X는 입력값을 숫자를 입력하거나 문자를 입력하려고 하는데,
//1. 만약 숫자를 입력하였으면 그것이 정수인지, 소수인지 구별하는 프로그램을 짜보도록 하고,
//2. 만약 문자를 입력하였으면 숫자가 아니므로 math error를 표시하게 하라.

//완성
public class Jeongsoo_sausoo_Found {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 해주세요.");
		String str = sc.next();
		String strNum = "";
		int num = 0;
		boolean jeongsoo = false; //정수는 true, 소수는 false
		
		if(str.charAt(0) > 47 && str.charAt(0) <58) {
			
			for (int i = 0; i < str.length(); i++) {
				 //숫자
					strNum += Integer.valueOf(String.valueOf(str.charAt(i)));
			} 
			
			if(str.length() > 1) {
				
				if(str.charAt(0) == '0') {
					System.out.println("math error");
				} else {
					num = Integer.valueOf(strNum);
					
					
					  //정수와 소수 구분
					for(int i = 2; i < num; i++) {
						if(num % i == 0) {
							jeongsoo = true;
						}
					}
					
					if(jeongsoo == false) {
						System.out.println("소수입니다.");
					} else {
						System.out.println("정수입니다.");
					}
				}
				
			}
			
			
		} else {
			System.out.println("math error");
		}
			
	} 
}
