package codingdojang.level1.finish;
//예로, 10 ~ 15까지의 각 숫자 분해하여 곱하기의 전체 합은 다음과 같다.

//10 = 1 * 0 = 0
//11 = 1 * 1 = 1
//12 = 1 * 2 = 2
//13 = 1 * 3 = 3
//14 = 1 * 4 = 4
//15 = 1 * 5 = 5

//완성
public class Ten_Thousand_Decomposition_Multiple {
	public static void main(String[] args) {
		
		int sum = 0;
		int avg = 0;
		
		for(int i = 10; i < 1001; i++ ) { //1 ~ 10 
			String strNum = String.valueOf(i);
			
			for(int j = 0; j < strNum.length(); j++) {
				if( j == 0) {
					avg = Integer.valueOf(String.valueOf(strNum.charAt(j)));
				} else {
					avg *= Integer.valueOf(String.valueOf(strNum.charAt(j)));
				}
			}
			sum += avg;
			avg = 0;
		}
		System.out.println(sum);
		
		
		
	}
}
