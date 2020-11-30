package codingdojang.level1.finish;

import java.util.ArrayList;


//��� ���ϱ�

//����Ʈ�� �ִ� ���ڵ��� ����� ���ϴ� ���α׷��� ������.

//���� ����� �ʾ� �迭��

//�ϼ�
public class Calculate_Avg {
	public static void main(String[] args) {
		int[] arr1 = {4, 6, 8};
		int[] arr2 = {11, 17, 20, 24};
		int[] arr3 = {26, 33, 45, 51, 60};
		
		int arr1Sum = 0;
		int arr2Sum = 0;
		int arr3Sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			arr1Sum += arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr2Sum += arr2[i];
		}
		
		for (int i = 0; i < arr3.length; i++) {
			arr3Sum += arr3[i];
		}
		
		System.out.println(arr1Sum / arr1.length);
		System.out.println(arr2Sum / arr2.length);
		System.out.println(arr3Sum / arr3.length);
		
		
	}
}
