package buoi5;

import java.util.Scanner;

import buoi2.Datee;

public class hoaDon {
	private int sl;
	private String ms, tenCH;
	private chiTiet c[];
	private Datee ngaynhap;
	private khachHang A;
	public hoaDon() {
		sl = 0;
		ms = new String();
		tenCH = new String();
		c = new chiTiet[50];
		for (int i =0;i <sl; i++)
			c[i] = new chiTiet(c[i]);
		ngaynhap = new Datee();
		A = new khachHang();
	}
	public hoaDon(hoaDon h) {
		sl = 0;
		ms = new String(h.ms);
		tenCH = new String(h.tenCH);
		c = new chiTiet[50];
		for (int i =0;i <sl; i++)
			c[i] = new chiTiet(c[i]);
		ngaynhap = new Datee(h.ngaynhap);
		A = new khachHang(h.A);
	}
	public void nhapHD() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap thong tin khach hang: ");
		char d=' ';
		System.out.println("nhap loai khach hang [VIP(v) hay Thuong(t)]");
		d = sc.nextLine().charAt(0);
		if(d=='v')
			A = new khachHangVIP();
	}
}
