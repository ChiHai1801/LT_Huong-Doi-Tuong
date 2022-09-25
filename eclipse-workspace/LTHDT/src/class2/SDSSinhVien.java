package class2;

import java.util.Scanner;
public class SDSSinhVien {

	public static void main(String[] args) {
		SSinhVien a=new SSinhVien();
		System.out.println(" Tao thong Tin SV a: ");
		a.nhap();
		System.out.println(" Hien thi thong Tin SV a: " + a.toString());
		a.themHP("LTHDT", "F");

		SSinhVien ds[];
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" Nhap so luong sinh vien");
		n = sc.nextInt();
		ds = new SSinhVien[n];
		for(int i = 0;i < n;i++ )
			ds[i] = new SSinhVien(a);
		for(int i = 0;i < n;i++ ) {
			System.out.println(" Nhap thong tin sinh vien "+ (i+1) +":");
			ds[i].nhap();
			ds[i].dangKyMH();
			ds[i].nhapDiem();
		}
		
		for(SSinhVien e:ds)
			System.out.println(" Nhap thong tin sinh vien:"+e);
		System.out.println(" Danh sach sinh vien bi canh bao hoc vu:");
		for(SSinhVien e:ds)
			if(e.diemTB() < 1)
				System.out.println(e);
		System.out.println(" Danh sach sinh vien duoc sap xep theo ten:");
		for(int i = 0;i < n-1;i++ )
			for(int j = i+1;j < n;j++ )
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
					SSinhVien s = ds[i];
					ds[i] = ds[j];
					ds[j] = s;
				}
		for(SSinhVien e:ds)
			System.out.println(e);
	}
}
