package p2;

import java.util.*;

public class P7_20180634_2 {
	public static void main(String args[]) { 
		String guessWords[] = {"algorithm", "university", "programming", "windows", "excel", "sogang"};
		
		// random���� ���ڿ��̾ƿ���
		Random rand = new Random();
		int index = rand.nextInt(guessWords.length);
		String randStr = guessWords[index];
		
		// ------�����
		char ch[] = new char[randStr.length()];

		for(int i =0; i< randStr.length();i++) {
			ch[i] = '-';
		}
		//randStr�� char �迭ȭ
		char str[] = new char[randStr.length()];

		for(int i =0; i< randStr.length();i++) {
			str[i] = randStr.charAt(i);
		}
	
		
		int leftTryNum = randStr.length(); // ���� �õ� Ƚ��
		int findNum = 0; // ã�� ���ĺ� ����
		String revealedWord = new String(ch); // ������ �˹����
		
		
		while(leftTryNum > 0) {
			System.out.println("Guess a word : "+revealedWord);
			System.out.println("The number of correct guess : " + findNum);
			System.out.print("Enter a guess character : ");
			
			Scanner scin = new Scanner(System.in);
			String input = scin.next();
			char oneWord = input.charAt(0);
			
			System.out.println("Letter entered : "+oneWord);
			
			boolean ansCheck = false;
			int correctNum = 0 ;
			
			
			for(int i = 0; i< randStr.length();i++) {
				if(str[i] == oneWord) {
					ansCheck = true;
					ch[i] = oneWord;
					
					//�̹� ã�� ���ڸ� �ļ� findNum �� �ö󰡴°� ������ 
					String newRevealedWord = new String(ch);
					if(newRevealedWord.equals(revealedWord)) correctNum+=0;
					else correctNum+=1;
				}
			}
			findNum += correctNum;
			if(ansCheck == true) {
				System.out.println("Correct guess :>");
				
				revealedWord = new String(ch);
				if (revealedWord.equals(randStr)) {
					System.out.println("YOU WIN!! :>");
					break;
				}
				System.out.println();
			}
			else {
				System.out.println("Sorry, wrong guess");
				System.out.println();
				leftTryNum--;
			}
			if(leftTryNum == 0) {
				System.out.println("Sorry you lose, the word was : "+randStr);
			}
		}		
	}
}



