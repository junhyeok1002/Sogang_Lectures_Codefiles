package person;

//package, import �ʿ��� �κ� �߰��� ��
public class Person { 
	private int no;        // �й� 
	private String name;  // �̸�
	//������, �޼ҵ� �߰��� ��.
	
	public Person() {}
	public Person(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo(){
		return this.no;
	}
	public String getName(){
		return this.name;
	}
	public int getcode1(){
		return 0;
	}
	public int getcode2(){
		return 0;
	}
}