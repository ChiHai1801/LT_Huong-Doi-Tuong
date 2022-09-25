package Bai1;		// bai: 4

import java.util.Scanner;

public class TinhTong {

	public static void main(String[] args) {
		while(true)
		{
			try {
				Scanner t = new Scanner(System.in);
				System.out.print("Nhập a:");
				int a= t.nextInt();
				System.out.print("\nNhập b:");
				int b= t.nextInt();
				System.out.print("\nTổng ="+(a+b));
				break;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai - vui lòng nhập lại!!!");
			}
		}
	}
}

