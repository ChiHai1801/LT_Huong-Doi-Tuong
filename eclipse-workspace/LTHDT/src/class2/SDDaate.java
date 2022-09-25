package class2;

import java.util.Scanner;

import buoi2.Date;

public class SDDaate {
	
	public static void main(String[] args) {
//		Daate d = new Daate();
//		d.NhapNgay();
//		d.hienThi();
//		d.ngayHomSau().hienThi();
//		// d.congNgay(10).hienThi();
		
		Date e= new Date();
		e = new Date();
		System.out.println(" Nhap ngay d2:");
		e.NhapNgay();
		//d2.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so ngay cong:");
		int n = sc.nextInt();
		System.out.println(" Ket qua sau khi cong ");
		e = e.congNgay(n);
		e.in();
	}
}
