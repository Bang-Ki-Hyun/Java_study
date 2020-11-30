package codingdojang.level1.wait;
//기계를 구입하려는데 이 기계는 추가 부품을 장착할 수 있다. 추가 부품은 종류당 하나씩만 장착 가능하고,
//모든 추가 부품은 동일한 가격을 가진다.

//원래 기계의 가격과 성능, 추가 부품의 성능이 주어졌을 때, 추가 부품을 장착하여 얻을 수 있는 최대 가성비를
//정수 부분까지 구하시오(가격 및 성능은 상대적인 값으로 수치화되어 주어진다.

//e.g)
//원래 기계의 가격 : 10
//원래 기계의 성능 : 150
//추가 부품의 가격 : 3
//추가 부품의 성능 : 각각 30, 70, 15 , 40, 65
//추가 부품을 장착하여 얻을 수 있는 최대 가성비 : 17.81.... -> 17
//(성능이 70과 65인 부품을 장착하면 됨)


//너무 오래 돌아감..  보류!!!!
public class GasunbiMax {
	
	public static void main(String[] args) {
		int machinePrice = 10;
		int machinePerformance = 150;
		
		int machineRate = machinePerformance / machinePrice;
		
		int[] machineAdd = {30, 70, 15, 40, 65};
		int addC = 1;
		int maxgasungbi = 0;
		int gasungbi;
		
		while(addC < 6) {
			if(addC == 1) {
				for(int i = 0; i < 5; i++) {
					
					gasungbi = (machinePerformance + machineAdd[i]) / (machinePrice + 3);
					if(i == 0) maxgasungbi = gasungbi;
					else {
						if(maxgasungbi < gasungbi) {
							maxgasungbi = gasungbi;
						}
					}
				}
			}
			else if(addC == 2) {
				for(int i = 0; i < 5; i++) {
					for(int j = i+1; j < 5; j++) {
						
						gasungbi = (machinePerformance + machineAdd[i] + machineAdd[j]) / (machinePrice + 6);
						if(maxgasungbi < gasungbi) {
							maxgasungbi = gasungbi;
						}
					}
				}
			}
			else if(addC == 3) {
				for(int i = 0; i < 5; i++) {
					for(int j = i + 1; j < 5; i++) {
						for(int k = j + 1; k < 5; k++) {
							gasungbi = (machinePerformance + machineAdd[i] + machineAdd[j] + machineAdd[k]) / (machinePrice + 9);
							if(maxgasungbi < gasungbi) {
								maxgasungbi = gasungbi;
							}
						}
					}
				}
			}
			else if(addC == 4) {
				for(int i = 0; i < 5; i++) {
					for(int j = i + 1; j < 5; i++) {
						for(int k = j + 1; k < 5; k++) {
							for(int l = k + 1; l < 5; l++) {
								gasungbi = (machinePerformance + machineAdd[i] + machineAdd[j] + machineAdd[k] + machineAdd[l]) / (machinePrice + 12);
								if(maxgasungbi < gasungbi) {
									maxgasungbi = gasungbi;
								}
							}
						}
					}
				}
			}
			else {
				gasungbi = (machinePerformance + machineAdd[0] + machineAdd[1] + machineAdd[2] + machineAdd[3] + machineAdd[4]) / (machinePrice + 6);
				if(maxgasungbi < gasungbi) {
					maxgasungbi = gasungbi;
				}
			}
		}
		
		System.out.println("최대 가성비는 " + maxgasungbi + "입니다.");
		
		
	}
}
