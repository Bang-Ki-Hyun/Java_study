package codingdojang.level1.finish;
//n개의 정수를 가진 배열이 있다. 이 배열은 양의정수와 음의 정수를 모두 가지고 있다. 이제 당신은 이 배열을
//좀 특별한 방법으로 정렬해야 한다.

//정렬이 되고 난 후, 음의 정수는 앞쪽에 양의정수는 뒷쪽에 있어야 한다. 또한 양의정수와 음의 정수의 순서에는
//변함이 없어야 한다.

//예) -1 1 3 -2 2   결과 : -1 -2 1 3 2

//완성
public class Special_Sort {
	public static void main(String[] args) {
		int intNum[] = {-1, 1, 3, -2, 2};
		int minusArr[] = new int[5];
		int plusArr[] = new int[5];
 		int minuscount = 0, pluscount = 0;
 		
		
		for(int i =0; i < intNum.length; i++) {
			if(intNum[i] < 0) {
				minusArr[minuscount++] = intNum[i];
			}
			else {
				plusArr[pluscount++] = intNum[i];
			}
		}
		
		for(int i = 0 ; i < minuscount; i++) {
			System.out.print(minusArr[i] + " ");
		}
		
		for(int i = 0; i < pluscount; i++) {
			System.out.print(plusArr[i] + " ");
		}
	}
	
	

}
