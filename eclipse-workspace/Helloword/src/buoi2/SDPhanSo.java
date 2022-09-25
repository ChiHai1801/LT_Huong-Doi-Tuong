package buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhanSo a = new PhanSo (3,7);
		PhanSo b = new PhanSo (4,9);
		a.inPhanSo();
		b.inPhanSo();
		PhanSo x = new PhanSo ();
		PhanSo y = new PhanSo ();
		System.out.println("nhap phan so I: ");
		x.nhapPhanSo();
		System.out.println("nhap phan so II: ");
		y.nhapPhanSo();
		System.out.println("nghich dao cua phan so I: ");
		(x.PhanSogiaTriNghichDao()).inPhanSo();
		System.out.println("tong xua x va y: ");
		(x.cong(y)).inPhanSo();
		PhanSo ps[];
		int n;
		System.out.println("nhap so luong n phan so: ");
		Scanner sc = new Scanner (System.in);
		n =sc.nextInt();
		ps = new PhanSo[n+1];
		float sum  = 0;
		for (int i =0;i<n;i++) {
			ps[i] = new PhanSo();
			ps[i].nhapPhanSo();
			sum += (float) (ps[i].giaTriThuc());
			}
		System.out.println("tong cua day phan so: "+ (float)sum);
		PhanSo psMax = new PhanSo();
		psMax.gan(ps[0]);
		for(int i=0;i<n-1;i++) {
			if(ps[i].lonHon(psMax)) {
				psMax.gan(ps[i]);
			}
		}
		System.out.println("phan so lon nhat: ");
		psMax.inPhanSo();
		for (int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ps[i].lonHon(ps[j])) {
					PhanSo temp = new PhanSo();
					temp.gan(ps[i]);
					ps[i].gan(ps[j]);
					ps[j].gan(temp);
					
				}
			}
		}
		System.out.println("day phan so sau khi sap xep: ");
		for (int i=0;i<n;i++) {
			ps[i].inPhanSo();
    		System.out.println(" - ");
		}
	}
}