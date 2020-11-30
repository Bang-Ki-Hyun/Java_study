package codingdojang.level1.finish;
//앞의 문제들 중 비슷한 알고리즘이 있던 것 같지만, 같은 건 없다고 생각해서 올립니다. 문제를 푸는 데
//많은 approach가 있을 듯 싶습니다. 이 문제의 핵심은 비트 연산을 얼마나 잘 이해하고 있냐기이 때문에
//비트 연산으로 풀어주세요.

//input은 int n을 입력 받아 첫번째 row는 (n-1)의 O과 X, 두번째 row는 (n-2)의 O와 XX, 세번째 row는 
//(n-3)의 0과 XXX..... n번째 row는 n의 X를 출력하시오.

//입력 예시 : 6

//출력 예시 : 

//OOOOOX
//OOOOXX
//OOOXXX
//OOXXXX
//OXXXXX
//XXXXXX

//완성
import java.util.Scanner;


public class Printing_OXs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strOX = "";
		
		System.out.println("row수를 입력해주세요");
		int n = sc.nextInt();
		for(int i = 1; i < n + 1; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print("O");
			}
			for (int j = 0; j < i+1 - 1; j++) {
				System.out.print("X");
			}
			System.out.println("");
		}
		
		
	}
}
