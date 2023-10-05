package exam_20180634;

import java.util.*;

public class E1_20180634 {
	public static void main(String[] args) {
		String[] color = {"red", "green", "blue", "white", "black", "yellow", "pink", "grey"};
		Queue<String> q = new LinkedList<String>();
		Stack <String> st = new Stack<String>();
		
		// 1. color�� �����͸� ������� �ϳ��� ť�� �ִ´�.
		
		for(int i=0;i<color.length;i++) {
			q.offer(color[i]);
		}
		
		// 2. ť���� �����͸� �ϳ��� ������ ���ÿ� �ִ´�. 
		for(int i=0;i<color.length;i++) {
			String str = q.poll();
			st.push(str);
		}
		
		// 3. ���ÿ��� �ϳ��� �����鼭 ����Ѵ�.
		for(int i=0;i<color.length;i++) {
			String str = st.pop();
			System.out.println(str);
		}
		
	}


}
