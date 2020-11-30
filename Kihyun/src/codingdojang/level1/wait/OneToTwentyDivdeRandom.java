package codingdojang.level1.wait;

//1부터 20사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는?


//1부터 10까지 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
//그렇다면 1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?




public class OneToTwentyDivdeRandom {
	public static void main(String[] args) {
		
		boolean st = true;
		int count = 2000;
		int print = 0;
		
		while(count < 3000) {
			st = false;
			for(int i = 1; i <= 10; i++) {
				if((count / i) != 0) {
					st = true;
					System.out.println(count);
					break;
				}
			}
			if(st == false) {
				print = count;
				
			}
			count++;
		}
		
		System.out.println(print);
	}
}
