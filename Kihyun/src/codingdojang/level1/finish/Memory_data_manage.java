package codingdojang.level1.finish;

//프로그램 실행 순서
//1. 입력할 정수의 개수를 사용자로부터 입력 받는다.
//2. 입력받은 정수의 개수만큼 정수를 입력받는다.
//3. 입력받은 정수의 합과 평균 값을 출력한다.
//4. 할당된 메모리공간을 비운다.

//요구사항
//1. 메모리 공간은 사용자의 입력수에 따라 변동된다.
//2. 사용한 공간은 마지막에 비워야 한다.
//3. 배열을 사용하면 안된다.



//완성
import java.util.ArrayList;
import java.util.Scanner;


public class Memory_data_manage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		
		System.out.println("입력할 정수의 개수를 입력하세요.");
		int n = sc.nextInt();
		
		int sum = 0;
		int num = 0;
		
		for(int i = 0 ; i < n; i++) {
			list.add(i,0);
		}
		System.out.println(list);
		for(int i = 0 ; i < n ; i++) {
			System.out.println("정수를 입력하세요.");
			num = sc.nextInt();
			list.remove(i);
			list.add(i,num);
			sum += num;
		}
		
		double avg = 0.0;
		
		avg = (double)(sum / n);
		
		
		System.out.println("입력받은 정수의 합은 : " + sum);
		System.out.println("입력받은 정수의 평균은 : " + avg);
		System.out.println(list);
		
		for(int i = 0; i < n ; i++) {
			list.remove(i);
		}
		
		
	
		
		
		
		
		
		
	}

}
