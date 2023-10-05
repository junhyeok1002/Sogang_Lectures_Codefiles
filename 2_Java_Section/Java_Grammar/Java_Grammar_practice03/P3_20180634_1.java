//20180364 최준혁

package practice3;

class Circle {
	private double radius;
	private final static double PI = 3.141592;
	
	Circle(){}
	Circle(double r){
		this.radius = r;
	}
	public double getRadius(){
		return this.radius;
	}
	public void setRadius(double r){
		this.radius = r;
	}
	public double getArea(){
		return this.radius * this.radius * PI;
	}
	public double getPerimeter(){
		return this.radius * 2 * PI;
	}
	public void incRadius(double n){
		this.radius += n;
	}
	// main 메소드를 보고 Circle 클래스의 생성자와 메소드들을 완성한다.
}


public class P3_20180634_1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.5);
		// 반지름을 2.5로 하여 c1을 초기화한다. 
		Circle c2 = new Circle();
		System.out.println("c1 반지름 : " + c1.getRadius());
		c2.setRadius(1.7); 
		// c2 반지름을 1.7로 저장한다. 
		System.out.println("c2 반지름 : " + c2.getRadius());
		double c1Area = c1.getArea(); 
		// c1의 면적을 반환한다. 
		double c1Perimeter = c1.getPerimeter(); 
		// c1의 둘레를 반환한다. 
		System.out.println("c1 면적 : " + c1Area + ", c1 둘레 : " + c1Perimeter);
		
		c2.incRadius(2.0); 
		// c2의 반지름을 2만큼 증가시킨다. 즉, 3.7이 된다. 
		System.out.println("c2 반지름 : " + c2.getRadius());
		System.out.println("c2 면적 : " + c2.getArea() + ", c2 둘레 : " + c2.getPerimeter());

	}
}
