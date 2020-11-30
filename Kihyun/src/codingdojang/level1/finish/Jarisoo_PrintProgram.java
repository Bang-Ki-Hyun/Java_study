package codingdojang.level1.finish;

import java.util.Scanner;

//�ڸ����� ����ϴ� ���α׷�


//���� ������ �Է����� �ް� �� ���� �ڸ����� ����غ��� 자리수
//ex1) 3 > 1�ڸ���, ex2) 649 > 3�ڸ��� ....

//�ϼ�
public class Jarisoo_PrintProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		while(true) {
			System.out.println("���� ������ �Է����ּ���.");
			num = sc.nextInt();
			
			if(num > 0 ) break;
			
		}
		
		System.out.println(num + " > " + String.valueOf(num).length() + "�ڸ���");
		
	}
}
