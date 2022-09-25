package bai5;

import java.util.Scanner;
import bai2.Date;
public class chiTiet {
	private HangHoa h;
	private int sl;
	private long Dgia;
	public chiTiet() {
		sl = 0;
		Dgia =0;
		h = new HangHoa();
	}
	public chiTiet(chiTiet c) {
		sl = c.sl;
		Dgia = c.Dgia;
		h = new HangHoa(c.h);
	}
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap so luong: ");
		sl = sc.nextInt();
		System.out.println("nhap don gia: ");
		Dgia = sc.nextLong();
		System.out.println("nhap hang hoa:");
		h.nhap();
	}
	public void hienThi() {
		System.out.println("so luong" +sl+ ",don gia" +Dgia+ ",hang hoa" +h);
	}
	public int laysl() {
		return sl;
	}
	public long layDgia() {
		return Dgia;
	}
	public String toString() {
		return "so luong" +sl+ ",don gia" +Dgia+ ",hang hoa" +h;
	}
}
