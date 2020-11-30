package codingdojang.level1.finish;

public class NumStore {
	int num[] = {0,0,0,0,0,0,0,0,0,0};

	void numStore(int numArr[], char C) {
		if(C == '0') {
			num[0]++;
		} else if(C == '1') {
			num[1]++;
		} else if(C== '2') {
			num[2]++;
		} else if(C == '3') {
			num[3]++;
		} else if(C == '4') {
			num[4]++;
		} else if(C == '5') {
			num[5]++;
		} else if(C == '6') {
			num[6]++;
		} else if(C == '7') {
			num[7]++;
		} else if(C == '8') {
			num[8]++;
		} else {
			num[9]++;
		}
	}
}
