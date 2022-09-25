package buoi4;

import java.util.Scanner;

import buoi2.Diem;
public class DiemMau extends Diem {
	private String mau;

	public DiemMau() {
		super();
		mau = new String();
	}

	public DiemMau(int x1, int y1, String M) {
		super(x1, y1);
		mau = new String(M);	
	}

	public DiemMau(DiemMau m) {
		super();
		mau = new String(m.mau);
	}

	public void nhapDM() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println(" Nhap mau: ");
		mau = sc.nextLine();
	}
	
	public void ganMau(String mau) {
		mau = new String();
	}

	public void in() {
		super.in();
		System.out.println(" Mau: "+ mau);
	}
	
	public String toString() {
		return(super.toString() + " Mau: "+ mau);
	}
	
}
