package bai1;

import java.util.Scanner;

public class DaySo {
	int ds[];
	int n, i;
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu: ");
		n = sc.nextInt();
		ds = new int[n]; // cap phat bo nho cho mang
		for(i=0; i < ds.length; i++)
		System.out.println("\n Nhap so phan tu thu: " + (i+1));
		ds[i] = sc.nextInt();	
	}

	public void in() {
		for(int e : ds)
			System.out.println(e+ " ");	
	}
	
	public void sapxep() {
		for(int i=0; i< ds.length-1;i++)
			for(int j=i+1; j< ds.length;j++ ) {
				if(ds[i] >ds[j]) {
					int t = ds[i];
					ds[i] = ds[j];
					ds[j] = t;
			}
		}			
	}
	
	public int dem(int x) {
		int c = 0;
		for(int e : ds)
			if(e==x) c++;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaySo d = new DaySo();
		d.nhap();
		d.in();
		d.sapxep();
		d.in();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n nhap so can dem x=");
		int x = sc.nextInt();
		System.out.println("\n Dem so x xuat hien: " + d.dem(x));
	}
}
