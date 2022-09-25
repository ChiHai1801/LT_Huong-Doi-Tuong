package bai1;		// bai cua thay Cang

import java.util.Scanner;

public class Datee {
	// thuộc tính <pvi>  <kieu>   <tentt>
	private int d, m, y;

	// cac phuong thuc
	// phuong thuc xay dung KO CÓ KIEU TRA VE va trung ten voi LOP
	public Datee() {
		d = 1;
		m = 1;
		y = 2020;
	}

	public Datee (int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}

	// copy constructor
//	public Datee(Datee a) {
//		d =a.d; m = a.m; y =a.y;
//	}

	public static int nhapSo() {
		int n=0;
		String s;
		boolean error= false;
		Scanner sc = new Scanner(System.in); 
		do {
			s = sc.next();
			try {
				n = Integer.parseInt(s);
				error=false;
				if(n<0) {
					System.out.println("nhap lai mot so nguyen duong: ");
					error= true;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("nhap lai mot s nguyen: ");
				sc.nextLine();
				error= true;
			}

		}while (error);
		return n;
	}

	public void Nhap() { 
		do {
			System.out.println("nhap ngay: ");
			d = nhapSo();
			System.out.println("nhap thang: ");
			m = nhapSo();
			System.out.println("nhap nam : ");
			y = nhapSo();
			if(!hople())
				System.out.println("Khong hop le, ban nhap lai\n");
		}while (hople());
	}

	public void in() {
		// 	System.out.println("%d%d%d", d, m, y);
		System.out.println(d + "/" + m + "/" + y);
	}

//	public String toString() {
//		return d + "/" + m + "/" + y ;
//	}

	public boolean hople() {
		boolean h = false;

		//			 0	1	2	3	4	---->						12
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (y% 4 == 0) max[2] = 29;	// nam nhuan => max[2] = 29
		if (d > 0  && m > 0 &&  y < 13 && m < 13 && d <= max[m])
			h= true;

		return h;
	}

	public Datee ngaySau() {
		Datee a = new Datee();
		//		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//		if (y% 4 == 0) max[2] = 29;

		a.d ++;
		if(!hople()) {
			a.d = 1;
			a.m++;
			if(a.hople()) {
				a.m=1;
				a.y++;
			}
		}
		return a;
	}

	public Datee congNgay(int n) {
		Datee a = new Datee (d, m, y);	
		for(int i=0; i < n; i++)
			a = a.ngaySau();
		return a;
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Datee a = new Datee();
	a.in();
 }
}