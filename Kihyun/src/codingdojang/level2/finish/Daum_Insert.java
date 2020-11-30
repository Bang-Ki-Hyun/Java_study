package codingdojang.level2.finish;

import java.util.Arrays;

//1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오.(단 
//점들의 배열은 모두 정렬되어 있다고 가정한다.)

//예를들어 S = {1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3,4)가 될 것이다.

public class Daum_Insert {
	public static void main(String[] args) {
		int[] S = {1, 3, 4, 8, 13 ,17 ,20};
		
		int minus = 0;
		int maxMinus = 0;
		//String str = "";
		int[] result = new int[2];
		
		/*
		for(int i = 0; i < S.length; i++) {
			if(i != S.length - 1) {
				minus = S[i] - S[i + 1] ;
				if(i == 0) {
					maxMinus = minus;
					
					str = " ";
					str += String.valueOf(S[i]);
					str += ",";
					str += String.valueOf(S[i + 1]);
					
				} else {
					if(maxMinus < minus) {
						maxMinus = minus;
						str = " ";
						str += String.valueOf(S[i]);
						str += ",";
						str += String.valueOf(S[i + 1]);
						
					}
				}
			}
			
		}
		*/
		
		for(int i = 0; i < S.length - 1; i++) {
				minus = S[i] - S[i + 1] ;
				if(i == 0) {
					maxMinus = minus;
					result[0] = S[i];
					result[i] = S[i+1];			
				} else {
					if(maxMinus < minus) {
						maxMinus = minus;
						result[0] = S[i];
						result[i] = S[i+1];	
					}
				}
		}

		//System.out.println(str);
		System.out.println(Arrays.toString(result));
	}
}
