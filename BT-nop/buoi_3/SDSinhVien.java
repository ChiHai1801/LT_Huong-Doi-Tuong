package buoi3;
import buoi2.Date;
import java.util.Scanner;


public class SDSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		SinhVien a=new SinhVien();
		a.nhap();
		a.dangKyThem("LTHDT", "F");
		System.out.println("Thong tin sinh vien:"+a);
		SinhVien ds[];
		System.out.println("Nhap so luong sinh vien:");
		int n=sc.nextInt();
		
		ds=new SinhVien[n];
		for(int i=0;i<n;i++)
		{
			ds[i]=new SinhVien();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Nhap thong tin cho sinh vien thu :"+(i+1));
			ds[i].nhap();
			ds[i].dangKy();
			ds[i].nhapDiem();
		}
		
		System.out.println("Sinh vien bi canh cao hoc vu:");
		for(int i=0;i<n;i++)
		{
			if(ds[i].diemTB()<1)
				System.out.println(ds[i]);
			else
				System.out.println("Khong co sinh vien nao.");
		}
		int max=0;
		
		for(int i=0;i<n;i++)
		{
			if(ds[i].diemTB()>ds[max].diemTB())
			{
				max=i;
			}
		}
		System.out.println("Danh sach sinh vien co diem trung binh cao nhat:");
		for(int i=0;i<n;i++)
		{
			if(ds[i].diemTB()==ds[max].diemTB())
				System.out.println(ds[i]);
		}
		System.out.println("Danh sach sinh vien theo thu tu:");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(ds[i].layTen().compareTo(ds[j].layTen())>0)
				{
					SinhVien s=ds[i];
					ds[i]=ds[j];
					ds[j]=s;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ds[i]);
		}
		
		
		
		

	}

}
