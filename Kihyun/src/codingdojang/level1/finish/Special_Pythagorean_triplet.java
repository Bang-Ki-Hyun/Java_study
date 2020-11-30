package codingdojang.level1.finish;
//세 자연수 a,b,c가 피타고라스 정리 a^2 + b^2 = c^2 를 만족하면 피타고라스 수라고 부릅니다. 
//(여기서  a < b < c)
//(예를 들면 3^2 + 4^2 = 9 + 16 = 25 = 5^2 이므로, 3, 4, 5는 피타고라스 수입니다.
//a + b + c = 1000 인 피타고라스 수 a, b, c는 한 가지 뿐입니다. 이 때, a x b x c는 얼마입니까?

//완성
import java.util.Arrays;




public class Special_Pythagorean_triplet {
	public static void main(String[] args) {
		
		int a, b, c;
		int mul = 0;

		for (c = 1; c < 1000; c++) {
			for(b = 1; b < c; b++) {
				for(a = 1; a < b; a++) {
					if(a + b + c == 1000 && a * a + b * b == c * c) {
						mul = a * b * c;
					}
				}
			}
		}
		
		System.out.println(mul);
		
		
		
		
		
		
			
		
	}
}
