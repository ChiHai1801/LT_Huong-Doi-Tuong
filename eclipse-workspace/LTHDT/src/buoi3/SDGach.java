package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" Nhap vao so loai Gach: ");
		n = sc.nextInt();

		Gach ds[] = new Gach[n];
		for(int i=0; i<n; i++) {
			ds[i]= new Gach();
			System.out.println("\n Nhap vao thong tin loai gach thu "+ (i+1) + ": ");
			ds[i].nhap();
		}

		for(int i=0; i<n; i++) {
			System.out.println("\n Thong tin loai gach thu " + (i+1) + ": ");
			ds[i].in(); 
		}

		Gach g = ds[0];
		double min_cp = (double)ds[0].getGiaBan() / ds[0].dienTichNenToiDa();
		for(int i = 1; i<n; i++) {
			if((double) ds[i].getGiaBan() / ds[i].dienTichNenToiDa() < min_cp){
				min_cp = (double)ds[i].getGiaBan() / ds[i].dienTichNenToiDa();
				g = ds[i];
			}
		}
		
		System.out.println("\n Loai gach co chi phi thap nhat la: ");
		g.in();

		for(int i = 0; i < n; i++) {

			double  cp = ds[i].soLuongHop(2000, 500) * ds[i].getGiaBan();
			System.out.println("\n Chi phi lot cua gach thu "+ (i+1) + " la: " + cp );
		} 
	}
}


