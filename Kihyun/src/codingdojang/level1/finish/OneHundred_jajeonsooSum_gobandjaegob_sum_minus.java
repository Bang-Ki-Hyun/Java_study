package codingdojang.level1.finish;



//1부터 10까지 자연수를 각각 제곱해 더하면 다음과 같습니다.(제곱의 합).i^2 + 2^2 + ... + 10 ^ 2 = 385 
//1부터 10을 먼저 더한 다음에 그 결과를 제곱하면 다음과 같습니다.(합의 제곱).(1 + 2 + ... + 10)^2 = 55^2 = 3025
//따라서 1부터 10까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 3025 - 385 = 2640이 됩니다.
//그러면 1부터 100까지 자연수에 대해 "합의 제곱"과 "제곱의 합"의 차이는 얼마입니까?


//완성
public class OneHundred_jajeonsooSum_gobandjaegob_sum_minus {
	public static void main(String[] args) {
		int jaegobSum = 0;
		int sumJaegob = 0;
		
		for(int i = 1; i < 101; i++) {
			jaegobSum += i*i;
			sumJaegob += i;
		}
		
		sumJaegob *= sumJaegob;
		System.out.println("합의 제곱 : " + sumJaegob);
		System.out.println("제곱의 합 : " + jaegobSum);
		System.out.println();
		System.out.println("합의 제곱과 제곱의 합의 차이는 : " + (sumJaegob - jaegobSum));
		
		
		
	}
}
