package class3;

import java.util.Scanner;

import buoi2.Date;

public class khachHangVIP extends khachHang {
	private float tl;
	private Date ngaygiam;
	public khachHangVIP() {
		super();
		tl = 0.0f;
		ngaygiam= new Date();
	}
	public khachHangVIP(khachHangVIP k) {
		super(k);
		tl = k.tl;
		ngaygiam= new Date(k.ngaygiam);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap TTin khach hang:");
		super.nhapKH();
		System.out.println("\n Nhap ti le mien giam:");
		tl = sc.nextFloat();
		System.out.println("Nhap ngay tro thanh khach hang VIP:");
		ngaygiam.NhapNgay();
	}
	
	public void in() {
		System.out.println("ti le giam:" + tl + "ngay:" + ngaygiam);
	}
	
	public String toString() {
		return("ti le giam:" + tl + "ngay:" + ngaygiam);
	}
	
	public float laytilegiam() {
		return tl;
	}
	
}
