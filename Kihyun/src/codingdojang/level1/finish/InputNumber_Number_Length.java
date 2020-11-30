package codingdojang.level1.finish;
//���ڸ� �Է¹����� �׿� �´� �ڸ��� ���

import java.util.Scanner;

//���ڸ� �Է¹����� �׿� �ش��ϴ� �ڸ����� ����ϴ� �ڵ带 �ۼ��϶�
//�Է� : 156   ��� : 100�� �ڸ���
//�Է� : 18961 ��� : 10000�� �ڸ���

//�ϼ�
public class InputNumber_Number_Length {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String str = sc.next();
		
		String sumStr = "1";
		
		for (int i = 0; i < str.length() - 1; i++) {
			sumStr += "0";
		}
		
		System.out.print("��� : " + sumStr + "���ڸ���");
	}
}
