package codingdojang.level1.finish;
//A씨는 게시판 프로그램을 작성하고 있다.
//A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이
//필요하다고 한다.
//
//입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단, n은 1보다 크거나 같다. n >= 1)
//출력 : 총페이지수
//A씨가 필요한 프로그램을 작성하시오.
//
//완성


import java.util.Scanner;

public class Gaesipan_paging {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("총건수(m)와 한페이지에 보여줄 게시물수(n)을 입력하세요. ");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		while (n < 1) {
			n = scanner.nextInt(); //n은 1보다 크거나 같다.
		}
		int pr = 0, co = 0;
		int sub = m - n;
		
		
		
		/*
		do {
			if(sub < 0 ) {
				pr = co;
				co--;
			}
			else {
				co++;
				pr = co;
				if(co != 1) {
					sub -= n; //?
				}
				
			}
			
		} while( sub >= 0 );*/
		
		if(m == 0) { //m값이 0이면 무조건 출력0 
			pr = 0;
		} else {  //m값이 0이 아닐경우
			while(sub >= 0 ) {
				if(sub != 0 ||pr == 0) {
					pr = ++co;
				}
			
				sub -= n;
			}	
			if(sub != 0) {
				if(m != n) ++pr;
			}
		}

		System.out.println("총 페이지수는 " + m + " " + n + " " + pr);
	}

}
