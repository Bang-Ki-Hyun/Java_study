package codingdojang.level1.finish;
//예로 10 ~ 15까지의 각 숫자의 개수를 구해보자
//10 = 1, 0
//11 = 1, 1
//12 = 1, 2
//13 = 1, 3
//14 = 1, 4
//15 = 1, 5

//그러므로 이 경우의 답은 0:1개, 1:7개, 2:1개, 3:1개, 4:1개, 5:1개

//완성
public class One_Thousand_count {
	
	public static void main(String[] args) {
		
		String strNum = null;
		NumStore NS = new NumStore();
		int Num[] = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 1; i < 1001; i++) {
			strNum = String.valueOf(i);
			
			for(int j = 0; j < strNum.length(); j++) {
				NS.numStore(Num, strNum.charAt(j));
				/*
				if(strNum.charAt(j) == '0') {
					System.out.println("d");
					NS.num0++;
				} else if(strNum.charAt(j) == '1') {
					NS.num1++;
				} else if(strNum.charAt(j) == '2') {
					NS.num2++;
				} else if(strNum.charAt(j) == '3') {
					NS.num3++;
				} else if(strNum.charAt(j) == '4') {
					NS.num4++;
				} else if(strNum.charAt(j) == '5') {
					NS.num5++;
				} else if(strNum.charAt(j) == '6') {
					NS.num6++;
				} else if(strNum.charAt(j) == '7') {
					NS.num7++;
				} else if(strNum.charAt(j) == '8') {
					NS.num8++;
				} else {
					NS.num9++;
				}
				*/
			}
		}
		
		//System.out.println("0:"+ num0 + "개 1:"+ num1 + "개 2:"+ num2 + "개 3:"+ num3 + "개 4:"+ num4 + "개");
		//System.out.println("5:"+ num5 + "개 6:"+ num6 + "개 7:"+ num7 + "개 8:"+ num8 + "개 9:"+ num9 + "개");
		for(int i = 0; i < 10; i++) {
			System.out.print("0:" + NS.num[i] + "  ");
			if(i == 4) {
				System.out.println();
			}
			
		}
	}
}



