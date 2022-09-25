package class3;
import java.util.Scanner;

import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tk, mk, gmail;
	public SinhVienCNTT() {
		super();
		tk = new String();
		mk = new String();
		gmail = new String();
	}
	public SinhVienCNTT(SinhVienCNTT a) {
		super(a);
		tk = new String(a.tk);
		mk = new String(a.mk);
		gmail = new String(a.gmail);
	}
	public void nhap() {
		super.nhap();
		super.nhapDiem();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tai khoan: ");
		tk = sc.nextLine();
		System.out.println("Nhap mat khau:");
		mk = sc.nextLine();
		System.out.println("Nhap gmail:");
		gmail = sc.nextLine();
	}
	public void hienThi() {
		super.in();
		System.out.println(tk);
		System.out.println(gmail);
	}
	public String toString() {
		return super.toString()+"\n"+tk+"\n"+gmail;
	}
	public void doiMK(String mk1) {
		mk = new String(mk1);
	}
	public String layGmail() {
		return gmail;
	}
}
