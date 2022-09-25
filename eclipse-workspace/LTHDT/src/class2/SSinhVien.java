package class2;

import java.util.Scanner;

import buoi2.Date;

public class SSinhVien {

	private String MSSV,Ten;
	private Date ns;
	private int SL;
	private String tenHP[],DiemHP[];

	public SSinhVien() {
		MSSV = new String();
		Ten = new String();
		ns = new Date();
		SL = 0;
		tenHP = new String[100];
		DiemHP = new String[100];
	}

	public SSinhVien(String ms, String name, Date nam, int sl) {
		MSSV = new String (ms);
		Ten = new String (name);
		ns = new Date(nam);
		SL = sl;
		tenHP = new String[100];
		DiemHP = new String[100];
	}

	public SSinhVien(SSinhVien s) {
		MSSV = new String(s.MSSV);
		Ten = new String(s.Ten);
		ns = new Date(s.ns);
		SL = s.SL;
		tenHP = new String[100];
		DiemHP = new String[100];
		for(int i = 0;i<SL;i++) {
			tenHP[i] = new String(s.tenHP[i]);
			DiemHP[i] = new String(s.DiemHP[i]);
		}
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap MSSV: ");
		MSSV = sc.nextLine();
		System.out.println(" Nhap ho ten: ");
		Ten = sc.nextLine();
		System.out.println(" Nhap ngay/ thang/ nam sinh: ");
		ns.NhapNgay();
	}
	
	public void dangKyMH() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhap so mon dang ky: ");
		SL = sc.nextInt();
		for( int i = 0; i < SL; i++) {
			System.out.println(" Nhap mon thu " + (i+1) + ":");
			tenHP[i]= sc.nextLine();
		}
	}
	
	public void nhapDiem() {
		Scanner s = new Scanner(System.in);
		for( int i = 0; i < SL; i++) {
			System.out.println(" Nhap diem mon hoc " + tenHP[i] + ":");
			tenHP[i] = s.nextLine();
		}
	}
	
	public String toString() {
		String s = MSSV + "," + Ten + "," + ns;
		for (int i = 0; i < SL; i++) {
		s =	s + tenHP[i] + ":" + DiemHP[i] + ","; 		
	}
		return "[" + s + "]";
}

	public float diemTB() {
		float d = 0.0f;
		for(int i = 0; i < SL;i++)
			if(DiemHP[i].equals("A"))
				d += 4;
			else if(DiemHP[i].equals("B+"))
				d += 3.5;
		return d/SL;
	}
	
	public void themHP(String ten, String d) {
		if(SL < tenHP.length-1) {
			tenHP[SL] = new String(ten);
			DiemHP[SL] = new String(d);
			SL++;
		}
	}

	public void xoaHP(String ten) {
		int pos=-1;
		for(int i=0;i<SL;i++)
			if(tenHP[i].equals(ten)) {
				pos=i;
				break;
			}
		if((pos!=-1)) {
			for(int i=pos;i<SL-1;i++) {
				tenHP[i]=tenHP[i+1];
				DiemHP[i]=DiemHP[i+1];
			}
			SL--;
		}
	}

	public String layTen() {
		String h=Ten.trim();
		return h.substring(h.lastIndexOf("")+1);
	}
	
}
