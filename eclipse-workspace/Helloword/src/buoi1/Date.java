package buoi1;

import java.util.Scanner;

public class Date {
	private int ngay;
	private int thang;
	private int nam;

	public Date() {
		ngay = thang = nam = 0;
	}
	
	public Date(Date d) {
		ngay = thang = nam = 0;
	}
	
	public Date (int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}

	public void hienThi() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public boolean hLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nam % 4 == 0) max[2] = 29;
		if (ngay> 0 && thang >0 && nam >0 && thang <13 && ngay <= max[thang])
			return true;
		else
			return false;
	}

	public void NhapNgay() {
		Scanner sc = new   Scanner(System.in); 
		do {
			System.out.println("nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("nhap thang: ");
			thang = sc.nextInt();
			System.out.println("nhap nam : ");
			nam = sc.nextInt();
		}while (!this.hLe());
	}

	public Date ngayHomSau() {
		Date d = new Date (ngay, thang, nam);
		d.ngay++;
		if (!hLe()) {
			d.ngay = 1;
			d.thang++;
			if (!hLe()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}

	public Date congNgay(int n) {
		Date d = new Date (ngay, thang, nam);
		for(int i=0; i < n; i++)
			d = d.ngayHomSau();
		return d;
	}
}