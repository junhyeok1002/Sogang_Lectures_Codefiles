//20180634 최준혁

package p2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class P6_20180634_2 {
	public static void main(String[] args)
	{
		File file = new File("password.txt");
		Scanner scin;
		if (file.exists()) {
			try {
				scin = new Scanner(file);
				int i=0;
				while (scin.hasNext()) {
					if (i == 0) {
						i++;
						int noNeedNum = scin.nextInt();
						continue;
					}
					else {
						boolean flag = true;
						int riff = 1;
						String name = scin.next();
						int num = name.length() - 1;
						for (int n=0 ; n <= num; num-=2) {
							int k = 0;
							for(int m = 0; m < num;m++) {
								char [] riffch1 = new char[riff];
								char [] riffch2 = new char[riff];
								name.getChars(k,k+riff, riffch1,0);
								name.getChars(k+riff,k+riff+riff, riffch2,0);
								
								String riff1 = new String(riffch1);
								String riff2 = new String(riffch2);
							
								if (riff1.equals(riff2)) flag = false;// equals == 차이 확실히, string , 배열에 따라 뭐가 달라지는지 확실히
								k++;
							}
							riff++;
						}
						if (flag == true) System.out.println(name+" : accept");
						else if (flag == false) System.out.println(name+" : reject");
					}
					i++;
				}
				scin.close();
			} catch (IOException e) {}
		}
		else {
			System.out.println("password.txt not exist!!");
		}
	}
}
