package bai3;
import java.util.Scanner;
public class SDGach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//yeu cau 1
		int n;
		System.out.println("Nhập vào số loại gạch: ");
		n = sc.nextInt();

		Gach ds[] = new Gach[n];
		for(int i=0; i<n; i++) {
			ds[i]= new Gach();
			System.out.println("Nhap vao thong tin loai gach thu" + ": ");
			ds[i].nhapThongTin();
		}
		// yeu cau 2
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin loai gach thu" + (i+1)+": ");
			ds[i].hienThi(); 
		}
		//yeu cau 3
		Gach g = ds[0];
		double min_cp = (double)ds[0].getGiaBan() / ds[0].dienTichNenToiDa();
		for(int i = 1; i<n; i++) {
			if((double) ds[i].getGiaBan() / ds[i].dienTichNenToiDa() < min_cp){
				min_cp = (double)ds[i].getGiaBan() / ds[i].dienTichNenToiDa();
				g = ds[i];
			}
		}
		System.out.println("Loại gạch có chi phí thấp nhất là: ");
		g.hienThi();

		//yeu cau 4
		//long sotien = 1000000000;
		for(int i=0; i<n; i++) {
			// long t= (ds[i].soLuongHop(20, 5)*ds[i].getGiaBan());
			// if(t<sotien)
			// sotien = t;
			// System.out.println("so tien it nhat de lot nen: " +sotien);

			double  cp = ds[i].soLuongHop(2000, 500) * ds[i].getGiaBan();
			System.out.println("chi phi lot cua gach thu "+ (i+1) + " la: "+ cp );
		} 
	}
}


