package bai5;

import java.util.Scanner;
import bai2.Date;
public class HangHoa {
	private String maSo, hTen;
	private Date ngaysx;
	public HangHoa() {
		maSo = new String();
		hTen = new String();
		ngaysx = new Date();
	}
	public HangHoa(HangHoa h) {
		maSo = new String(h.maSo);
		hTen = new String(h.hTen);
		ngaysx = new Date(h.ngaysx);
	}
	public void nhap() {
		Scanner sc=new Scanner (System.in);
		System.out.println("nhap ma so: ");
		maSo = sc.nextLine();
		System.out.println("nhap ho ten: ");
		hTen = sc.nextLine();
		System.out.println("nhap ngay san xuat: ");
		ngaysx.NhapNgay();
	}
	public void hienThi() {
		System.out.println("ma so" +maSo+ ",ho ten" +hTen+",ngay san xuat"+ngaysx);
	}
	public String laymaSo() {
		return maSo;
	}
	public String layhTen() {
		return hTen;
	}
	public Date layngaysx() {
		return ngaysx;
	}
	public String toString() {
		return "ma so" +maSo+ ",ho ten" +hTen+",ngay san xuat"+ngaysx;
	}
}
