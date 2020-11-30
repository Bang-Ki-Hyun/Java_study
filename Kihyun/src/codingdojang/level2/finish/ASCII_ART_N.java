package codingdojang.level2.finish;

import java.util.Scanner;



public class ASCII_ART_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int c = num / 2;
		int space1 = num;
		int space2 = num;
		int d = num - 1;
		int e = num / 2;
		int f = e - 2;
		
		for(int i = 0; i < num; i++) {
			if(i < num / 2) {
				System.out.print("N");
				if(i > 0) {
					for(int j = 0; j < i; j++) {
						if(i > 1) {
							for(int k = 0; k < num - d; k++) {
								System.out.print(" ");
								j++;
							}
							System.out.print("N");
							d--;
						} else {
							System.out.print("N");
						}
					}
				}
				for(int j = 0; j < space1 - 2; j++) {
					System.out.print(" ");
				}
				System.out.print("N");
				space1--;
			} else if(i < num - c) {
				if(num > 1) {
					System.out.print("N");
					for(int j = 0; j < (num / 2) - 1; j++ ) {
						System.out.print(" ");
					}
					System.out.print("N");
					for(int j = 0; j < (num / 2) - 1; j++ ) {
						System.out.print(" ");
					}
					System.out.print("N");
				} else {
					System.out.print("N");
				}
				
					
			} else {  
				
				System.out.print("N");
				
				
					if(num > 5) {
						//System.out.println(i);
						for(int j = 0; j < e; j++) {
							System.out.print(" ");
						}
						if(i != num - 1) {
							System.out.print("N");
						}
						
						e++;
						
						
						for (int j = 0; j < f; j++) {
							System.out.print(" ");
						}
						f--;
						
					} else{
						//System.out.println(i);
						for(int j = 0; j < i - 1; j++) {
							System.out.print(" ");
						}
						if(num > 3 && i == 3) {
							System.out.print("N");
						}
					}
				
				//System.out.print(i);
				System.out.print("N");
			}
			System.out.println("");
		}
		
		
		
		
		
	}
	
	
}
