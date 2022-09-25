package bai5;

import java.util.Scanner;

import bai2.Date;

public class khachHang {
	private String hTen, ms, dChi;
	private Date nSinh;
	public khachHang() {
		hTen = new String();
		ms = new String();
		dChi = new String();
		nSinh = new Date(); 
	}
	public khachHang(khachHang k) {
		hTen = new String(k.hTen);
		ms = new String(k.ms);
		dChi = new String(k.dChi);
		nSinh = new Date(k.nSinh);
	}
	public void nhapKH() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap ho ten: ");
		hTen = sc.nextLine();
		System.out.println("nhap ma so: ");
		ms = sc.nextLine();
		System.out.println("nhap dia chi: ");
		dChi = sc.nextLine();
		System.out.println("nhap ngay sinh: ");
		nSinh.NhapNgay();
	}
	public void hienThiKH() {
		System.out.println("ho ten" +hTen+ ",ma so" +ms+ ",dia chi" +dChi+ ",ngay sinh" +nSinh);
	}
	public String layhTen() {
		return hTen;
	}
	public String layms() {
		return ms;
	}
	public String laydChi() {
		return dChi;
	}
	public Date laynSinh() {
		return nSinh;
	}
	public String toString() {
		return "ho ten" +hTen+ ",ma so" +ms+ ",dia chi" +dChi+ ",ngay sinh" +nSinh;
	}
}
