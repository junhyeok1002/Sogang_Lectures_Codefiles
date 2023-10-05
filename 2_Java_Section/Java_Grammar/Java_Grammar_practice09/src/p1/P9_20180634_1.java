package p1;

//package
//import
import java.util.LinkedList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Ban {
	private int ban;
	private LinkedList<Student> list = new LinkedList<Student>();
	// 추가할 것
	public void setBanList(int ban, Student stu) {
		this.ban = ban;
		list.add(stu);
	}
	public LinkedList<Student> getBanList(){return this.list;}
	public int getBan(){return this.ban;}
	public void setBan(int ban){this.ban = ban;}
	public void BanSort() {
		for (int i = 0; i<list.size();i++) {
			for (int j = 0; j<list.size()-1;j++) {
				if(list.get(j).getNo()>list.get(j+1).getNo()) {
					Student temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
	}
}
class Student {
	private int no;
	private String name;
	//추가할 것
	public void setNo(int no) {this.no = no;}
	public void setName(String name) {this.name = name;}
	
	public int getNo() {return this.no;}
	public String getName() {return this.name ;}
}


public class P9_20180634_1 {
	public static void main(String[] args) {
		// 완성할 것
		LinkedList<Ban> BanList = new LinkedList<Ban>();
		
		File file = new File("student.txt");
		Scanner scin;
		if (file.exists()) { 
			try { scin = new Scanner(file);
				while (scin.hasNext()) {
						String name = scin.next();
						int ban = scin.nextInt();
						int no = scin.nextInt();
						
						Student stu = new Student();
						stu.setNo(no);
						stu.setName(name);
						
						boolean flag = false;
						
						for(int i=0; i<BanList.size();i++) {
							if (ban == BanList.get(i).getBan()) {
								 BanList.get(i).setBanList(ban,stu);
								 flag = true;
							}
						}
						if(flag == false) {
							Ban newBan = new Ban();
							newBan.setBanList(ban,stu);
							BanList.add(newBan);
						}
				}
				scin.close(); 
			} catch (IOException e) {}
		}
		else {
			System.out.println("student.txt not exist!!");
		}
		
		// sorted
		for(int i = 0; i<BanList.size(); i++) {
			BanList.get(i).BanSort();
		}

		for (int i = 0; i<BanList.size();i++) {
			for (int j = 0; j<BanList.size()-1;j++) {
				if(BanList.get(j).getBan()>BanList.get(j+1).getBan()) {
					Ban temp = BanList.get(j);
					BanList.set(j, BanList.get(j+1));
					BanList.set(j+1, temp);
				}
			}
		}
		
		for(int i = 0 ; i < BanList.size(); i++) {
			System.out.println("<"+BanList.get(i).getBan()+"반>");
			for (int j=0;j<BanList.get(i).getBanList().size();j++) {
				System.out.println(BanList.get(i).getBanList().get(j).getNo()+"번 "+BanList.get(i).getBanList().get(j).getName());
			}
			System.out.println();
		}
	}
}
