package bai4;

import java.util.Scanner;

public abstract class DVat {
	//private String ten;
	private String giong;
	private String mau;
	private float cnang;
	public DVat() {
		//ten = new String();
		giong = new String();
		mau = new String();
		cnang = 0;
	}
	public DVat(DVat d) {
		//ten = new String(d.ten);
		giong = new String(d.giong);
		mau = new String(d.mau);
		cnang = d.cnang;
	}
	public void nhapDVat() {
		Scanner sc = new Scanner (System.in);
		System.out.println("diem giong: ");
		giong = sc.nextLine();
		System.out.println("mau sac: ");
		mau = sc.nextLine();
		System.out.println("can nang: ");
		cnang = sc.nextFloat();
	}
	public abstract void Keu() ;
		 public void in() {
			System.out.println(/*"Ten: " + ten + */"; diem giong: " + giong + "; Mau Sac: " + mau +"; Can Nang: " + cnang);
		}
	}

