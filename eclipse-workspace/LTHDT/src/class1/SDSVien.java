package class1;
import java.util.Scanner;
public class SDSVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			SVien a=new SVien();
			//System.out.println(" Tao thong Tin SV a: ");
			a.nhap();
			a.themHP("\n LTHDT", "F");
			a.in();
			System.out.println(" Thong Tin SV a: " + a);

			// nhap danh sach sinh vien
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap so luong sinh vien");
			int n = sc.nextInt();

			sc.nextLine();

			SVien ds[] = new SVien [n];	 // tao ra n bien tham chieu
			// cap phat bo nho cho cac doi tuong
			for(int i = 0;i < n;i++ )
				ds[i] = new SVien();

			// nhap thong tin cho ca doi tuong sinh vien
			for(int i = 0;i < n;i++ ) {
				System.out.println(" Nhap thong tin sinh vien thu "+ (i+1) +": \n" );
				ds[i].nhap();
			}
			//---------
			// hien thi thong tin cho ca doi tuong sinh vien
			for(int i = 0;i < n;i++ ) {
				System.out.println(" thong tin sinh vien thu "+ (i+1) +": \n");
				//ds[i].in();
			}

			// nhap diem thong tin cho ca doi tuong sinh vien
			for(int i = 0;i < n;i++ ) {
				System.out.println(" nhap diem cho sinh vien thu "+ (i+1) +": \n"/* + ds[i] +*/ );
				ds[i].nhapDiem();
			}

			// dang ky thong tin cho ca doi tuong sinh vien
			for(int i = 0;i < n;i++ ) {
				System.out.println(" dang ky mon hoc cho sinh vien thu "+ (i+1) +":");
				ds[i].dangKyMH();
			}

			//			for(SVien e:ds)
			//				System.out.println("nhap thong tin sinh vien:"+e);
			//			System.out.println("danh sach sinh vien bi canh bao hoc vu:");
			//			for(SVien e:ds)
			//				if(e.diemTB() < 1)
			//					System.out.println(e);
			//			System.out.println("danh sach sinh vien duoc sap xep theo ten:");
			//			for(int i = 0;i < n-1;i++ )
			//				for(int j = i+1;j < n;j++ )
			//					if(ds[i].layTen().compareTo(ds[j].layTen()) > 0) {
			//						SVien s = ds[i];
			//						ds[i] = ds[j];
			//						ds[j] = s;
			//					}
			//			for(SinhVien e:ds)
			//				System.out.println(e);
			//		}
			//	}
			//
			//}
		}
	}
}
