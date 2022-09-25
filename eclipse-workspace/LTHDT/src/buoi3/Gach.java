package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class Gach {
	private String maSo;
	private String mau;
	private int SL, chieuDai, chieuNgang;
	private long giaBan;
	
	public Gach() {
		maSo = new String();
		mau = new String();
		SL = 0;
		chieuDai = 0;
		chieuNgang = 0;
		giaBan = 0;
	}
	
	public Gach(String ms, String m, int sl, int cd, int cn, long gb) {
		maSo = new String (ms);
		mau = new String (m);
		SL = sl;
		chieuDai= cd;
		chieuNgang= cn;
		giaBan= gb;

	}
	
	public Gach(Gach s ) {
		maSo = new String(s. maSo);
		mau = new String(s.mau);
		chieuDai = s.chieuDai;
		chieuNgang = s.chieuNgang;
		giaBan = s.giaBan; 
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap vao ma so: ");
		maSo = sc.nextLine();
		System.out.println(" Nhap vao mau: ");
		mau = sc.nextLine();
		System.out.println(" Nhap vao so luong: ");
		SL  = sc.nextInt();
		System.out.println(" Nhap vao chieu dai: ");
		chieuDai = sc.nextInt();
		System.out.println(" Nhap vao chieu ngang: ");
		chieuNgang = sc.nextInt();
		System.out.println(" Nhap vao gia ban: ");
		giaBan = sc.nextLong(); 
	}
	
	public void in() {
		System.out.println("+ Ma so: " + maSo);
		System.out.println("+ Mau: " + mau);
		System.out.println("+ So luong: " + SL);
		System.out.println("+ Chieu dai: " + chieuDai);
		System.out.println("+ Chieu ngang: " + chieuNgang);
		System.out.println("+ Gia ban: " + giaBan);
	}
	
	public float giaBanLe() {
		return (float) (giaBan/SL*1.2);
	}
	
	public int dienTichNenToiDa() {
		return SL * (chieuDai * chieuNgang);
	}
	
	public long getGiaBan() {
		return giaBan;
	}
	
	public int soLuongHop(int D, int N) {
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
