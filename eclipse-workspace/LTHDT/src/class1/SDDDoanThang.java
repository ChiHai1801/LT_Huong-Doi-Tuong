package class1;		// th.Cang
import java.util.Scanner;

import buoi2.Diem;

public class SDDDoanThang {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(2,5);
		System.out.println(" Toa do doan thang A:");
		A.in();
		Diem B = new Diem(20,35);
		System.out.println(" Toa do doan thang B:");
		B.in();
		DDoanThang AB = new DDoanThang(A, B);
		AB.tinhTien(5, 3);

		DDoanThang CD = new DDoanThang();
		System.out.println("\n Nhap toa do doan thang CD:");
		CD.nhap();
		System.out.println("\n Toa do doan thang CD:");
		CD.in();

		System.out.format("\n Do dai CD = %.2f ", +CD.khoangCach());

		// trung diem doan thang CD
		Diem I = CD.trungDiem();
		System.out.println("\n Trung diem CD:");
		I.in();

//		System.out.println("\n Trung diem CD:");
//		CD.trungDiem().in();

//		// nhap danh sach dthang
//		Scanner sc = new Scanner(System.in);
//		System.out.println("\n Nhap so doan thang: ");
//		int n = sc.nextInt();
//		
//		DDoanThang ds[] = new DDoanThang[n];	// cap nhat so phan tu tham chieu
//		// cap nhat bo nho cho tham chieu
//		for(int i = 0; i < ds.length; i++ )
//			ds[i]= new DDoanThang();		// cap phat bo nho cho tung doi tuong
//		
//		System.out.println("\n Nhap toa do cho danh sch doan thang: ");
//		
//		for(int i = 0; i < ds.length; i++ ) {
//			System.out.println("\n Nhap doan thang thu " +(i+1)+":");
//			ds[i].nhap();
//		}
//		
//		for(int i = 0; i < ds.length; i++ ) {
//			System.out.println("\n Doan thang: ");
//			ds[i].in();
//	}
//		
//		int i = 0;
//		for(DDoanThang dt:ds ) {
//			i++;
//			System.out.println("\n Doan thang: "+ i +":");
//			ds[i].in();
//		}
	}
}

