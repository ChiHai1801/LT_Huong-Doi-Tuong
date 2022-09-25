package buoi3;

import buoi2.Diem;

public class SDDoanThanng {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Diem A = new Diem(5,6);
			Diem B = new Diem(10,20);
			DoanThang AB = new DoanThang(A,B);
			System.out.println("AB:"+AB);
			DoanThang CD = new DoanThang();
			CD.nhap();
			System.out.println("CD:"+CD);
			CD.tinhTien(10, 15);
			System.out.println("CD sau khi tinh tien:"+CD);
			System.out.println("trungDiem CD:"+CD.trungDiem());
		}

	}

