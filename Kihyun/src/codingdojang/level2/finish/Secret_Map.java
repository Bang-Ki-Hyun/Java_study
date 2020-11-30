package codingdojang.level2.finish;

import java.util.Arrays;
import java.util.Scanner;

public class Secret_Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("n을 입력해주세요.");
			n = sc.nextInt();
		} while(n < 1 || n > 16);
		
		int rand;
		int randNum = 1;
		
		for(int i = 0; i < n; i++ ) {
			randNum *= 2;
		}
		randNum -= 1;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] result = new int[n];
		String strArr1;
		String strArr2;
		
		
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * randNum + 1);
		}
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * randNum + 1);
		}
		
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ "\t");
		}
		System.out.println();
		
		int or;
		String strOR;
		
		for(int i = 0; i < result.length; i++) {
			
			result[i] = arr1[i] | arr2[i];
			
		}
	
		
		String[] strFinish = new String[n];
		String strResult;
		int strResultLen;
		
		String strFifi = "";
		
		
		
		for(int i = 0; i < strFinish.length; i++) {
			strResult = Integer.toBinaryString(result[i]);
			strResultLen = strResult.length();
			for(int j = 0; j< n - strResultLen; j++) {
				strFifi += "0";
			}
			for(int j = 0; j <strResultLen; j++) {
				strFifi += String.valueOf(strResult.charAt(j));
			}
			strFinish[i] = strFifi;
			strFifi = "";
		}
		for (int i = 0; i < strFinish.length; i++) {
			System.out.println(strFinish[i]);
		}
		
		System.out.println();System.out.println(); System.out.println();System.out.println();
		String[] strPrint = new String[n];
		String strShap = "";
		char c;
		
		for(int i = 0; i < strFinish.length; i++) {
			for(int j = 0; j < strFinish[i].length(); j++) {
				if(strFinish[i].charAt(j) == '1') {
					strShap += "#";
				} else {
					strShap += " ";
				}
			}
			strPrint[i] = strShap;
			strShap = "";
			
		}
		
		for (int i = 0; i < strPrint.length; i++) {
			System.out.println(strPrint[i]);
		}
		
		
		
		
		
		
		
		
		
		
		 
		
	}
}