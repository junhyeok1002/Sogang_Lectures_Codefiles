package p1;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class P8_20180634_1 {
	public static void main(String[] args)
	{
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
			
			System.out.println(String.format("%10s %10s %10s %10s", name, s1, s2, s3));
		}	
	}
}
