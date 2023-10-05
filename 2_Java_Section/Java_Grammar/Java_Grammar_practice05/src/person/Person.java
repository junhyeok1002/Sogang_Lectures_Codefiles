package person;

//package, import 필요한 부분 추가할 것
public class Person { 
	private int no;        // 학번 
	private String name;  // 이름
	//생성자, 메소드 추가할 것.
	
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