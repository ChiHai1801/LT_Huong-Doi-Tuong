package buoi3;

import buoi2.Diem;

public class DoanThang {

		private Diem A;
		private Diem B;
		public DoanThang() {
			A = new Diem();
			B = new Diem();
		}

		public DoanThang(Diem A1, Diem B1) {
			A = new Diem (A1);
			B = new Diem (B1);
		}

		public DoanThang( int x1, int y1, int x2, int y2) {
			A = new Diem(x1, y1);
			B = new Diem(x2, y2);
		}

		public DoanThang(DoanThang dt) {
			A = new Diem(dt.A);
			B = new Diem(dt.B);
		}

		public void nhap() {
			System.out.println("nhap toa do dau:");
			A.nhap();
			System.out.println("nhap toa do cuoi:");
			B.nhap();
		}
		public String toString() {
			return "["+A+","+B+"]";
		}

		public void tinhTien(int dx, int dy) {
			A.tinhTien(dx, dy);
			B.tinhTien(dx, dy);
		}
		public float doDai() {
			return A.khoangCach(B);
		}
		public Diem trungDiem() {
			Diem I = new Diem((A.giaTrix() + B.giaTriy())/2,(A.giaTrix() + B.giaTriy())/2);
			return I;
		}
	}

