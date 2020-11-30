package codingdojang.level1.finish;

import java.util.Scanner;

//완성
public class Sizu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어를 입력하세요. ");
		String strAlpa = sc.next();
		System.out.println("n을 입력하세요. ");
		int n = sc.nextInt();
		int su = 0;
		boolean state = true;

		
		int strLength = strAlpa.length();
		int co= 0;
		
		for(int i = 0; i < strLength; i++) {
			su = (strAlpa.charAt(i) + n);
			
			if(strAlpa.charAt(i) > 64 && strAlpa.charAt(i) < 91) { //'A' ~ 'Z'일 경우
				if(su > 90) {  //'Z'를 넘어가는 경우
					while(su > 90) {//n값이 아주 큰 값이 들어와서 알파벳 대문자가 나올때 까지 반복
						su -= 26;
					}
					System.out.print((char)su);
				}
				else {
					System.out.print((char)su); 
				}
			}
			else { //'a' ~ 'z'일경우
				if(su >122) {  //'z'를 넘어가는 경우
					while(su > 122) {//n값이 아주 큰 값이 들어와서 알파벳 소문자가 나올때 까지 반복
						su -= 26;
					}
					System.out.print((char)su);
				}
				else System.out.print((char)su); 
			}	
		}
	}
}
