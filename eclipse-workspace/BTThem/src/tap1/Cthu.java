package tap1;

import java.util.Scanner;
public class Cthu extends Cnguoi {
	private int so, bthang;
	private String vtri, mua, clbo;
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap So : ");
		so = sc.nextInt();
		System.out.println("Nhap Vi tri : ");
		vtri = sc.nextLine();
		System.out.println("Nhap Ban thang : ");
		bthang = sc.nextInt();
		System.out.println("Nhap Mua:");
		mua = sc.nextLine();
		System.out.println("Nhap Cau lac bo:");
		clbo = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("\n So"+so+"Vi tri" + vtri + "Ban thang"+bthang+"Mua"+mua+"Cau lac bo"+clbo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
