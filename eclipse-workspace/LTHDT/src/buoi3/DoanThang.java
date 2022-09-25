package buoi3;

import buoi2.Diem;

public class DoanThang {

	private Diem d1;
	private Diem d2;
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}

	public DoanThang(Diem A1, Diem B1) {
		d1 = new Diem (A1);
		d2 = new Diem (B1);
	}

	public DoanThang( int x1, int y1, int x2, int y2) {
		d1 = new Diem(x1, y1);
		d2 = new Diem(x2, y2);
	}

	public DoanThang(DoanThang dt) {
		d1 = new Diem(dt.d1);
		d2 = new Diem(dt.d2);
	}

	public void nhap() {
		System.out.println("\n Nhap toa do dau:");
		d1.nhap();
		System.out.println("\n Nhap toa do cuoi:");
		d2.nhap();
	}

	public void in() {
		System.out.println("[" + d1 + ", " + d2 + "]");
	}

	public String toString() {
		return ("[" + d1 + ", " + d2 + "]");

	}

	public void tinhTien(int dx, int dy) {
		d1.tinhTien(dx, dy);
		d2.tinhTien(dx, dy);
	}
	public float khoangCach() {
		return d1.khoangCach(d2);
	}
	public Diem trungDiem() {
		Diem I = new Diem((d1.layX() + d2.layY())/2,(d1.layX() + d2.layY())/2);
		return I;
	}
}

