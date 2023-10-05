package practice4_1;

abstract class Instrument {
	private int volume;
	
	// 생성자와 메소드 추가
	Instrument(){}
	
	abstract void print(); 
	abstract void volumeUp(); 
	abstract void volumeDown();
	
	void setVol(int a) {this.volume = a;}
	int getVol() {return volume;}
}

class Piano extends Instrument { 
	
	// 생성자와 메소드 추가
	Piano () {}
	Piano(int v){setVol(v);}
	
	void print() {
		System.out.print("Piano volume : ");
		System.out.println(getVol());
	}
	void volumeUp() {
		setVol((getVol() + 1));
	}
	void volumeDown() {
		setVol((getVol() - 1));
	}
}

class Flute extends Instrument { 
	// 생성자와 메소드 추가
	
	Flute () {}
	Flute(int v){setVol(v);}
	
	void print() {
		System.out.print("Flute volume : ");
		System.out.println(getVol());
	}
	void volumeUp() {
		setVol((getVol() + 2));
	}
	void volumeDown() {
		setVol((getVol() - 2));
	}	
}

public class P4_20180634_1 {
	public static void main(String[] args) { 
		Piano p1 = new Piano(10); 
		Piano p2 = new Piano(20); 
		Flute f = new Flute(100); 
		p1.volumeUp(); 
		p2.volumeUp(); 
		f.volumeUp(); 
		p1.volumeUp();
		f.volumeUp(); 
		f.volumeUp(); 
		p2.volumeDown(); 
		p1.print();
		p2.print(); 
		f.print(); 
	}
}
