package buoi3;
import buoi2.Date;
import java.util.Scanner;

public class SinhVien {
	private String mssv,hoten;
	private Date ngay;
	private int slhp;
	private String tenhp[];
	private String diemhp[];
	public SinhVien()
	{
		mssv=new String();
		hoten=new String();
		ngay=new Date();
		slhp=0;
		tenhp=new String[50];
		diemhp=new String[50];
	}
	public SinhVien(SinhVien s)
	
	{
		mssv=new String(s.mssv);
		hoten=new String(s.hoten);
		ngay=new Date(s.ngay);
		slhp=s.slhp;
		for(int i=0;i<slhp;i++)
		{
			tenhp[i]=new String(s.tenhp[i]);
			diemhp[i]=new String(s.diemhp[i]);
		}
	}
	public void nhap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma so sinh vien:");
		mssv=sc.nextLine();
		System.out.println("Nhap ho ten sinh vien");
		hoten=sc.nextLine();
		System.out.println("Nhap ngay sinh sinh vien:");
		ngay.nhap();
		
	}
	public void dangKy()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap so hoc phan sinh vien dang ky:");
	    slhp=sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<slhp;i++)
	    {
	    	System.out.println("Nhap ten hoc phan thu "+(i+1));
	    	tenhp[i]=sc.nextLine();
	    	
	    }
	    
	}
	public void nhapDiem()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<slhp;i++)
		{
			System.out.println("Nhap diem mon : "+tenhp[i]);
			diemhp[i]=sc.nextLine();
		}
	}
	public String toString()
	{
		String s= mssv+","+hoten+","+ngay+",";
		for(int i=0;i<slhp;i++)
		{
			s+=tenhp[i]+":"+diemhp[i];
		}
		return s;
	}
	public float diemTB()
	{
		float d=0.0f;
		for(int i=1;i<=slhp;i++)
		{
			if(diemhp.equals("A"))
			{
				d+=4.0;
			}
			else if(diemhp.equals("B+"))
			{
				d+=3.5;
			}
			else if(diemhp.equals("B"))
			{
				d+=3.0;
			}
			else if(diemhp.equals("C+"))
			{
				d+=2.5;
			}
			else if(diemhp.equals("C"))
			{
				d+=2.0;
			}
			else if(diemhp.equals("D+"))
			{
				d+=1.5;
			}
			else if(diemhp.equals("D"))
			{
				d+=1.0;
			}
			else
			{
				d+=0;
			}
				
				
			
		}
		return d/slhp;
		
		
	}
	public void dangKyThem(String mon,String d)
	{
		if(slhp<tenhp.length-1)
		{
			tenhp[slhp]=new String(mon);
			diemhp[slhp]=new String(d);
			slhp++;
		}
		else
		{
			System.out.println("khong the them");
		}
			
	}
	public void xoa(String mon)
	{
		int pos=-1;
		for(int i=0;i<slhp;i++)
		{
			if(tenhp[i].equals(mon))
			{
				pos=1;
				break;
			}
		}
		if(pos==-1)
		{
			for(int i=0;i<slhp;i++)
			{
				tenhp[i]=tenhp[i+1];
				diemhp[i]=diemhp[i+1];
			}
			slhp--;
		}
	}
	public String layTen()
	{
		String h=hoten.trim();
		return h.substring(h.lastIndexOf(" ")+1);
	}

}
