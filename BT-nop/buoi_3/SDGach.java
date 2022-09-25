package buoi3;
import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Gach ds[];
		System.out.println("Nhap so loai vien gach:");
		int n=sc.nextInt();
		ds=new Gach[n];
		for(int i=0;i<n;i++)
		{
			ds[i]=new Gach();
		}
		for(int i=0;i<n;i++)
		{
			ds[i].nhap();
		}
		Gach g=ds[0];
		double min=(double)ds[0].layGia()/ds[0].dienTichNenToiDa();
		for(int i=0;i<n;i++)
		{
			if(ds[i].layGia()/ds[i].dienTichNenToiDa()<min)
			{
				min=(double)ds[i].layGia()/ds[i].dienTichNenToiDa();
				g=ds[i];
			}
		}
		System.out.println("Loai Gach co chi phi lot thap nhat");
		
		g.toString();
		
		

	}

}
