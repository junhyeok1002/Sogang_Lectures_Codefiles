package practice4_3;

class Student {
	private int no; // ��ȣ
	private String name; // �̸�
	private int score; // ����
	
	public Student() {}
	public Student(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}
	public void printStudent() {
		System.out.println(this.no+" : "+this.name+", "+this.score);
	}
	// �ϼ��ϱ�
	public int getNo() {
		return this.no;
	}
	public int getScore() {
		return this.score;
	}
}

public class P4_20180634_3 {
	static void sort(Student[] s, int code) { 
		// code�� �׻� �ùٸ��� 1 �Ǵ� 2�� �ִ´ٰ� �����Ѵ�.
		// �ϼ��ϱ�
		Student temp;
		if (code == 1) {
			for (int i=0;i < s.length;i++) {
				for(int j = 0;j<s.length-1;j++) {
					if(s[j].getNo()>s[j+1].getNo()) {
						temp = s[j];
						s[j] = s[j+1];
						s[j+1] = temp;
					}
				}
			}
		}
		else {
			for (int i=0;i < s.length;i++) {
				for(int j = 0;j<s.length-1;j++) {
					if(s[j].getScore()<s[j+1].getScore()) {
						temp = s[j];
						s[j] = s[j+1];
						s[j+1] = temp;
					}
				}
			}
		}
	}
	static void print(Student[] s) {
		for (int i=0 ; i<s.length; i++)
			s[i].printStudent();
	}
	public static void main(String[] args) {
		Student stu[] = new Student[10];
		stu[0] = new Student(5, "Alice", 90);
		stu[1] = new Student(10, "Paul", 88);
		stu[2] = new Student(2, "Cindy", 75);
		stu[3] = new Student(8, "David", 93);
		stu[4] = new Student(7, "Jenny", 80);
		stu[5] = new Student(1, "Tom", 82);
		stu[6] = new Student(3, "Peter", 77);
		stu[7] = new Student(9, "Bob", 85);
		stu[8] = new Student(4, "Cathy", 79);
		stu[9] = new Student(6, "Eve", 91);
		sort(stu, 1); // code 1�� ��ȣ ������ �����Ѵ�.
		print(stu);
		System.out.println("--------------");
		sort(stu, 2); // code 2�� ������ ������������ �����Ѵ�.
		print(stu);
	}
}