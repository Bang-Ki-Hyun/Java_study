package codingdojang.level1.finish;
//Ȧ���� ¦���� ���� ���ϱ�

import java.util.Arrays;

//[3,4,5,6,7]
//Ȧ�� 3��, ¦�� 2��
//[12,16,22,24,29]
//Ȧ�� 1��, ¦�� 4��
//[41, 43, 45, 47, 49]
//Ȧ�� 5��, ¦�� 0��


//�ϼ�
public class Odd_Even_Count {
	public static void main(String[] args) {
		int[] arr1 = {3,4,5,6,7};
		int[] arr2 = {12,16,22,24,29};
		int[] arr3 = {41,43,45,47,49};
		
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("= Ȧ�� " + odd + ", ¦�� " + even);
		odd = 0; even = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("= Ȧ�� " + odd + ", ¦�� " + even);
		odd = 0; even = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			if(arr3[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println("= Ȧ�� " + odd + ", ¦�� " + even);
		odd = 0; even = 0;
		
	}
}
