package buoi2;

import java.util.Scanner;
public class Diem {

	private int x;
	private int y;

	public Diem(){
		x = 0;
		y = 0;
	}

	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public void tinhTien(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public Diem(Diem d) {
		x = d.x;
		y = d.y;
	}

	public void nhap() {
		Scanner sc = new   Scanner(System.in); 
		System.out.println(" Nhap vao hoanh do X: ");
		x = sc.nextInt();
		System.out.println(" Nhap vao hoanh do Y: ");
		y = sc.nextInt();
	}

	public void in() {
		System.out.println("("+ x +", "+ y +")");
	}
	
	public String toString() {
		return ("("+ x +", "+ y +")");
	}

	public int layX() {
		return x;
	}

	public int layY() {
		return y;
	}

	public void ganX(int x1) {
		x = x1;
	}

	public void ganY(int y1) {
		x = y1;
	}

	public void gan(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public float khoangCach () {
		float kq = (float) Math.sqrt(x * x + Math.pow(y,2));
		return kq;
	}

	public float khoangCach(Diem B) {
		return (float) Math.sqrt(Math.pow(x - B.x,2) + Math.pow(y-B.y,2));
	}
}
