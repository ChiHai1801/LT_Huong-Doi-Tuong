package buoi5;

import java.util.Scanner;
import buoi2.Date;
public class HangHoa {
	private String maSo, hTen, nsxuat;

	public HangHoa() {
		maSo = new String();
		hTen = new String();
		nsxuat= new String();
	}
	
	public HangHoa(HangHoa h) {
		maSo = new String(h.maSo);
		hTen = new String(h.hTen);
		nsxuat= new String(h.nsxuat);
	}
	
	public void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("nhap ma so: ");
		maSo = sc.nextLine();
		System.out.println("nhap ho ten: ");
		hTen = sc.nextLine();
		System.out.println("nhap ngay san xuat: ");
		nsxuat = sc.nextLine();
	}
	
	public void hienThi() {
		System.out.println("ma so" +maSo+ ",ho ten" +hTen+",ngay san xuat"+nsxuat);
	}
	
	public String toString() {
		return "ma so" +maSo+ ",ho ten" +hTen+",ngay san xuat"+nsxuat;
	}

}
