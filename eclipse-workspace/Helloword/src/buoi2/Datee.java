package buoi2;

import java.util.Scanner;

public class Datee {

	private int ngay;
	private int thang;
	private int nam;

	public Datee() {
		ngay = thang = nam = 0;
	}
	
	public Datee(Datee d) {
		ngay = thang = nam =0;
	}

	public Datee (int d, int m, int y) {
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

	public Datee ngayHomSau() {
		Datee tomorrow = new Datee();
		int ngayTrongThang[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (nam % 400 == 0 || (nam % 4 == 0 && nam != 0))
			ngayTrongThang[2] = 29;
		if (thang >= 1 && ngay < ngayTrongThang[thang]) {
			tomorrow.ngay = ngay + 1;
			tomorrow.thang = thang;
			tomorrow.nam = nam;
		}else {
			tomorrow.ngay = 1;
			tomorrow.thang = thang + 1;
			tomorrow.nam = nam;
		}
		if(tomorrow.thang == 13) {
			tomorrow.thang = 1;
			tomorrow.nam++;
		}

		return tomorrow;
	}

	public Datee congNgay(int n) {
		Datee d = new Datee (ngay, thang, nam);
		for(int i=0; i < n; i++)
			d = d.ngayHomSau();
		return d;
	}
}
