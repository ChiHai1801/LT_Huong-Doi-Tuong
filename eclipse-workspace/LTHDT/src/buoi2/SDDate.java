package buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		Date A = new Date(12,4,2020);
		A.in();
		
		Date B = new Date();
		B = new Date();
		System.out.println(" Nhap ngay / thang / nam:");
		B.NhapNgay();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap so ngay cong:");
		int n = sc.nextInt();
		
		System.out.println("\n Ket qua sau khi cong ");
		B = B.congNgay(n);
		B.in();
	}

}
