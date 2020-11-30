package codingdojang.level2.finish;

import java.util.Scanner;

//컴퓨터가 무조건 먼저시작하고, 1P는 무조건 2번째로 말한다. 컴퓨터가 무조건 이기게 만들어라. LEVEL1 예상 힌트1:4n-2라는 공식을 
//사용하면 됩니다. 힌트2: 이 게임은 31을 부르면 지는 게임이니 30을 부르면 이깁니다.

public class Baeskinrabins31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1; 
		boolean st = true;
		int rand = 0;
		
		int sum = 0;
		int computerTurn = 1;
		
		while(st) {
			if(computerTurn == 1) {
				rand = 2;
				for(int i = 0; i < rand; i++) {
					System.out.println("컴퓨터는 : " + count++);
				}
				computerTurn++;
			} else {
				
				sum = 4 * computerTurn - 2;
				rand = sum - count + 1;
				
				
				
				for(int i = 0; i < rand; i++) {
				System.out.println("컴퓨터는 : " + count++);
				}
				computerTurn++;
				
			}
			
		   

			if(count < 32) {
				System.out.println("당신의 숫자를 입력해주세요.");
				int input = sc.nextInt();
				
				
				for(int i = 0; i < input; i++) {
					System.out.println("당신의 숫자는 " + count++);
				}
			}
			
		}
	}
}
