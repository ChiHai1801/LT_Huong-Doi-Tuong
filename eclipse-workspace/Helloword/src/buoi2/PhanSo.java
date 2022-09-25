package buoi2;

import java.util.Scanner;

public class PhanSo {
	int tuSo, mauSo;
	public PhanSo() {
		tuSo = 0;
		mauSo = 1;
	}
	
	public PhanSo(int tu, int mau) {
		tuSo = tu;
		mauSo = mau;
	}
	public void nhapPhanSo() {
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Nhap phan so:");
			tuSo = sc.nextInt();
			mauSo = sc.nextInt();
		}while(mauSo == 0);
	}
	public void gan(PhanSo a) {
		tuSo = a.tuSo;
		mauSo = a.mauSo;
	}
	public void inPhanSo() {
		if(tuSo == 0 || mauSo ==1)
			System.out.println(tuSo);
		else 
			System.out.println(tuSo + "/" + mauSo);
	}
	public void nghichDao() {
		int temp = tuSo;
		tuSo =mauSo;
		mauSo = temp;
	}
	public PhanSo PhanSogiaTriNghichDao() {
		PhanSo ps = new PhanSo();
		ps.tuSo = mauSo;
		ps.mauSo = tuSo;
		return ps;
	}
	 public double giaTriThuc() {
		 return (tuSo / (1.00*mauSo));
	 }
	 public int ucln(int a, int b) {
		 if(b == 0)
			 return a;
		 else
			 return ucln(b,a%b);
	 }
	 public PhanSo rutGon() {
		 int ucln = ucln(tuSo, mauSo);
		 int ts = tuSo/ucln;
		 int ms = mauSo/ucln;
		 PhanSo kq = new PhanSo(ts,ms);
		 return kq;
	 }
	 public PhanSo cong(PhanSo a) {
			PhanSo ps = new PhanSo();
			ps.mauSo = a.mauSo * mauSo;
			ps.tuSo = a.mauSo * tuSo + mauSo * a.tuSo;
			ps.gan(ps.rutGon());
			return ps;
		}
	 public PhanSo tru(PhanSo a) {
			PhanSo ps = new PhanSo();
			ps.mauSo = a.mauSo * mauSo;
			ps.tuSo = a.mauSo * tuSo - mauSo * a.tuSo;
			ps.gan(ps.rutGon());
			return ps;
	 }
	 public boolean lonHon(PhanSo ps1) {
		 return (tru(ps1).tuSo>0);
	 }
	 public PhanSo nhan(PhanSo a) {
			PhanSo ps = new PhanSo();
			ps.mauSo = a.mauSo * mauSo;
			ps.tuSo = a.tuSo * tuSo;
			ps.gan(ps.rutGon());
			return ps;
		}
	 public PhanSo chia(PhanSo a) {
			PhanSo ps = new PhanSo();
			ps.mauSo = a.mauSo * mauSo;
			ps.tuSo = a.tuSo * tuSo;
			ps.gan(ps.rutGon());
			return ps;
		}
}
