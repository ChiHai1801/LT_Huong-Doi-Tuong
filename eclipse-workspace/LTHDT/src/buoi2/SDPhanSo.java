package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo a = new PhanSo (3,7);
		System.out.println(" Phan so a: ");
		a.in();

		PhanSo b = new PhanSo (4,9);
		System.out.println(" Phan so b: ");
		b.in();

		PhanSo x = new PhanSo ();
		System.out.println("\n Nhap phan so I: ");
		x.nhap();

		PhanSo y = new PhanSo ();
		System.out.println("\n Nhap phan so II: ");
		y.nhap();

		System.out.println("\n Nghich dao cua phan so I: ");
		(x.phanSogiaTriNghichDao()).in();

		System.out.println("\n Tong cua x va y: ");
		(x.cong(y)).in();

		PhanSo ps[];
		int n;
		System.out.println("\n Nhap so luong n phan so: ");
		Scanner sc = new Scanner (System.in);
		n =sc.nextInt();
		ps = new PhanSo[n+1];

		float sum  = 0;
		for (int i =0; i < n; i++) {
			ps[i] = new PhanSo();
			System.out.println("\n Phan so thu " + (i+1) + ":");
			ps[i].nhap();
			sum += (float) (ps[i].giaTriThuc());
		}

		System.out.println("\n Tong cua day phan so: " + (float)sum);
		PhanSo psSum = new PhanSo();
		psSum.gan(ps[0]);
		for(int i=0;i<n-1;i++) {
			if(ps[i].lonHon(psSum)) {
				psSum.gan(ps[i]);
			}
		}

		System.out.println("\n Phan so lon nhat: ");
		psSum.in();
		for (int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(ps[i].lonHon(ps[j])) {
					PhanSo P = new PhanSo();
					P.gan(ps[i]);
					ps[i].gan(ps[j]);
					ps[j].gan(P);

				}
			}
		}

		System.out.println("\n Day phan so sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			ps[i].in();
			System.out.println(" --- ");
		}
	}
}