package codingdojang.level2.finish;
//java basic graamer summary

//2020-11-27
//능력단위명 : 프로그래밍 언어활용 <- 프로그래밍 언어활용
//능력단위요소 : 기본문법 활용하기 -> 언어 특성 활용하기 ->라이브러리 활용하기


public class Google_Insert {
	public static void main(String[] args) {
		
		int eightCount = 0;
		int eightCount1 = 0;
		String str;
		
		
		
		for(int i = 1; i <= 10000; i++) {
			str = String.valueOf(i);
			 for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '0') {
					eightCount1++;
				}
			}
		}
		
		 
		
		for(int i = 1; i <= 10000; i++) {
			if(i % 10== 0) {  //1의 자릿수
				eightCount++;
				System.out.println("1 : " +i + "count : " +  eightCount);
			}
			if(i  % 100 == 0) {  //10자리 
				eightCount++;
				System.out.println("10 : " +i+ "count : "+ eightCount);
			}
			if(i  % 1000 == 0) {  //100자리
				eightCount++;
				
			}
			if(i  % 10000 == 0) {  //1000자리 
				eightCount++;
			}
			if((i / 10) % 10 == 0 && i  % 100 != 0 && i > 9) {  //100의 자리 일때 가운데 0이 오는 경우   //11 0 1
				//10으로 나누기 때문에 1 ~ 9까지도 count되기 때문에 i값이 10이상 일때만 count되도록 하였습니다.
				eightCount++; 
				System.out.println("중간10 : " +i+ "count : "+ eightCount);
			}
			if((i / 100) % 10 == 0 && i%1000 != 0 &&i  % 100 != 0 &&  i > 100) { //1000의 자리 일때 가운데 0이 오는 경우 //1 0 11
				//마찬가지로 100으로 나누기때문에 1 ~ 99까지 count되기 때문에 i값이 100이상일때만 count되도록 하였습니다.
				eightCount++; 
				System.out.println("중간100 : " +i+ "count : "+ eightCount);
			}
			
		}
		
		int num4 = 103;
		
		System.out.println("test: " + num4 / 10);
		
		
		
		
		
		System.out.println(eightCount1);
		System.out.println(eightCount);
	}
}
