package buoi5;

import java.util.Scanner;

public class SDhoaDon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Nhap so hoa don: ");
		int n= sc.nextInt();
		hoaDon ds[] = new hoaDon[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("\n Nhap hoa don thu " + (i+1) +":");
			ds[i] = new hoaDon();
			ds[i].nhapHD();
		}
		for(int i = 0; i < n; i++) {
			System.out.println( (i+1) +"-" + ds[i]);
		}

	}

}
