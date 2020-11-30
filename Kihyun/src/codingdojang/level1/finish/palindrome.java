package codingdojang.level1.finish;

//palindrome

//앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은수를 대칭수라고 부릅니다. 두 자리 수를 곱해 
//만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 x 99) 입니다. 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?


//완성
public class palindrome {
	public static void main(String[] args) {
		
		String store = "";
		int firstNum = 0;
		int secondNum = 0;
		int thirdNum = 0;
		int fourNum = 0;
		int fiveNum = 0;
		int sixNum = 0;
		int max = 0;
		
		for(int i = 100; i < 1001; i++ ) {
			for(int j = 100; j < 1001; j++) {
				store = String.valueOf(i * j);
				
				for(int k = 0; k < store.length(); k++) {
					
					if(k == 0) {
						firstNum = store.charAt(k) ;
					} else if(k == 1) {
						secondNum = store.charAt(k);
					} else if(k == 2) {
						thirdNum = store.charAt(k);
					} else if(k == 3) {
						fourNum = store.charAt(k);
					} else if(k == 4) {
						fiveNum = store.charAt(k);
					} else {
						sixNum = store.charAt(k);
					}
					
				}
				
				if(store.length() == 5) {
					if(firstNum == fiveNum) {
						if(secondNum == fourNum) {
							if(max == 0 ) {
								max = Integer.valueOf(store);
							} else {
								if(max < Integer.valueOf(store)) {
									max = Integer.valueOf(store);
								}
							}
						}
					}
				} else {
					if(firstNum == sixNum) {
						if(secondNum == fiveNum) {
							if(thirdNum == fourNum) {
								if(max == 0 ) {
									max = Integer.valueOf(store);
								} else {
									if(max < Integer.valueOf(store)) {
										max = Integer.valueOf(store);
									}
								}
							}
						}
					}
				}
				
			}
		}
		
		System.out.println(max);
	}
}
