package p2;

import java.util.ArrayList;

public class Student{
	private String name;
	private ArrayList<String> eList = new ArrayList<String>(); // 과목 세 개를 ArrayList로 관리한다.
	
	public void setName(String name) {
		this.name = name;
	}
	public void setArrayList(ArrayList<String> eList) {
		this.eList = eList;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<String> getArrayList() {
		return this.eList;
	}
	
	// accessor, mutator 추가할 것. 
	// 필요한 메소드 추가할 것. 
}
