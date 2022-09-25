package bai2;

import java.util.Scanner;

public class Date {

	private int ngay;
	private int thang;
	private int nam;

	public Date() {
		ngay = thang = nam = 0;
	}

	public Date(Date d) {
		ngay = thang = nam =0;
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
		int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nam % 400 == 0 || (nam % 4 == 0 && nam != 0))
			ngayTrongThang[2] = 29;
		if (thang < 1 || thang >12)
			return false;
		return (ngay >= 1 && ngay <= ngayTrongThang[thang]);
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
			if (!this.hLe())
				System.out.println("Ngay thang nam vua nhap khong hop le !!! ");

			sc.close();
		}while (!this.hLe());
	}

	public Date ngayHomSau() {
		Date homsau = new Date();
		int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nam % 400 == 0 || (nam % 4 == 0 && nam != 0))
			ngayTrongThang[2] = 29;
		if (thang >= 1 && ngay < ngayTrongThang[thang]) {
			homsau.ngay = ngay + 1;
			homsau.thang = thang;
			homsau.nam = nam;
		}else {
			homsau.ngay = 1;
			homsau.thang = thang + 1;
			homsau.nam = nam;
		}
		if(homsau.thang == 13) {
			homsau.thang = 1;
			homsau.nam++;
		}

		return homsau;
	}

	public Date congNgay(int n) {
		Date d = new Date (ngay, thang, nam);
		for(int i=0; i < n; i++)
			d = d.ngayHomSau();
		return d;
	}
}
