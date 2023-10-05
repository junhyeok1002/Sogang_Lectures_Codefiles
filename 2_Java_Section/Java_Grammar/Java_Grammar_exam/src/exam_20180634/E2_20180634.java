package exam_20180634;

import java.util.*;

public class E2_20180634 {
	static int N = 5; 
	
	public static void main(String[] args) { 
		
		int L[][] = {{1,3}, {2,5}, {8,10}, {4,7}, {6,9}};
		
		
		// 필요한 변수 선언 및 초기화
		
		System.out.println("< 강의 시간표 >"); 
		
		for (int i=0; i<N; i++) {
			System.out.println(L[i][0] + " " + L[i][1]); 
		}
		System.out.println();
		
		// 코드 완성
		
		// L 강의 시작 낮은 순 정렬
		for (int i=0; i<N; i++) {
			for (int j=0; j<N-1; j++) {
				if(L[j][0] > L[j+1][0]) {
					int temp = L[j][0];
					L[j][0] = L[j+1][0];
					L[j+1][0] = temp;
					
					int temp1 = L[j][1];
					L[j][1] = L[j+1][1];
					L[j+1][1] = temp1;
				}
			}
		}

		
		// 정렬된 L을 앞부터 가능한 시간표를 배열로 만들기
		ArrayList List = new ArrayList<ArrayList<String>>();
		for (int i=0; i<N; i++) {
			ArrayList list = new ArrayList<String>();
			list.add(""+L[i][0]+" "+L[i][1]+"");
			int a = L[i][1];
			
			for(int j=i+1; j<N; j++) {
				if(a<=L[j][0]) {
					list.add(""+L[j][0]+" "+L[j][1]+"");
					a = L[j][1];
				}
			}
			List.add(list);
		}
		
		System.out.println("만들 수 있는 타임 테이블은 다음과 같습니다 ㅠㅠ 부분점수라도 주세요...");
		
		for (int i=0; i<List.size(); i++) {
			System.out.println(List.get(i));
		}
		
	}
}
