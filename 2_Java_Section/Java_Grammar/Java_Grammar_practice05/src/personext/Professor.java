package personext;

//package, import �ʿ��� �κ� �߰��� ��
import person.Person;


public class Professor extends Person {
	private int code1;  // ���� å �ڵ� 1 
	private int code2;  // ���� å �ڵ� 2
	//������, �޼ҵ� �߰��� ��.
	
	public Professor() {}
	public Professor(int no, String name,int c1, int c2) {
		super(no,name);
		this.code1 = c1; 
		this.code2 = c2;
	}
	public int getcode1(){
		return this.code1;
	}
	public int getcode2(){
		return this.code2;
	}
}