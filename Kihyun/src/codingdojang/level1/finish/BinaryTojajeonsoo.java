package codingdojang.level1.finish;

import java.util.Scanner;

//2진법으로 자연수 나타내기

//2진법이란, 어떤 자연수를 0과1로만 나타내는것이다. 예를 들어73은 64(2^6)+8(2^3)+1(2^0)이기 때문에 1001001으로
//표현한다. 어떤 숫자를 입력받았을 때 그 숫자를 2진법으로 출력하는 프로그램을 작성하시오.

//완성
public class BinaryTojajeonsoo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요. ");
		int num = sc.nextInt();
		
		System.out.println(Integer.toBinaryString(num));

		
	}
}
