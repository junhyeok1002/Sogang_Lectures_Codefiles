//20180364 ������

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
	// main �޼ҵ带 ���� Circle Ŭ������ �����ڿ� �޼ҵ���� �ϼ��Ѵ�.
}


public class P3_20180634_1 {
	public static void main(String[] args) {
		Circle c1 = new Circle(2.5);
		// �������� 2.5�� �Ͽ� c1�� �ʱ�ȭ�Ѵ�. 
		Circle c2 = new Circle();
		System.out.println("c1 ������ : " + c1.getRadius());
		c2.setRadius(1.7); 
		// c2 �������� 1.7�� �����Ѵ�. 
		System.out.println("c2 ������ : " + c2.getRadius());
		double c1Area = c1.getArea(); 
		// c1�� ������ ��ȯ�Ѵ�. 
		double c1Perimeter = c1.getPerimeter(); 
		// c1�� �ѷ��� ��ȯ�Ѵ�. 
		System.out.println("c1 ���� : " + c1Area + ", c1 �ѷ� : " + c1Perimeter);
		
		c2.incRadius(2.0); 
		// c2�� �������� 2��ŭ ������Ų��. ��, 3.7�� �ȴ�. 
		System.out.println("c2 ������ : " + c2.getRadius());
		System.out.println("c2 ���� : " + c2.getArea() + ", c2 �ѷ� : " + c2.getPerimeter());

	}
}
