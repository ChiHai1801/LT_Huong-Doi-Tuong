package buoi5;

import java.util.Scanner;

import buoi2.Date;
import class3.khachHang;
import class3.khachHangVIP;

public class hoaDon {
	private int sl;
	private String mso, tde, nvien;
	private chiTiet c[];
	private Date ngaynhap;
	private khachHang A;
	
	public hoaDon() {
		sl = 0;
		mso = new String();
		tde = new String();
		nvien = new String();
		c = new chiTiet[50];
	}
	
	public hoaDon(hoaDon h) {
		sl = h.sl;
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		c = new chiTiet[50];
		for (int i =0;i <sl; i++)
			c[i] = new chiTiet(c[i]);
		ngaynhap = new Date(h.ngaynhap);
		A = new khachHang(h.A);
	}
	
	public void nhapHD() {
		Scanner sc = new Scanner (System.in);
		System.out.println("\n Nhap ma so hoa don: ");
		mso = sc.nextLine();
		System.out.println("\n Nhap tieu de hoa don: ");
		tde = sc.nextLine();
		System.out.println("\n Nhap nhan vien nhap hoa don: ");
		nvien = sc.nextLine();
		System.out.println("\n Nhap ngay lap hoa don: ");
		ngaynhap.NhapNgay();
		System.out.println("\n Nhap thong tin khach hang [Thuong(0) hay VIP(1)]");
		int kh = sc.nextInt();
		if(kh == 0)
			A = new khachHang();
		else    A = new khachHangVIP();
		A.nhapKH();
		System.out.println("\n Nhap so hoa don tren hoa don: ");
		sl = sc.nextInt();
		for(int i = 0; i < sl; i++) {
			System.out.println("\n Nhap chi tiet thu " + (i+1) +":");
			c[i] = new chiTiet();
			c[i].nhap();
		}
	}
	
	public void in() {
		System.out.println("\n Nhap ma so hoa don: " + mso);
		System.out.println("\n Nhap tieu de hoa don: " + tde);
		System.out.println("\n Nhap nhan vien nhap hoa don: " + nvien);
		System.out.println("\n Nhap ngay lap hoa don: " + ngaynhap);
		System.out.println("\n Nhap ma so hoa don: ");
		
		System.out.println("\n Thong tin khach hang: ");
		A.hienThiKH();
		System.out.println("\n Nhap so hang hoa tren hoa don: ");
		for(int i = 0; i < sl; i++) {
			System.out.println("\n Nhap chi tiet thu " + (i+1) +":");
			c[i].nhap();
		}
		System.out.println("\n Tong so tien hoa don: " + tong());
	}
	
	public float tong() {
		float t = 0.0f;
		for(int i = 0; i < sl; i++) {
			t = t + c[i].laysl() * c[i].layDgia();
		}
		return t - t*A.laytilegiam();
	}
}
