package personext;

//package, import �ʿ��� �κ� �߰��� ��
import person.Person;

public class Student extends Person {
	private int code;  // ���� å �ڵ�
	//������, �޼ҵ� �߰��� ��.
	
	public Student() {}
	public Student(int no, String name,int code) {
		super(no, name);
		this.code = code;
	}
	public int getcode1(){
		return this.code;
	}
	public int getcode2(){
		return this.code;
	}
}