package codingdojang.level1.finish;
//주어진 문자열(공백 없이 쉼표로 구분되어 있음)을 가지고 아래 문제에 대한 프로그램을 작성하세요.
//
//이유덕, 이재영, 박민호, 강상희, 이재영, 김지완, 최승혁, 이성연, 박영서, 박민호, 전경헌, 
//송정환, 김재성, 이유덕, 전경헌
//
//1. 김씨와 이씨는 각각 몇 명인가요?
//2. "이재영"이란 이름이 몇 번 반복되나요?
//3. 중복을 제거한 이름을 출력하세요.
//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.

//완성
import java.util.ArrayList;
import java.util.Collections;
 
public class Saeeenapsoft {
	
	public static void main(String[] args) {
		String strName[] = {"이유덕", "이재영", "권종표", "이재영", "박민호", "강상희", "이재영",
				"김지완", "최승혁", "이성연", "박영서", "박민호", "전경헌", "송정환","김재성","이유덕","전경헌"};
	
		
		//1번
		int kimCount = 0, leeCount = 0;  //김씨, 이씨 명수담을 변수
		
		for(int i = 0; i < strName.length; i++) { //배열의 크기 만큼 반복
			if(strName[i].charAt(0) == '김' ) {  //김씨일 경우
				kimCount++;
			}
			else if(strName[i].charAt(0) == '이') {  //이씨일 경우
				leeCount++;
			}
		}
		System.out.println("1. 김씨는 " + kimCount + " 이씨는 " + leeCount );
		
		//2번
		int leeJaeyoungName = 0;  //이재영 count
		
		for(int i = 0; i < strName.length; i++) { //배열 전체 반복 
			if(strName[i] == "이재영") {  //이재영을 만나면 count1증가
				leeJaeyoungName++;
			}
		}
		System.out.println("2. 이재영은 " + leeJaeyoungName + "번 반복됩니다.");
		
		//3번
		ArrayList<String> arrayList = new ArrayList<>(); //arrayList생성
		
		for(String name : strName) {  //strName배열 값들을 확인하면서 
			if(!arrayList.contains(name))  //중복이 아닐때만 arrayList에 값 저장
				arrayList.add(name);
		}
		System.out.println("3. 중복을 제거한 이름은 " + arrayList);
		
		//4번
		Collections.sort(arrayList);  //arrayList을 collection메소드를 이용해 정렬 한다.
		System.out.println("4. 중복을 제거하고 정렬은 "+ arrayList);
		
		
		
		
		
		
	
	}
	
}
