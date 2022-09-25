package bai3;

import java.util.Scanner;

public class SDSV {




	public static void main(String[] args) {
		SV a=new SV();
		a.nhap();
		System.out.println("Thong tin sinh vien a: "+a.toString());
		a.dkMH("LTHDT","F");
		try (Scanner sc =new Scanner(System.in)){
			System.out.println("Nhap so sinh vien: ");
			int n=sc.nextInt();
			SV ds[]=new SV[n];
			for(int i=0;i<n;i++)
				ds[i]=new SV();
			for(int i=0;i<n;i++) {
				System.out.println("Nhap thong tin sinh vien thu "+(i+1)+":");
				ds[i].nhap();
				ds[i].dangKyMH();
				ds[i].nhapDiem();
			}


			for(int i=0;i<n;i++)
				System.out.println("Thong tin sinh vien thu "+(i+1)+":");
			int max=0;
			System.out.println("Cac sinh vien bi canh bao hoc vu:");
			for(int i=0;i<n;i++) {
				if(ds[i].dtb()<1.0)
					System.out.println(ds[i]);
				if(ds[max].dtb()<ds[i].dtb())
					max=i;
			}

			System.out.println("Cac sinh vien co diem trung binh cao nhat:");
			for(int i=0;i<n;i++)
				if(ds[i].dtb()==ds[max].dtb())
					System.out.println(ds[i]);
			System.out.println("Sap xep sinh vien theo ten:");
			for(int i=0;i<n-1;i++)
				for(int j=i+1;j<n;j++)
					if(ds[i].layTen().compareTo(ds[j].layTen())>0) {
						SV s = ds[i];
						ds[i]=ds[j];
						ds[j] = s;
					}

			for(int i=0;i<n;i++)
				System.out.println(ds[i]);
		}
	}
}

