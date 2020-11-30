package codingdojang.level3.finish;

import java.util.Scanner;

public class Kakao_Dart_Game {
	//기회는 3번 3번 입력 받음 
	//S면 x 1 D면 x 2 T면 x 3
	// * :스타상, 이번, 앞번꺼 x 2    # : 아차상   이번꺼 x -1
	// *과 #은 둘다 랜덤이다 나올수도 있고 안나올 수도 있다.
	// *이 처음에 올 경우에는 앞전 꺼는 안곱하고 다음 것만 x 2한다
	// 0 ~ 9의 정수와 문자 S, D, T, *, #으로 구성된 문자열 입력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력해주세요.");
		String strInput= sc.next();
		char c = ' ';
		int sum = 0;
		int totalSum = 0;
		int count = 0;
		int starCount = 0;
		int[] storeNum = new int[3];
		boolean ten = false;
		
		//1S2D*3T
		for (int i = 0; i < strInput.length(); i++) {

			
			if(strInput.charAt(i) == '*') {   //*을 만나면 *2를 한다.
				if(count == 1) {  //그런데 첫번째 항이면 현재 항만 *2
					storeNum[count] *= 2;
					starCount++;
				} else {  //2번째 세번째 항이면 그 전 항도 *2를 시킨다.
					
					storeNum[count - 2] *= 2;
					storeNum[count - 1] *= 2;
					starCount++;
					
					if(starCount == 2) {
						storeNum[count - 2] *= 2;
						starCount = 0;
					}
					
				}
			} else if(strInput.charAt(i) == '#'){
				storeNum[count - 1] *= -1;
			}
			
			
			while(strInput.charAt(i) < '9' && strInput.charAt(i) >= '0') {
				if((int)strInput.charAt(i) == '1') {
					i++;
					if((int)strInput.charAt(i) == '0') {
						sum = 10;
						
					} else {
						i--;
						sum = 1;
					}
				}else {
					sum = Integer.valueOf(String.valueOf(strInput.charAt(i)));
				}
				//System.out.println("값 확인 : " + sum);
					
				totalSum = sum;
				i++;
				//System.out.println("count = " + count + " sum" + sum);
				
				if(strInput.charAt(i) == 'S') { //single
					for(int j = 0; j < 1; j++) {
						sum *= 1;
					}
				} else if (strInput.charAt(i) == 'D'){ //double
					for(int j = 0; j < 1; j++) {
						totalSum *= sum;
						
						System.out.println("D: " + sum);
					}
				} else {
					for(int j = 0; j < 2; j++) {  //Triple
						totalSum *= sum;
					}
				}
				storeNum[count++] = totalSum;
				totalSum = 0;
				sum = 0;
				//for(int j = 0 ; j < storeNum.length; j++) {
					//System.out.println("store[" + j + "] : " + storeNum[j]);
				//}
			}
		}
		
		
		int totalNum = 0;
		for(int j = 0 ; j < storeNum.length; j++) {
			totalNum += storeNum[j];
			System.out.println("저장값[" + j + "] : " + storeNum[j]);
		}
		
		System.out.println("answer : " + totalNum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
