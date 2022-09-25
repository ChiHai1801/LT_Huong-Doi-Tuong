package bai1;		// bai cua thay Cang

import java.util.Scanner;

public class SDDatee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datee a = new Datee();
		a.Nhap();
		a.in();
		if(a.hople())
			System.out.println("ngay hop le");
		else
			System.out.println("ngay khong hop le");
		a=a.congNgay(200);
		a.in();
		System.out.println("nhap so ngay: ");
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt();
		Datee d[] = new Datee[n];
		for(int i=0;i< n;i++)
			d[i] = new Datee();
		
		for(int i=0;i< n;i++) {
			System.out.println("nhap ngay thu: " + (i+1) + ":");
			d[i].Nhap();		
	}
	
		for(int i=0;i< n;i++)
			d[i].in();
  }
}
