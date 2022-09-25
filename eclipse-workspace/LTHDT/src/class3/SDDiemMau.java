package class3;

public class SDDiemMau {
	public static void main(String[] args) {
		DiemMau a = new DiemMau(5, 10, "Trang");
		System.out.println("Toa do diem A:");
		System.out.println(a);
		DiemMau b = new DiemMau();
		b.nhap();
		b.tinhTien(10, 8);
		System.out.println("Tao do diem B:");
		System.out.println("("+b.layX()+","+b.layY()+")");
		b.ganMau("Vang");
		b.hienThi();

	}

}
