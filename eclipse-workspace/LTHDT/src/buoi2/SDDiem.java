package buoi2;

public class SDDiem {

	public static void main(String[] args) {
		Diem A = new Diem(3, 4);
		System.out.println(" Toa do A: ");
		A.in();

		Diem B = new Diem();
		System.out.println("\n Nhap toa do B: ");
		B.nhap();
		System.out.println("\n Toa do B:");
		B.in();

		Diem C = new Diem(-B.layX(), -B.layY());
		System.out.println("\n Toa do C:");
		C.in();
		
		System.out.println("\n Khoang cach tu B dan O la: " + B.khoangCach());
		System.out.println("\n Khoang cach tu A dan B la: " + A.khoangCach(B));
	}

}
