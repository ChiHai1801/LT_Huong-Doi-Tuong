package buoi3;

import java.util.Scanner;

import buoi2.Datee;

public class Gach {
	private String maSo;
	private String mau;
	private int SL, chieuDai, chieuNgang;
	private long giaBan;
	private Datee ngaysx;
	public Gach() {
		maSo = new String();
		mau = new String();
		SL = 0;
		chieuDai = 0;
		chieuNgang = 0;
		giaBan = 0;
		ngaysx = new Datee();
	}
	public long getGiaBan() {
		return giaBan;
	}
	public Gach(Gach s ) {
		maSo = new String(s. maSo);
		mau = new String(s.mau);
		chieuDai = s.chieuDai;
		chieuNgang = s.chieuNgang;
		giaBan = s.giaBan; 
		ngaysx = new Datee();
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so: ");
		maSo = sc.nextLine();
		System.out.println("Nhap vao mau: ");
		mau = sc.nextLine();
		System.out.println("Nhap vao so luong: ");
		SL  = sc.nextInt();
		System.out.println("nhap vao chieu dai: ");
		chieuDai = sc.nextInt();
		System.out.println("Nhap vao chieu ngang: ");
		chieuNgang = sc.nextInt();
		System.out.println("Nhap vao gia ban: ");
		giaBan = sc.nextLong(); 
		System.out.println("nhap ngay san xuat: ");
		ngaysx.NhapNgay();
	}
	public void hienThi() {
		System.out.println("+ Ma so: " + maSo);
		System.out.println("+ Mau: " + mau);
		System.out.println("+ So luong: " + SL);
		System.out.println("+ Chieu dai: " + chieuDai);
		System.out.println("+ Chieu ngang: " + chieuNgang);
		System.out.println("+ Gia ban: " + giaBan);
		System.out.println("+ ngay san xuat: " + ngaysx);
	}
	public long giaBanLe() {
		return (long) (giaBan/SL*1.2);
	}
	public int dienTichNenToiDa() {
		return SL * (chieuDai * chieuNgang);
	}
	public int soLuongHop(int D, int N) {
		// double svd = Math.ceil((double) D / chieuDai);
		// double svn = Math.ceil((double) N / chieuNgang);
		// return (int) Math.ceil ((svd * svn) / soLuong);
		int soVN = N/chieuNgang;
		if(N%chieuNgang !=0)
			soVN ++;
		int soVD = D/chieuDai;
		if(D%chieuDai !=0)
			soVD ++;
		int SoVien = soVN * soVD;
		int sohop = SoVien*SL;
		if(SoVien% SL !=0)
			sohop ++;
		return sohop; 
	}

}
