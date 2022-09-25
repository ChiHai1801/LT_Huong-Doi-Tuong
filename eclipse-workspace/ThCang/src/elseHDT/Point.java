package elseHDT; // No Run

import java.util.Scanner;

public class Point {

	private int x;
	private int y;
	public Point() {
		x = 0;
		y = 1;
	}

	public Point(int x1, int y1) {
		x = x1;
		y = y1;

	}

	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("x: ");
		x = sc.nextInt();
		System.out.println("y: ");
		y = sc.nextInt();

	}

	public void print() {
		System.out.println("("+ x +", "+ y +")\n");
	}

	public void move(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public  double distance() {
		return (double) Math.sqrt(x * x + y * y);
	}

	public double distance(Point P) {
		return (double) Math.sqrt((x - P.x)*(x - P.x)+(y - P.y) * (y - P.y));
	}

public static class PointTest{
	public static void main(String[] args){
		Point A = new Point(3, 4);
		A.print();
		Point B = new Point();
		B.read();
		B.print();
		Point C = new Point();
		C.print();
		System.out.println(B.distance());
		System.out.println(A.distance(B));
	}
  }
}