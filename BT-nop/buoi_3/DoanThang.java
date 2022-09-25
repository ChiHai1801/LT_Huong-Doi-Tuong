package buoi3;

import buoi2.Diem;

public class DoanThang {
	private Diem A,B;
	public DoanThang()
	{
		A=new Diem();
		B=new Diem();
	}
	public DoanThang(Diem A1,Diem B1)
	{
		A=new Diem(A1.giaTriX(),A1.giaTriY());
		B=new Diem(B1.giaTriX(),B1.giaTriY());
	}
	public DoanThang(int x1,int y1,int x2,int y2)
	{
		A=new Diem(x1,y1);
		B=new Diem(x2,y2);
	}
	public void nhap()
	{
		
		System.out.println("Nhap toa do diem dau:");
		A.nhapDiem();
		System.out.println("Nhap toa do diem cuoi:");
		B.nhapDiem();
	}
	public void hienThi()
	{
		System.out.println("["+A.toString()+","+B.toString()+"]");
	}
	public void tinhTien(int dx,int dy)
	{
		A.tinhTien(dx, dy);
		B.tinhTien(dx, dy);

		
	}
	public float doDai()
	{
		return A.khoangCach(B);
	}
	public float goc()
	{
		return (float)Math.acos((Math.abs(B.giaTriX()-A.giaTriX())/Math.sqrt(Math.pow(B.giaTriX()-A.giaTriX(), 2)+Math.pow(B.giaTriY()-A.giaTriY(),2 ))));
	}

}
