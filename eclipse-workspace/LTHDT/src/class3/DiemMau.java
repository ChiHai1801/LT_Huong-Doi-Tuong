package class3;
import java.util.Scanner;

import buoi2.Diem;
public class DiemMau extends Diem {
	private String mau;
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x1, int y1, String mau1) {
		super(x1,y1);
		mau = new String(mau1);
	}
	public DiemMau(DiemMau a) {
		super(a);
		mau=new String(a.mau);
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap mau: ");
		Scanner sc = new Scanner(System.in);
		mau = sc.nextLine();
	}
	public void hienThi() {
		super.in();
		System.out.println(mau);
	}
	public String toString() {
		return super.toString()+mau;
	}
	public void ganMau(String mau1) {
		mau = new String(mau1);
	}

}
