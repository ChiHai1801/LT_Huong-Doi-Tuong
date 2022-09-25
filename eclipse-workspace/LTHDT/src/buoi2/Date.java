package buoi2;

import java.util.Scanner;

public class Date {

	private int ngay;
	private int thang;
	private int nam;

	public Date() {
		ngay = 0;
		thang = 0;
		nam = 0;
	}

	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}

	public Date (int d, int m, int y) {
		ngay = d;
		thang = m;
		nam = y;
	}

	public void NhapNgay() {
		Scanner sc = new   Scanner(System.in);
		do {
			System.out.println(" Nhap ngay: ");
			ngay = sc.nextInt();
			System.out.println("\n Nhap thang: ");
			thang = sc.nextInt();
			System.out.println("\n Nhap nam : ");
			nam = sc.nextInt();
			if (!this.hLe())
				System.out.println("\n Ngay thang nam vua nhap khong hop le !!! ");

		}while (!this.hLe());
	}

	public boolean hLe() {
		int max[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nam % 4 == 0)
			max[2] = 29;
		boolean h = false;
		if (ngay > 0 && thang > 0 && nam > 0 && thang < 13 && ngay <= max[thang])
			h = true;
		return h;
	}

	public void in() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}

	public String toString() {
		return (ngay + "/" + thang + "/" + nam);
	}

	public Date cong() {
		Date d = new Date(ngay, thang, nam);
		d.ngay++;
		if(!d.hLe()) {
			d.ngay = 1;
			d.thang++;

			if(!hLe()) {
				d.thang = 1;
				d.nam++;
			}
		}
		return d;
	}

	public Date congNgay(int n) {
		Date d = new Date (ngay, thang, nam);
		for(int i = 0; i < n; i++)
			d = d.cong();
		return d;
	}
}
