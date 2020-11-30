package codingdojang.level1.finish;
//디지털 시계에 하루동안(00:00 ~ 23:59) 3이 표시되는 시간을 초로 환산하면 총 몇 초(second)일 까요?

//디지털 시계는 하루동안 다음과 같이 시:분(00:00 ~ 23:59)으로 표시됩니다.

//00:00 (60초간 표시됨)
//00:01
//00:02
//...
//23:59

//완성
public class ThreeTime {
	public static void main(String[] args) {
		int sum = 0;

		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60; min++) {
				System.out.println(min);
				if(hour % 10 == 3 || min % 10 == 3 || min / 10 == 3) {
					sum += 1;
					
				}
			}
		}
		
		System.out.println(sum);
	}
}
