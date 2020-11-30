package codingdojang.level1.wait;

//A씨는 두 개의 버전을 비교하는 프로그램을 작성해야 한다.

//버전은 다음처럼 "." 으로 구분된 문자열이다.

//버전 예) 1.0.0, 1.0.23, 1.1

//두 개의 버전을 비교하는 프로그램을 작성하시오.

//다음은 버전 비교의 예이다.

//0.0.2 > 0.0.1
//1.0.10 > 1.0.3
//1.2.0 > 1.1.99
//1.1 > 1.0.1


//보류
public class VersionCompare {
	public static void main(String[] args) {
		String strVerA = "10.2.3";
		String strVerB = "1.0.1";
		
		int count = 1;
		String strA1 = "";
		String strA2 = "";
		String strA3 = "";
		
		String strB1 = "";
		String strB2 = "";
		String strB3 = "";
		int i = 0;
		
		while( i < strVerA.length()) {
			
			if(strVerA.charAt(i) == '.') {
				i++;
				//System.out.println(strVerA.charAt(i));
				while(strVerA.charAt(i) != '.') {
					strA2 += Character.toString(strVerA.charAt(i));
					i++;
					System.out.println(strVerA.charAt(i));
				}

			} else {
				strA1 += Character.toString(strVerA.charAt(i));
			}
			i++;
		}	
		System.out.println(strA1);
		
		
	}
}
