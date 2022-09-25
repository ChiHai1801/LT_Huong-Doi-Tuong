package elseHDT;		// else

import java.util.Scanner;

public class TTachTen {

	public static String layten(String hoten) {
		hoten=hoten.trim();
		String b = hoten.substring(hoten.lastIndexOf(' ') +1);
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten:");
		String a = sc.nextLine();
		TTachTen t = new TTachTen();
		String b = t.layten(a);
		System.out.println("Ten: " +b);
	}
}

