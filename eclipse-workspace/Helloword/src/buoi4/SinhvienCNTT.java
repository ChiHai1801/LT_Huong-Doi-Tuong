package buoi4;

import java.util.Scanner;
import buoi3.Sinhvien;

public class SinhvienCNTT extends Sinhvien { 

		private String taiKhoan, matKhau,email;

		public SinhvienCNTT() {
			super();
			taiKhoan = new String();
			matKhau = new String();
			email = new String();
		}
		public SinhvienCNTT(SinhvienCNTT s) {
			super(s);
			this.taiKhoan = s.taiKhoan;
			this.matKhau = s.matKhau;
			this.email = s.email;
		}
		public void nhapSV() {
			Scanner sc = new Scanner(System.in);
			super.nhap();
			System.out.println("Nhap tai khoan elcit: ");
			taiKhoan=sc.nextLine();
			System.out.println("Nhap mat khau elcit: ");
			matKhau=sc.nextLine();
			System.out.println("Nhap email: ");
			email =sc.nextLine();
			super.dKy();
			super.nhap();
		}
		public String toString() {
			return super.toString() + "\n tai khoan la: " + taiKhoan +"\n mat khau la:" + matKhau +"\n email la:" + email;
		}
		public String layemail() {
			return email;
		}
		public void getemail() {
			this.email = email;
		}
		public String laytaiKhoan() {
			return taiKhoan;
		}
		public void doimatKhau( String newpass ) {
			matKhau = new String(newpass);
		}
	}

