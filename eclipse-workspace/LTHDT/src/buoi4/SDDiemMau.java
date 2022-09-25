package buoi4;

import java.util.Scanner;
import buoi4.DiemMau;

public class SDDiemMau {

	public static void main(String[] args) {
		DiemMau A = new DiemMau(5, 10, "Trang");
		System.out.println(" Diem mau A có toa do:");
		A.in();
		
		DiemMau B = new DiemMau();
		System.out.println("\n Nhap toa do diem mau cua B:");
		B.nhapDM();
		System.out.println("\n Diem mau B có toa do:");
		B.in();
		System.out.println("\n Diem B sau khi duoc gan:");
		B.gan(10, 8);
		B.ganMau("Vang");
		B.in();
	}
}
