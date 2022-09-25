package class1;

import java.util.Scanner;

/*	Bài 4 : Viết chương trình nhập vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn 
hình. Nếu số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, 
yêu cầu nhập lại.
*/
public class Tong {

	public int nhap() {
		int a, b, Tong=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: "); 
		a = sc.nextInt();
		System.out.println("Nhap b: ");
		b = sc.nextInt();
		Tong = a+b;

		if( Tong < 500) {
			System.out.println("\nban da nhap dung ");
		}else {
			System.out.println("\nban da nhap sai dinh dang, nhap lai!!! ");
		}
		return Tong;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tong t = new Tong();
		int a = t.nhap();
		int b = t.nhap();
		System.out.println("Tong = " + (a+b));
	}
}

