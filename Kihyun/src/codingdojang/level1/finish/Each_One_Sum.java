package codingdojang.level1.finish;
//각 자릿수의 합을 구할 수 있나요?

import java.util.Scanner;

//초보자 프로그래머 홍길동은 사용자가 입력한 양의정수(범위는 int)각 자리수를 더해 출력하는 프로그램을 만들고 싶어한다.
//ex) 5923의 결과는 5+9+2+3인 19이다 ex) 200의 결과는 2+0+0인 2이다 ex) 6719283의 결과는 6+7+1+9+2+8+3인 36이다.


public class Each_One_Sum {
	public static void main(String[] args) {
		
		Scanner sc  =  new Scanner(System.in);
		
		int num ;
		
		do {
			System.out.println("양의 정수를 입력하세요.");
			num = sc.nextInt();
		} while(num < 0);
		
		
		int sum = 0;
		
		
		for(int i = 0 ; i < String.valueOf(num).length(); i++ ) {
			sum += Integer.valueOf(String.valueOf(String.valueOf(num).charAt(i)));
			if(i != String.valueOf(num).length() - 1) {
				
				System.out.print(String.valueOf(num).charAt(i) + "+");
			} else {
				System.out.print(String.valueOf(num).charAt(i));
			}
		}
		
		System.out.println(" = " + sum);
	}
}
