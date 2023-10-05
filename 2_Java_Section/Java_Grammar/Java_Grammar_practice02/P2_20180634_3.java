//20180634 ������
package practice2;

class Rectangle {
	int width;
	int height; 
	
	Rectangle() {}

    Rectangle(int w, int h) {
         width = w;
         height = h;
    }
    void setWidthHeight(int w,int h) {
    	width = w;
    	height = h;
    }
    void printInfo() {
    	System.out.println("width : "+width+", height : "+height);
    }
    void incWidth(int n) {
    	width += n;
    }
    void incHeight(int n) {
    	height += n;
    }
	int getArea() {
		return width * height;
	}
	int getPerimeter() {
		return (width + height)*2;
	}	
}

public class P2_20180634_3 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		Rectangle r2 = new Rectangle();
		r2.setWidthHeight(7,9); // �ν��Ͻ� r2�� �ʵ� width�� 7��, height�� 9�� �����Ѵ�.
		r1.printInfo(); // �ν��Ͻ� r1�� width, height�� ����Ѵ�.
		System.out.println("r1�� ���� : " + r1.getArea() + ", r1�� �ѷ� : " + r1.getPerimeter());
		r2.incWidth(3); // r2�� width�� 3 ������Ų��. ��, 10���� �����.
		r2.incHeight(10); // r2�� height�� 10��ŭ ������Ų��. ��, 19�� �����.
		r2.printInfo(); // �ν��Ͻ� r2�� width, height�� ����Ѵ�.
		System.out.println("r2�� ���� : " + r2.getArea() + ", r2�� �ѷ� : " + r2.getPerimeter());
		}
}
