package p1;

import java.util.*;

class Connection {
	private String departure;
	private String arrival;
	
	Connection(){}
	Connection(String dep, String arr){
		this.departure = dep;
		this.arrival = arr;
	}
	
	public String getDep() {
		return this.departure;
	}
	public String getArr() {
		return this.arrival;
	}
	public String toString() {
		return this.departure + " -> " + this.arrival;
	}
	
	// 클래스 완성할 것
}

public class P10_20180634_1 {
	public static void main(String[] args) {
		
		// (1) 배열 con의 정보를 차례대로 ArrayList에 저장할 것
		
		Connection[] con = new Connection[14];
		con[0] = new Connection("SanJose", "SanFrancisco");
		con[1] = new Connection("SanJose", "Anchorage");
		con[2] = new Connection("NewYork", "Anchorage");
		con[3] = new Connection("NewYork", "SanJose");
		con[4] = new Connection("NewYork", "SanFrancisco");
		con[5] = new Connection("NewYork", "Honolulu");
		con[6] = new Connection("Anchorage", "NewYork");
		con[7] = new Connection("Anchorage", "SanJose");
		con[8] = new Connection("Honolulu", "NewYork");
		con[9] = new Connection("Honolulu", "SanFrancisco");
		con[10] = new Connection("Denver", "SanJose");
		con[11] = new Connection("SanFrancisco", "NewYork");
		con[12] = new Connection("SanFrancisco", "Honolulu");
		con[13] = new Connection("SanFrancisco", "Denver");
	
		// (2) ArrayList 결과를 출력할 것 (Flight Information 출력 부분)
		
		System.out.println("----------------------------------------");
		System.out.println("Welcome to Flight Tour NORANG Balloon !!");
		System.out.println("----------------------------------------");
		
		System.out.println("\n<<< Flight Information >>>");
		for (int i = 0 ; i < con.length;i++) {
			System.out.println(con[i]);
		}
		
		// (3) 출발 도시를 중복없이 한 번씩만 LinkedList에 저장하고 출력할 것
				//      (<<< Cities in the DB >>> 출력 부분)
		
		System.out.println("\n----------------------------------------");
		System.out.println("<<< Citiess in the DB >>>");
		System.out.println("----------------------------------------");
		
		Set<String> set = new HashSet<String>();
		for(int i = 0; i < con.length;i++) {
			set.add(con[i].getDep());
		}
		
		List<String> JJapdepList = new LinkedList<String>(set);
		List<String> depList = new LinkedList<String>();
		// 정렬하기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		for(int i = 0; i < con.length;i++) {
			for(int j = 0; j <  JJapdepList.size();j++) {
				if(con[i].getDep().equals(JJapdepList.get(j))) {
					boolean flag = true;
					for(int k=0;k < depList.size();k++) {
						if(JJapdepList.get(j).equals(depList.get(k))) flag = false;
					}
					if(flag == false) break;
					else depList.add(JJapdepList.get(j));
				}
			}
		}
		
		for(int i=0;i<depList.size();i++) {
			System.out.println(depList.get(i));
		}
		
		System.out.println("----------------------------------------\n");
		
		// (4) 경로를 물어 나가면서 도시들을 LinkedList에 저장해 나갈 것.
		//       즉, 최종 route가 LinkedList에 저장되어 나가야 한다.
		
		LinkedList<String> route = new LinkedList<String>();
		
		System.out.println("Let's plan a round-trip route!");
		
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter the starting city : ");
		String start = scin.nextLine();
		route.add(start);
		System.out.println("From "+start+" you can fly directly to :\n");
		
		List<String> arrList = new LinkedList<String>();
		
		for (int i=0; i < con.length; i++) {
			if(con[i].getDep().equals(start)) {
				arrList.add(con[i].getArr());
			}
		}
		for (int i=0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		
		String start1 = start;
		while(true) {
			
			System.out.println("\n----------------------------------------");
			System.out.print("Where do you want to go from "+ start1+"? ");

			Scanner scin1 = new Scanner(System.in);
			String temp = start1;
			start1 = scin1.nextLine();
			if (start.equals(start1)) {
				route.add(start1);
				break;
			}
			List<String> arrList1 = new LinkedList<String>();
			
			boolean flag = false;
			for (int i=0; i < con.length; i++) {
				if(con[i].getDep().equals(start1)) {
					arrList1.add(con[i].getArr());
					flag = true;
				}
			}
			if(flag == false) {
				System.out.println("***** You can't get to that city by a direct flight. *****");
				start1 = temp;
				continue;
			}

			route.add(start1);
			
			System.out.println("From "+start1+" you can fly directly to :\n");


			for (int i=0; i < arrList1.size(); i++) {
				System.out.println(arrList1.get(i));
			}
		}
		
		// (5) 최종 route를 출력할 것 (LinkedList 출력)
		System.out.println("\n========================================");
		System.out.println("<<< Your Final Route >>>");
		System.out.println();
		for(int i =0; i < route.size(); i++) {
			if(i == route.size()-1) System.out.println(route.get(i));
			else System.out.print(route.get(i) + "-> ");
		}
		System.out.println("----------------------------------------\n");
		System.out.println("Have a nice Trip with NORANG Balloon ~");
	}


}










