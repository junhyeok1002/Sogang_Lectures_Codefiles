//20180634 최준혁 

package practice3;

class Point {
	private double x;
	private double y;
	
	// Point 클래스의 메소드들을 완성한다.
	Point() {}
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public String info() {
		return "("+this.x+","+this.y+")";
	}
	public double getx() {
		return this.x;
	}
	public double gety() {
		return this.y;
	}
}


public class P3_20180634_2 {
	// getDistance 메소드를 완성한다.
	
	public static double getDistance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.getx() - p2.getx(),2) 
				+ Math.pow(p1.gety() - p2.gety(),2));
	}
	
	public static void main(String[] args)
	{
		Point p1 = new Point(1.2, 3.5);
		Point p2 = new Point(2.5, 1.0);
		double dist = 0.0;
		dist = getDistance(p1, p2);
		System.out.println("p1 : " + p1.info());
		System.out.println("p2 : " + p2.info());
		System.out.println("distance : " + dist);
	}

}
