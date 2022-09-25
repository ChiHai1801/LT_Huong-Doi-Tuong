package class3;

import java.util.Scanner;

import buoi2.Date;

public class khachHang {
	private String hTen, cccd, dChi;
	//private Date nSinh;
	public khachHang() {
		hTen = new String();
		cccd = new String();
		dChi = new String();
		//nSinh = new Date(); 
	}
	
	public khachHang(String c, String h, String d) {
		hTen = new String(c);
		cccd = new String(h);
		dChi = new String(d);
		//nSinh = new Date(k.nSinh);
	}
	
	public khachHang(khachHang k) {
		hTen = new String(k.hTen);
		cccd = new String(k.cccd);
		dChi = new String(k.dChi);
		//nSinh = new Date(k.nSinh);
	}
	public void nhapKH() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap ho ten: ");
		hTen = sc.nextLine();
		System.out.println("nhap  Can cuoc cong dan: ");
		cccd = sc.nextLine();
		System.out.println("nhap dia chi: ");
		dChi = sc.nextLine();
		//System.out.println("nhap ngay sinh: ");
		//nSinh.NhapNgay();
	}
	public void hienThiKH() {
		System.out.println("ho ten" +hTen+ ",ma so" +cccd+ ",dia chi" +dChi/*+ ",ngay sinh" +nSinh*/);
	}
	
	/*public String toString() {
		return("ho ten" +hTen+ ",ma so" +cccd+ ",dia chi" +dChi+ ",ngay sinh" +nSinh);
	}*/
	
	public String layhTen() {
		return hTen;
	}
	public String layms() {
		return cccd;
	}
	public String laydChi() {
		return dChi;
	}
	
	public float laytilegiam() {
		return 0;
	}
	
	public String toString() {
		return "ho ten" +hTen+ ",ma so" +cccd+ ",dia chi" +dChi/*+ ",ngay sinh" +nSinh*/;
	}
}
