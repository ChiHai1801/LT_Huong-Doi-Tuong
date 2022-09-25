package class1;		// th. cang

import buoi2.Diem;

public class DDoanThang {

	private Diem A;
	private Diem B;
	public DDoanThang() {
		A = new Diem();
		B = new Diem();
	}

	public DDoanThang(Diem A1, Diem B2) {
		A = new Diem (A1);
		B = new Diem (B2);
	}

	public DDoanThang( int x1, int y1, int x2, int y2) {
		A = new Diem(x1, y1);
		B = new Diem(x2, y2);
	}

	public DDoanThang(DDoanThang dt) {
		A = new Diem(dt.A);
		B = new Diem(dt.B);
	}

	public void nhap() {
		System.out.println(" Nhap toa do diem dau:");
		A.nhap();
		System.out.println("\n Nhap toa do diem cuoi:");
		B.nhap();
	}
	
//	public void in() {		//  [d1(x,y) , d2(x,y)]
//		System.out.println("["/* + d1 + "," + d2 + "]"*/);
//		A.in();
//		System.out.println(",");
//		B.in();
//		System.out.println("]");
//	}
	
	public void in() {
		System.out.println("[" + A + ", " + B + "]");
	}
	
	public String toString() {		//  [d1(x,y) , d2(x,y)]
		return ("[" + A + ", " + B + "]");

	}
	
	public void in(String s) {	//  [d1(x,y) , d2(x,y)]
		System.out.println(s);
		in();		//Doanthang.in
	}

	public void tinhTien(int dx, int dy) {
		A.tinhTien(dx, dy);
		B.tinhTien(dx, dy);
	}
	public float khoangCach() {
		return A.khoangCach(B);
	}
	public Diem trungDiem() {
		Diem I = new Diem((A.layX() + B.layY())/2,(A.layX() + B.layY())/2);

		return I;
	}
}

