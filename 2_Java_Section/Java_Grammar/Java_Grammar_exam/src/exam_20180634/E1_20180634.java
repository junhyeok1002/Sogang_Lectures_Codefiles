package exam_20180634;

import java.util.*;

public class E1_20180634 {
	public static void main(String[] args) {
		String[] color = {"red", "green", "blue", "white", "black", "yellow", "pink", "grey"};
		Queue<String> q = new LinkedList<String>();
		Stack <String> st = new Stack<String>();
		
		// 1. color의 데이터를 순서대로 하나씩 큐에 넣는다.
		
		for(int i=0;i<color.length;i++) {
			q.offer(color[i]);
		}
		
		// 2. 큐에서 데이터를 하나씩 빼내어 스택에 넣는다. 
		for(int i=0;i<color.length;i++) {
			String str = q.poll();
			st.push(str);
		}
		
		// 3. 스택에서 하나씩 꺼내면서 출력한다.
		for(int i=0;i<color.length;i++) {
			String str = st.pop();
			System.out.println(str);
		}
		
	}


}
