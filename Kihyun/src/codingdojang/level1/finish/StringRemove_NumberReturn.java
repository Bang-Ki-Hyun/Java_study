package codingdojang.level1.finish;
//���ڿ��� �����ѵ� ���ڸ� ��ȯ

import java.util.Scanner;

//����� �౸�� ���ٰ� �츮���� �������� ������ �˰� �;���.
//�׷��� �˻����ؼ� �޸��忡 ���µ� Ű���尡 ���׸��ϰ� ����������
//�ڲ� ���ڰ��ƴ� ���ڸ� �����Է��ع�����
//ex: xxx : 1627000000 > xxx : 1w627r00o00p00 �� (Ư����������)
//����� ������������ ���ξȵǴ°Ϳ�
//�ʹ�ȭ������ �ڽ��̼������Է��ϸ� ���ڿ��� ������ ���ڸ� ��ȯ�ϴ� �ڵ带 �����;��Ѵ�
//ȭ���� ���츦���� �ڵ带 ������!


//�ϼ�
public class StringRemove_NumberReturn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�౸ ���� : ");
		String str = sc.next();
		String sumStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sumStr += String.valueOf(str.charAt(i));
			}
		}
		
		System.out.println("�౸ ���� : " + sumStr);
	}
}
