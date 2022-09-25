package bai1; // câu: 4

import java.util.Scanner;

public class Tong2Num {
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		String s; int n;
		do {
			System.out.println("\n Nhập 1 số nguyên: ");
			s = sc.nextLine();
			try { n = Integer.parseInt(s); }
			catch(NumberFormatException e) {
				n = Integer.MAX_VALUE;
				System.out.println("\n ban da nhap sai dinh dang, nhap lai ");
			}
		}while(n==Integer.MAX_VALUE);
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tong2Num t = new Tong2Num();
		int a = t.nhap();
		int b = t.nhap();
		System.out.println("Tong = " + (a+b));
	}

}
