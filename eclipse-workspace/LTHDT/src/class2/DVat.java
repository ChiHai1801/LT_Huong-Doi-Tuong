package class2;

import java.util.Scanner;

public abstract class DVat{
	private String giong;
	private String mau;
	private float cnang;
	public DVat() {
		giong = new String();
		mau = new String();
		cnang = 0;
	}
	
	public DVat(String G, String M, float CN) {
		G = new String(giong);
		M = new String(mau);
		CN = cnang;
	}
	
	public DVat(DVat d) {
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
			System.out.println(" diem giong: " + giong + "; Mau Sac: " + mau +"; Can Nang: " + cnang);
		}

	public String toString() {
	return("diem giong: " + giong + "; Mau Sac: " + mau +"; Can Nang: " + cnang);
	}
}



