package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;
public class SinhvienCNTT extends SinhVien { 

	private String tKhoan, mKhau,email;

	public SinhvienCNTT() {
		super();
		tKhoan = new String();
		mKhau = new String();
		email = new String();
	}

	public SinhvienCNTT(String tk, String mk, String e) {
		super();
		tk = new String();
		mk = new String();
		e = new String();
	}

	public SinhvienCNTT(SinhvienCNTT s) {
		super(s);
		tKhoan = new String(s.tKhoan);
		mKhau = new String(s.mKhau);
		email = new String(s.email);
	}

	public void nhapSV() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tai khoan ELCIT: ");
		tKhoan=sc.nextLine();
		System.out.println("Nhap mat khau ELCIT: ");
		mKhau=sc.nextLine();
		System.out.println("Nhap email ELCIT: ");
		email =sc.nextLine();
		//			super.dangKyMH();
		//			super.nhap();
	}

	public void in() {
		super.in();
		System.out.println("\n tai khoan la: " + tKhoan + "\n email la:" + email);
	}

	public String toString() {
		return super.toString() + "\n tai khoan la: " + tKhoan +"\n email la:" + email;
	}

	public void doimatKhau( String newpass ) {
		mKhau = new String(newpass);
	}

	public String layemail() {
		return email;
	}

	public void getemail() {
		this.email = email;
	}

	public String laytaiKhoan() {
		return tKhoan;
	}
}

