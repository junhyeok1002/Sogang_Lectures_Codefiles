//20180634 ������ 

package p1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

//import �ϱ�

class Student {
	// �ݵ�� 8���� private �Ӽ��� ���´�.
	// no, name, clang, java, html5�� ���Ϸκ��� ä���.
	// total, average, rank�� �ڵ����� ä���� �Ѵ�.
	private int no;
	private String name;
	private int clang;
	private int java;
	private int html5;
	private int total;
	private float average;
	private int rank;
	// Ŭ���� �ϼ��ϱ�
	Student(){}
	Student(int no, String name, int clang, int java, int html5){
		this.no = no;
		this.name = name;
		this.clang = clang;
		this.java = java;
		this.html5 = html5;
	}

	public void setTotal() {
		this.total = this.clang + this.java + this.html5 ;
	}
	public void setAverage() {
		this.average = (float)this.total / (float)3 ;
	}
	public void setRank(int rank) {
		this.rank = rank ;
	}
	
	
	public int getTotal() {
		return this.total;
	}
	public int getRank() {
		return this.rank;
	}
	
	DecimalFormat df1 = new DecimalFormat("00");
	DecimalFormat df2 = new DecimalFormat("00.##");
	
	public void print() {
		System.out.println("rank : "+df1.format(this.rank)+" ["+this.no+", "+this.name+", (total: "+this.total+", average : "+df2.format(this.average)+")]");
	}
	public String toString() {
		return "rank : "+df1.format(this.rank)+" ["+this.no+", "+this.name+", (total: "+this.total+", average : "+df2.format(this.average)+")]";
	}
	
	
	
}

public class P6_20180634_1 {
	public static void main(String[] args) {
		Student st[] = new Student[10];
		
		// ���Ͽ��� �����͸� �о �迭 ä���
		File file = new File("student.txt");
		Scanner scin;
		if (file.exists()) {
			try {
				int i = 0;
				
				scin = new Scanner(file);
				while (scin.hasNext()) {
					int no = scin.nextInt();
					String name = scin.next();
					int clang = scin.nextInt();
					int java = scin.nextInt();
					int html5 = scin.nextInt();
					
					st[i] = new Student(no, name, clang, java, html5);
		
					i++;
				}
				scin.close();
			} catch (IOException e) {}
		}
		else {
			System.out.println("student.txt not exist!!");
		}
		
		System.out.println("***** Before Ranking *****");
		
		for (Student s : st)
			System.out.println(s);
		
		// total, average ���ϱ�
		for(int i=0;i<st.length;i++) {
			st[i].setTotal();
			st[i].setAverage();
		}
		
		// total�� ���� �迭�� ���� �������� ���� 
		int[] total = new int[st.length]; 
		for(int i=0;i<st.length;i++) {
			total[i] = st[i].getTotal();
		}
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(total[j] < total[j+1]) {
					int temp = total[j+1];
					total[j+1] = total[j];
					total[j] = temp;
				}
			}
		}
		// ���� ����� �������� ������ �迭�� ���ϸ� rank�ο�
		//(������ó�� �����غ���)
		int rank = 1;
		for(int i=0;i<total.length;i++) {
			int same = 0;
			
			for(int j=0;j<st.length;j++) {
				if (total[i] == st[j].getTotal()) {
					st[j].setRank(rank);
					same ++;
				}
			}
			rank +=same;
		}
		//rank�� ������ st�迭�� �������� ����
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st.length-1;j++) {
				if(st[j].getRank() > st[j+1].getRank()) {
					Student temp = st[j+1];
					st[j+1] = st[j];
					st[j] = temp;
				}
			}
		}

		System.out.println();
		System.out.println("***** After Ranking *****");
		
		for (Student s : st)
			System.out.println(s);
	}
}
