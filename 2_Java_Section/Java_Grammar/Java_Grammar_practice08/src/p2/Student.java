package p2;

import java.util.ArrayList;

public class Student{
	private String name;
	private ArrayList<String> eList = new ArrayList<String>(); // ���� �� ���� ArrayList�� �����Ѵ�.
	
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
	
	// accessor, mutator �߰��� ��. 
	// �ʿ��� �޼ҵ� �߰��� ��. 
}
