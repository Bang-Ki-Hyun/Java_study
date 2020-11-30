package codingdojang.level1.finish;
//피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은
//이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.

//예 0, 1, 1, 2, 3, 5, 8, 13

//인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성하세요

//완성
import java.util.Scanner;

public class Pivonachi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n값을 입력하세요.");
		int n = sc.nextInt();
		int num = 0;
		int count = 0; 
		
		int pivoArr[] = {0, 1, 0}; //초기화
		
		System.out.print("0 1 ");
		
			while (num <= n) {
				if(num != 0 )
				{
					System.out.print(num + " ");
				}
				
				if(count == 0) {
					pivoArr[2] = pivoArr[0] + pivoArr[1] ;
					num = pivoArr[2];
					//System.out.print(pivoArr[2] + " ");
					count++;
				} else if(count == 1) {
					pivoArr[0] = pivoArr[1] + pivoArr[2] ;
					num = pivoArr[0];
					//System.out.print(pivoArr[0] + " ");
					count++;
				} else {//count == 2
					pivoArr[1] = pivoArr[2] + pivoArr[0] ;
					//System.out.print(pivoArr[1] +  " ");
					num = pivoArr[1];
					count = 0;	
				}
			} 
	}

}


