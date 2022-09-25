package buoi3;

import java.util.Scanner;
import buoi2.Date;
public class SDSinhVien {

	public static void main(String[] args) {
		SinhVien a=new SinhVien();
		System.out.println(" Tao thong Tin SV a: ");
		a.nhap();
		a.themHP("\n LTHDT","F");
		System.out.println("\n  Hien thi thong tin sinh vien a: "+a.toString());
		
		try (Scanner sc =new Scanner(System.in)){
			System.out.println("\n  Nhap so luong sinh vien: ");
			int n = sc.nextInt();
			SinhVien ds[] = new SinhVien[n];
			for(int i =  0; i < n; i++)
				ds[i]=new SinhVien();
			for(int i = 0; i < n; i++) {
				System.out.println("\n Nhap thong tin sinh vien thu " + (i+1) + ":");
				ds[i].nhap();
				ds[i].dangKyMH();
				ds[i].nhapDiem();
			}

			for(int i = 0;i < n; i++)
				System.out.println("\n Thong tin sinh vien thu " + (i+1) + ":");
			
			int max=0;
			System.out.println("\n Cac sinh vien bi canh bao hoc vu:");
			for(int i = 0; i < n; i++) {
				if(ds[i].diemTB() <= 1.0f)
					System.out.println(ds[i]);
				if(ds[max].diemTB() < ds[i].diemTB())
					max=i;
			}

			System.out.println("\n Cac sinh vien co diem trung binh cao nhat:");
			for(int i = 0; i < n; i++)
				if(ds[i].diemTB() == ds[max].diemTB())
					System.out.println(ds[i]);
			System.out.println(" Sap xep sinh vien theo ten:");
			for(int i=0; i < n-1; i++)
				for(int j = i+1; j < n; j++)
					if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
						SinhVien s = ds[i];
						ds[i]=ds[j];
						ds[j] = s;
					}

			for(int i = 0; i < n; i++)
				System.out.println(ds[i]);

		}
	}
}

