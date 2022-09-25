package tap1;

import java.util.Scanner;

public class Cnguoi {
	private String id, hten, ngay;
	private char phai;

	public Cnguoi () {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 0;
	}

	public Cnguoi (Cnguoi A) {
		id = new String(A.id);
		hten = new String(A.hten);
		ngay = new String(A.ngay);
		phai = A.phai;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		id = sc.nextLine();

		System.out.println("Nhap Ho va Ten: ");
		hten = sc.nextLine();

		System.out.println("Nhap ngay thang nam sinh (ngay/thang/nam): ");
		ngay = sc.nextLine();

		System.out.println("Nhap phai nam(M), nu(F) ");
		phai = sc.next().charAt(0);
	}

	public void in() {
		System.out.print("\nID: "+id+"\nHo va ten: "+hten+"\nNgay sinh: "+ngay+"\nPhai: ");
		if(phai == 77 ) {
			System.out.print("Nam");
		}
		else {
			System.out.print("Nu");
		}
	}
	public static void main(String[] args) {
		Cnguoi c1 = new Cnguoi();
		c1.nhap();
		c1.in();
		Cnguoi c2 = new Cnguoi(c1);
		c2.in();


	}	

}
