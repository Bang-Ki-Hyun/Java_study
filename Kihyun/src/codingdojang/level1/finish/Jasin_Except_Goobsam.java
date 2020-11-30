package codingdojang.level1.finish;
//�ڽ��� ������ ����

import java.util.Scanner;

//�迭 [a,b,c,d]�� �Է��ϸ� �迭[bcd, acd, abd, abc]�� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
//(��, ������ ��� ����)

//����µǴ� �迭�� � �����̵� ��������ϴ�.

//�Է� ����
//2, 6, 4, 7

//��� ����
//168, 56, 84, 48



//�ϼ�
public class Jasin_Except_Goobsam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] printArr = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("�迭 " + i + "�� ° ���ڸ� �Է��ϼ���.");
			arr[i] = sc.nextInt();
		}
		
		printArr[0] = arr[1] * arr[2] * arr[3];
		printArr[1] = arr[0] * arr[2] * arr[3];
		printArr[2] = arr[0] * arr[1] * arr[3];
		printArr[3] = arr[0] * arr[1] * arr[2];
		
		for (int i = 0; i < arr.length; i++) {
			if(i != 3) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.println(arr[i] + "\n");
			}
		}
		
		for (int i = 0; i < printArr.length; i++) {
			if(i != 3) {
				System.out.print(printArr[i] + ", ");
			} else {
				System.out.print(printArr[i]);
			}
			
		}
		
		
		
	}
}
