package buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So sinh vien muon nhap cho DS la: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVienCNTT();
		}
		
		System.out.println("\nNhap thong tin cho danh sach sinh vien: ");
		
		for(int i=0; i<n; i++) {
			System.out.println("\n>> Nhap thong tin cho sinh vien thu "+(i+1)+": ");
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("\nThong tin sinh vien thu "+i+" la: "+ ds[i]);
		}
		
		System.out.println("\nNhap email can tim: ");
		String email;
		email = sc.nextLine();
		boolean tim = false;
		for(int i=0; i<n; i++) {
			if(ds[i].layEmail().compareToIgnoreCase(email)==0) {
				System.out.println("\nTai khoan can ELCIT can tim la: "+ ds[i].layEmail());
				tim = true;
				break;
			}
			
		}
		if (! tim) System.out.println("\nEmail ["+email+"] khong ton tai");
		
		}
}
