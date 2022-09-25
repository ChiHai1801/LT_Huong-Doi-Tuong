package buoi3;

import java.util.Scanner;

import buoi2.Date;

public class SinhVien {

	private String mssv,hoten;
	private Date ngaySinh;
	private int Soluong;
	private String tenHP[],diemHP[];

	public SinhVien() {
		mssv = new String();
		hoten = new String();
		ngaySinh = new Date();
		Soluong = 0;
		tenHP = new String[100];
		diemHP = new String[100];
	}

	public SinhVien(String ms, String name, Date nam, int sl) {
		mssv = new String (ms);
		hoten = new String (name);
		ngaySinh = new Date(nam);
		Soluong = sl;
		tenHP = new String[100];
		diemHP = new String[100];

	}

	public SinhVien(SinhVien s) {
		mssv=new String(s.mssv);
		hoten=new String(s.hoten);
		ngaySinh= new Date(s.ngaySinh);
		Soluong=s.Soluong;
		tenHP=new String[50];
		diemHP=new String[50];
		for(int i=0;i<Soluong;i++) {
			tenHP[i]=new String(s.tenHP[i]);
			diemHP[i]=new String(s.diemHP[i]);
		}
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap MSSV: ");
		mssv=sc.nextLine();
		System.out.println(" Nhap ho ten: ");
		hoten=sc.nextLine();
		System.out.println(" Nhap ngay/ thang/ nam sinh: ");
		ngaySinh.NhapNgay();
	}

	public void nhapDiem() {
		Scanner b = new Scanner(System.in);
		for(int i = 0; i < Soluong; i++) {
			System.out.println(" Nhap diem mon " + tenHP[i] + ":");
			tenHP[i] = b.nextLine();
		}
	}

	public void in() {
		System.out.println("\n MSSV: " + mssv + "\n Ho ten: " + hoten + "\n Ngay sinh: " + ngaySinh.toString());
		for(int i = 0; i < Soluong; i++) {
			System.out.println( tenHP[i]  + ":" + diemHP[i]);
		}
	}

	public String toString() {
		String c="\n MSSV: " + mssv + "\n Ho ten: " + hoten + "\n Ngay sinh: " + ngaySinh.toString();
		for(int i = 0; i < Soluong; i++) {
			c = c + tenHP[i]  + ":" + diemHP[i];
		}
		return c;
	}

	public float diemTB() {
		float d = 0.0f;
		for(int i  =0; i < Soluong; i++)	
			if(diemHP[i].equals("A"))
				d += 4.0f;

			else if(diemHP[i].equals("B+"))
				d += 3.5f;

			else if(diemHP[i].equals("B"))
				d += 3.0f;

			else if(diemHP[i].equals("C+"))
				d += 2.5f;

			else if(diemHP[i].equals("C"))
				d += 2.0f;

			else if(diemHP[i].equals("D+"))
				d += 1.5f;

			else if(diemHP[i].equals("D"))
				d += 1.0f;

			else if(diemHP[i].equals("F"))
				d += 0.0f;

		return d/Soluong;
	}

	public void dangKyMH() {
		Scanner a = new Scanner(System.in);
		System.out.println("\n Nhap so mon dang ky: ");
		Soluong=a.nextInt();
		for(int i = 0;i < Soluong; i++) {
			System.out.println(" Nhap mon hoc thu: " + (i+1) + ":");
			tenHP[i] = a.nextLine();
			a.next();
		}
	}

	public void themHP(String ten,String d) {
		if(Soluong < diemHP.length-1) {
			tenHP[Soluong]=ten;
			diemHP[Soluong]=d;
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
				diemHP[i]=diemHP[i+1];
			}
			Soluong--;
		}
	}

	public String layTen() {
		String h=hoten.trim();
		return h.substring(h.lastIndexOf("")+1);
	}
	public String layEmail() {
		return "";
	}
	
	public String laytaiKhoan() {
		return "";
	}
}
