package p2;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P8_20180634_2 {
	public static void main(String[] args) {
		System.out.println("===================   Student List   ===================");
		System.out.println("--------------------------------------------------------");
		ArrayList<Student> sList = new ArrayList<Student>(); // 위의 결과가 나오도록 코드 완성할 것

		File file = new File("student.txt");

		Scanner scin;
		if (file.exists()) { 
			try { 
				scin = new Scanner(file);
				while (scin.hasNext()) {
					Student stu = new Student();
					ArrayList<String> subjects = new ArrayList<String>();

					String name = scin.next();
					subjects.add(scin.next());
					subjects.add(scin.next());
					subjects.add(scin.next());

					stu.setName(name);
					stu.setArrayList(subjects);

					sList.add(stu);
				}
				scin.close(); 
			} catch (IOException e) {}
		}
		else {
			System.out.println("student.txt not exist!!");
		}

		for (int i=0;i < sList.size();i++) {

			String name = sList.get(i).getName();
			String s1 = sList.get(i).getArrayList().get(0);
			String s2 = sList.get(i).getArrayList().get(1);
			String s3 = sList.get(i).getArrayList().get(2);

			System.out.println(String.format("%13s %13s %13s %13s", name, s1, s2, s3));
		}

			System.out.println();
			System.out.println("==========================   Elective List   ==========================");
			System.out.println("-----------------------------------------------------------------------");
			ArrayList<Elective> eList = new ArrayList<Elective>(); // 이게 잘못
			
			File file2 = new File("electives.txt");
			
			Scanner scin2;
			if (file2.exists()) { 
				try { 
					scin2 = new Scanner(file2);
					while (scin2.hasNext()) {
						Elective elec = new Elective();
						
						String sbjname = scin2.nextLine();
						elec.setName(sbjname);
						ArrayList<Student> elecStuList = new ArrayList<Student>();
						
						for (int i=0;i < sList.size();i++) {
							String s1 = sList.get(i).getArrayList().get(0);
							String s2 = sList.get(i).getArrayList().get(1);
							String s3 = sList.get(i).getArrayList().get(2);
							if(s1.equals(sbjname)) {
								elecStuList.add(sList.get(i));
							}
							if(s2.equals(sbjname)) {
								elecStuList.add(sList.get(i));
							}
							if(s3.equals(sbjname)) {
								elecStuList.add(sList.get(i));
							}
						}
						elec.setArrayList(elecStuList);
						eList.add(elec);
					}
					scin2.close(); 
				} catch (IOException e) {}
			}
			else {
				System.out.println("elective.txt not exist!!");
			}			
			
			for(int i=0;i<eList.size();i++) {
				System.out.print(String.format("[%11s] : ", eList.get(i).getName()));
				eList.get(i).print();
				System.out.println();
			}	
	}
}
