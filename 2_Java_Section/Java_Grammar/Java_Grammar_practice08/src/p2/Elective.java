package p2;

import java.util.ArrayList;

public class Elective {
	
	private String name;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	 // 필요한 메소드 추가할 것.
	public void setName(String name) {
		this.name = name;
	}
	public void setArrayList(ArrayList<Student> stuList) {
		this.studentList = stuList;
	}
	public String getName() {
		return this.name;
	}
	public ArrayList<Student> getArrayList() {
		return this.studentList;
	}
	public void print() {
		for (int i=0; i < studentList.size(); i++) {
			System.out.print(studentList.get(i).getName()+" ");
		}
	}
}

