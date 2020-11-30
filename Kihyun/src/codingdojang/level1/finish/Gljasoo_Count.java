package codingdojang.level1.finish;
//������ ������ ���ڼ� ����

import java.util.Scanner;

//���̹� ���ڼ� ���� �� Ư�� ���� ���ڸ� ���� ���α׷��� �Ϲ������� ������ ������ ���ڼ��� ����
//��ɵ� ������ �ִ�. ��� ���ڿ��� �Է¹޾��� �� �ٹٲް� ������ ������ ���ڼ����� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.



//�ϼ�
public class Gljasoo_Count {
	public static void main(String[] args) {
		//Scanner sc =  new Scanner(System.in);
		
		//System.out.println("���ڸ� �Է����ּ���.");
		//String str = sc.nextLine();
		
		String str1 = "������ ������\n���ڼ����� ���� �ڵ� �׽�Ʈ";
		//System.out.println(str1.length());
		
		String sumStr = "";
		//System.out.println(str);
		//System.out.println(str.length());
		
		for(int i = 0 ; i < str1.length(); i++) {
			//System.out.println(str1.charAt(i));
			if(str1.charAt(i) != ' ' && str1.charAt(i) != '\n') {
				sumStr += String.valueOf(str1.charAt(i));
				//System.out.println(sumStr);
			}
		}
		
		System.out.println("���ڼ��� : " + sumStr.length());
		
	}
}
