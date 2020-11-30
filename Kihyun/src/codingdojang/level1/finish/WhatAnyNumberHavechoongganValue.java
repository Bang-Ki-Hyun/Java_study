package codingdojang.level1.finish;

import java.util.Scanner;

//��� ���ڰ� �߰����� ������ �����ϱ�?

//3���� ���ڸ� �Է����� �ް� 3���� ���� �� �߰����� ������ ���ڸ� ����ϼ���. 
//ex1) 2, 5, 3 => 3 ex) 4, 6, 4 => 4

//�ϼ�
public class WhatAnyNumberHavechoongganValue {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b ,c;
		
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		b = sc.nextInt();
		System.out.println("����° ���ڸ� �Է����ּ���.");
		c = sc.nextInt();
		
		
		int secondNum = 0;
		if( a < b ) {
			secondNum = a;
			if(a < c) {
				if(c < b) {
					secondNum = c;
				}
				else {
					secondNum = b;
				}
			}
		} else {
			secondNum = b;
			if(b < c) {
				if(c < a) {
					secondNum = c;
				} else {
					secondNum = a;
				}
			}
		}
		
		System.out.println("�߰� ���� : " + secondNum);
		
	}
}
