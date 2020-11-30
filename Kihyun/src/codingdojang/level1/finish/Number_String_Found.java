package codingdojang.level1.finish;
//문자와 숫자가섞인 문자열을 입력받을때 구별하여 출력해라

import java.util.Scanner;

//input
//"c910m6ia1ho"
//output
//str : cma ho
//int : 91061


//완성
public class Number_String_Found {
	public static void main(String[] args) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		String numStr = "";
		String charStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if((int)str.charAt(i) > 47 && (int)str.charAt(i) < 58) {
				numStr += Integer.valueOf(String.valueOf(str.charAt(i)));
			} else {
				charStr += String.valueOf(str.charAt(i));
			}
		}
		
		System.out.println(numStr + "\n" + charStr);
		
	}
}
