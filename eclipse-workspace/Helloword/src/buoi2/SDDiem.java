package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem A = new Diem(3,4);
		System.out.println("A");
		A.HienThi();
		// System.out.println("nhap vao hoanh do:");
		Diem B = new Diem();
		//System.out.println("Nhap B: ");
		B.nhap();
		System.out.println("B");
		B.HienThi();

		Diem C = new Diem(-B.giaTrix(), -B.giaTriy());
		System.out.println("\nC");
		C.HienThi();
		System.out.println("\nkhoang cach tu B dan O la: "+B.khoangCach());
		System.out.println("\nkhoang cach tu A dan B la: "+A.khoangCach(B));
	}
}
