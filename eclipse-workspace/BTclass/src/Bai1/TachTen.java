package Bai1;		// bai: 7

import java.util.Scanner;

public class TachTen {

	public static String tach(String a) {
		a=a.trim();
		String b = a.substring(a.lastIndexOf(' ') +1);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten:");
		String a = sc.nextLine();
		TachTen t = new TachTen();
		String b = t.tach(a);
		System.out.println("Ten: " +b);
	}
}

