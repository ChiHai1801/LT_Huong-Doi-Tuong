package bai3;

import java.util.Scanner;
public class SDSinhvien {

	public static void main(String[] args) {
		Sinhvien a=new Sinhvien();
		a.nhap();
		a.themHP("LTHDT", "F");
		System.out.println("Thong Tin SV a"+a);
		Sinhvien ds[];
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap so sinh vien");
		n = sc.nextInt();
		ds = new Sinhvien[n];
		for(int i = 0;i < n;i++ )
			ds[i] = new Sinhvien(a);
		for(int i = 0;i < n;i++ ) {
			System.out.println("nhap thong tin sinh vien"+(i+1)+":");
			ds[i].nhap();
			ds[i].dKy();
			ds[i].nhapDiem();
		}
		for(Sinhvien e:ds)
			System.out.println("nhap thong tin sinh vien:"+e);
		System.out.println("danh sach sinh vien bi canh bao hoc vu:");
		for(Sinhvien e:ds)
			if(e.dTB() < 1)
				System.out.println(e);
		System.out.println("danh sach sinh vien duoc sap xep theo ten:");
		for(int i = 0;i < n-1;i++ )
			for(int j = i+1;j < n;j++ )
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					Sinhvien s = ds[i];
					ds[i] = ds[j];
					ds[j] = s;
				}
		for(Sinhvien e:ds)
			System.out.println(e);
	}
}
