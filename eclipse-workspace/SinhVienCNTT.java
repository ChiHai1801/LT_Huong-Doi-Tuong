package buoi4;

import java.util.Scanner;

import buoi2.Date;
import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String tk, mk, email;
	
	public SinhVienCNTT () {
		super();
		tk = new String();
		mk = new String();
		email = new String();
	}
	
	public SinhVienCNTT (String mssv1, String name1, Date nSinh1, String tk1, String mk1, String email1) {
		super(mssv1, name1, nSinh1);
		tk = new String(mk1);
		mk = new String(tk1);
		email = new String(email1);
	}
	
	public SinhVienCNTT(SinhVienCNTT obj) {
		super( obj);
		tk = new String(obj.tk);
		mk = new String(obj.mk);
		email = new String(obj.email);
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tai khoan:");
		tk = sc.nextLine();
		
		System.out.println("Nhap mat khau:");
		mk = sc.nextLine();
		
		System.out.println("Nhap email:");
		email = sc.nextLine();
	}
	
	
	public void in() {
		
	}
	
	public String toString() {
		return super.toString()+", tai khoan: "+tk+", mat khau: "+mk+", email: "+email;
	}
	
	public void ganMK(String newpass) {
		mk = new String(newpass);
	}
	
	public String layEmail() {
		return email;
	}
	
	public String layTk() {
		return tk;
	}
	
	public String layMk() {
		return mk;
	}
				
	
	
	
	

}
