package buoi3;
import java.util.Scanner;

public class Gach {
	private String maso,mau;
	private int slv,cdv,cnv;
	private long giaban;
	public Gach()
	{
		maso=new String();
		mau=new String();
		slv=0;
		cdv=0;
		cnv=0;
		giaban=0;
				
		
	}
	public Gach(Gach s)
	{
		maso=new String(s.maso);
		mau=new String(s.mau);
		slv=s.slv;
		cdv=s.cdv;
		cnv=s.cnv;
		giaban=s.giaban;
		
		
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ma so cho vien gach:");
		maso=sc.nextLine();
		System.out.println("Nhap mau cho vien gach:");
		mau=sc.nextLine();
		System.out.println("Nhap so luong vien gach:");
		slv=sc.nextInt();
		System.out.println("Nhap chieu dai vien gach:");
		cdv=sc.nextInt();
		System.out.println("Nhap chieu ngang vien gach:");
		cnv=sc.nextInt();
		System.out.println("Nhap gia ban vien gach:");
		giaban=sc.nextLong();
	}
	public String toString()
	{
		return maso+","+mau+","+slv+","+cdv+","+cnv+","+","+giaban;
	}
	public double giaBanLe()
	{
		return (float)(giaban/slv)*1.2;
	}
	public int dienTichNenToiDa()
	{
		return cdv*cnv*slv;
	}
	public int soLuongHop(int D,int N)
	{
		int svd=D/cdv;
		if(D%cdv!=0)
			svd++;
		int svn=N/cnv;
		if(N%cnv!=0)
			svn++;
		int sv=svd*svn;
		int sohop=sv/slv;
		if(sv%slv!=0)
			sohop++;
		return sohop;
		
	}
	public long layGia()
	{
		return giaban;
	}
	

}
