package buoi3;

import buoi2.Diem;


public class SDDoanThang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diem A=new Diem(2,5);
		Diem B=new Diem(20,35);
		DoanThang AB=new DoanThang(A,B);
		AB.tinhTien(5,3);
		
		DoanThang CD=new DoanThang();
		CD.nhap();
		System.out.println("Do dai doan thang CD = "+CD.doDai());
		System.out.println("Goc CD = "+CD.goc());
		

	}

}
