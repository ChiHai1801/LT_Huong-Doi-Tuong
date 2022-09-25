package Bai1;	// bai: 8

import java.util.Scanner;

public class DsSoNguyen {

	public static void main(String[] args) {

		// Tao danh sach n so nguyen
		int ds[];
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng phần tử: ");
		int n = sc.nextInt();
		ds = new int[n];

		// Nhap gia tri cho danh sach (mang)
		System.out.println("Nhập danh sách các số nguyên: ");
		for(int i=0; i<n; i++) 
		{
			System.out.print("Nhập phần tử thứ: " + (i+1) + ":");
			ds[i] = sc.nextInt();
		}

		// Tinh tong
		int Tong = 0;
		for(int i=0; i<n; i++)
			Tong += ds[i];
		System.out.println("Tổng = " + Tong);

		// Dem so luong so X
		int dem = 0;
		System.out.print("Nhập số nguyên cần đếm: ");
		int x = sc.nextInt();
		for(int i=0; i<n; i++)
			if( ds[i] == x )
				dem++;
		System.out.println("Số lượng số nguyên: " + x + "\t Có trong danh sách là: " + dem);

		// Tim so lon nhat trong danh sach
		int max = ds[0];
		for(int i=1; i<n; i++)
			if( ds[i]>max)
				max = ds[i];
		System.out.println("Số lớn nhất trong danh sách: " + max);

		// Hien thi danh sach cac so chan
		System.out.println("Danh sách các số chẳn");
		for(int i=0; i<n; i++)
			if( ds[i]%2 == 0)
				System.out.print(ds[i]+ "\t");
		System.out.println();

		// Sap xep danh sach theo thu tu tang dan
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++)
				if ( ds[i] > ds[j] ) 
				{
					// Doi cho
					int temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}

		// Hien thi danh sach
		System.out.println("Danh sách sau khi sắp xếp: ");
		for(int i=0; i<n; i++)
			System.out.print(ds[i]+ "\t");
	}
}
