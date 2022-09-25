package bai1;

import java.util.Scanner;

public class TDiem {
	private int n;
	private int m;
	public TDiem() {
		n = m = 0;
	}

	public TDiem (int n1, int m1) {
		n = n1;
		m = m1;
	}

	public void TTien(int dn, int dm) {
		n = dn;
		m = dm;
	}

	public TDiem(TDiem h) {
		n = h.n;
		m = h.m;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap tung do:");
		n = sc.nextInt();
		System.out.println("nhap hoanh do:");
		m = sc.nextInt();
		sc.close();
	}

	public void in() {
		System.out.println("(" + n + "," + m + ")");
	}

	public int laygiatrin() {
		return n;
	}

	public int laygiatrim() {
		return m;
	}

	public float khoangCach() {
		return (float) Math.sqrt( n * n + m * m);
	}

	public float khoangCach (TDiem D) {
		return (float) Math.sqrt((n - D.n)*(n - D.n)+(m - D.m) * (m - D.m));
	}
	public void gann(int n1) {
		n = n1;
	}

	public void ganm(int m1) {
		m = m1;
	}

	public void gan(int n1, int m1) {
		n = n1;
		m = m1;
	}
}
