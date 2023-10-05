package p1;

import java.util.Scanner;
//package, import 필요한 부분 추가할 것
import book.Book;
import bookext.*;
import person.Person;
import personext.*;

public class P5_20180634_1 {
	public static void main(String[] args) { 
		Person[] P = new Person[5]; 
		P[0] = new Student(20191234, "Hong Gil Dong", 4); 
		P[1] = new Student(20181111, "Lee Gil Dong", 7); 
		P[2] = new Professor(123456, "Lee Chul Soo", 1, 5); 
		P[3] = new Professor(111111, "Kim Young Hee", 6, 2); 
		P[4] = new Student(20191000, "Park Chul Soo", 5);
		
		Book[] B = new Book[7]; 
		B[0] = new ComputerBook(1, "Algorithms", 2); 
		B[1] = new ComputerBook(2, "Networks", 4); 
		B[2] = new EnglishBook(3, "Nudge", 2009); 
		B[3] = new EnglishBook(4, "Black Swan", 2005); 
		B[4] = new EnglishBook(5, "Snoopy", 2000); 
		B[5] = new ComputerBook(6, "Cryptography", 3); 
		B[6] = new EnglishBook(7, "Peter Pan", 1990);
	
		// 결과를 보고 코드 채우기, 적절히 메소드로 나누어 구현할 것.
		
		for(int i = 0;i < B.length;i++) {
			B[i].print();
		}
		System.out.println();
		
		System.out.print("Enter book title : ");
		Scanner scin = new Scanner(System.in);
		String str = scin.nextLine();
		scin.close();
		
		boolean borrowedTest = false;
		
		for(int i = 0;i < B.length;i++) {
			if( str.equals(B[i].gettitle())) { // 질문하기 왜 == 은 안되고  equals를 써야하는지...
				B[i].print2();
				
				for (int j=0;j<P.length;j++) {
					if(B[i].getcode()==P[j].getcode1() || B[i].getcode()==P[j].getcode2()) {
						System.out.print(B[i].gettitle()+" is borrowed by ");
					
						if (P[j] instanceof Professor) System.out.print("professor ");
						else if (P[j] instanceof Student) System.out.print("student ");		
						
						System.out.println(P[j].getName()+"("+P[j].getNo()+")"); 
						
						borrowedTest = true;
					}
				}
				if(borrowedTest == false) {
					System.out.println("*** No one borrowed \'"+B[i].gettitle()+"' ***");
				}
				
				break;
			}
			else {
				if(i+1 == B.length) System.out.println("*** There is no book - \'"+str+"\' ***");
				else continue;
			}
		}
		
	
	}


}
