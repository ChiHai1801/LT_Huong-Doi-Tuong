package buoi3;

import java.util.Scanner;

import buoi2.Datee;

public class SV {

	private String mssv,hoten;
	private Datee ngaySinh;
	private int Soluong;
	private String tenHP[],diem[];
	private Scanner sc;
	private Scanner sc2;
	private Scanner sc3;

	public SV() {
		mssv=new String();
		hoten=new String();
		ngaySinh=new Datee();
		Soluong=0;
		tenHP=new String[50];
		diem=new String[50];
	}

	public SV(SV s) {
		mssv=new String(s.mssv);
		hoten=new String(s.hoten);
		ngaySinh= new Datee(s.ngaySinh);
		Soluong=s.Soluong;
		tenHP=new String[50];
		diem=new String[50];
		for(int i=0;i<Soluong;i++) {
			tenHP[i]=new String(s.tenHP[i]);
			diem[i]=new String(s.diem[i]);
		}
	}

	public void nhap() {
		sc3 = new Scanner(System.in);
		System.out.println("Nhap MSSV: ");
		mssv=sc3.nextLine();
		System.out.println("Nhap ho ten: ");
		hoten=sc3.nextLine();
		System.out.println("Nhap ngay/ thang/ nam sinh: ");
		ngaySinh.NhapNgay();;
	}

	public void dangKyMH() {
		sc2 = new Scanner(System.in);
		System.out.println("In nhap so mon dang ky: ");
		Soluong=sc2.nextInt();
		for(int i=0;i<Soluong;i++) {
			System.out.println("Nhap mon hoc thu "+(i+1)+":");
			tenHP[i]=sc2.nextLine();
		}
	}

	public void nhapDiem() {
		sc = new Scanner(System.in);
		for(int i=0;i<Soluong;i++) {
			System.out.println("Nhap diem mon "+tenHP[i]+":");
			diem[i]=sc.nextLine();
		}
	}

	public String toString() {
		String s="\nMSSV: "+mssv+"\nHo ten: "+hoten+"\nNgay sinh: "+ngaySinh.toString();
		for(int i=0;i<Soluong;i++) {
			s=s+tenHP[i]+":"+diem[i];
		}
		return s;
	}

	public float dtb() {
		float d=0.0f;
		for(int i=0;i<Soluong;i++)	
			if(diem[i].equals("A"))

				d+=4;

			else {

				if(diem[i].equals("B+"))
					d+=3.5;

				if(diem[i].equals("B"))
					d+=3;

				if(diem[i].equals("C+"))
					d+=2.5;

				if(diem[i].equals("C"))
					d+=2;

				if(diem[i].equals("D+"))
					d+=1.5;

				if(diem[i].equals("D"))
					d+=1;

				if(diem[i].equals("F"))
					d+=0;
			}
		return d/Soluong;
	}

	public void dkMH(String ten,String d) {
		if(Soluong<diem.length-1) {
			tenHP[Soluong]=ten;
			diem[Soluong]=d;
			Soluong++;
		}
	}

	public void xoa(String ten) {
		int pos=-1;
		for(int i=0;i<Soluong;i++)
			if(tenHP[i].equals(ten)) {
				pos=i;
				break;
			}
		if((pos!=-1)) {
			for(int i=pos;i<Soluong-1;i++) {
				tenHP[i]=tenHP[i+1];
				diem[i]=diem[i+1];
			}
			Soluong--;
		}
	}

	public String layTen() {
		String h=hoten.trim();
		return h.substring(h.lastIndexOf("")+1);
	}
}
