package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		System.out.println("nhap so luong sinh vien: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		int a = 0 ;
		for(int i=0; i<n; i++) {
			System.out.println("Nhap thong tin: 1.SV, 2.SVCNTT");
			a = sc.nextInt();
			if(a==1)
				ds[i] = new SinhVien();
			else {
				ds[i] = new SinhVienCNTT();
 			}
			ds[i].nhap();
		}
		System.out.println("Nhap Gmail can tim:");
		String b = sc.nextLine();
		for(SinhVien s:ds)
			if(s.equals(b))
			{
				System.out.println("Thong tin sinh vien can tim:");
				System.out.println(s);
				break;
			}
	}
}
