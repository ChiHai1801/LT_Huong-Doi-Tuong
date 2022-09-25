package class2;

import buoi2.Diem;

public class SDDDiemMau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DDiemMau a = new DDiemMau(5, 10, "trang");
		a.in();
		System.out.println("In diem mau " +a);

		System.out.println("(" + a.layX() + "," +a.layY());

		Diem d = a;

		//a= d;		sai

		d.in(); 	// đã đc nap đè
		DDiemMau c = new DDiemMau();
		c.nhapDiemM();
		c.in();
		c.tinhTien(10, 8);
		c.ganMau("vang");
		System.out.println(c);
	}
}
