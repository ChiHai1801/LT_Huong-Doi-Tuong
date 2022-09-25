package buoi3;

import java.util.Scanner;
import buoi2.Diem;

public class SDDoanThang {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(2,5);
		System.out.println(" Toa do doan thang A:");
		A.in();
		Diem B = new Diem(20,35);
		System.out.println(" Toa do doan thang B:");
		B.in();
		DoanThang AB = new DoanThang(A, B);
		AB.tinhTien(5, 3);

		DoanThang CD = new DoanThang();
		System.out.println("\n Nhap toa do doan thang CD:");
		CD.nhap();
		System.out.println("\n Toa do doan thang CD:");
		CD.in();

		System.out.format("\n Do dai CD = %.2f ", +CD.khoangCach());

		Diem I = CD.trungDiem();
		System.out.println("\n Trung diem CD:");
		I.in();

	}

}