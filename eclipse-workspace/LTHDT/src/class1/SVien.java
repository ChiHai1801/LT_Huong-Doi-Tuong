package class1;		// Th. Cang
import java.util.Scanner;
import buoi2.Date;
public class SVien {

	private String mssv,hten;
	private Date ngaySinh;
	private int Soluong;
	private String tenHP[],diemHP[];

	public SVien() {
		mssv=new String();
		hten=new String();
		ngaySinh=new Date();
		Soluong=0;
		tenHP=new String[100]; // svien có thể học tối đa 100 môn học
		diemHP=new String[100];
	}

	public SVien(String ms, String name, Date nam, int sl) {
		mssv = new String (ms);
		hten = new String (name);
		ngaySinh = new Date(nam);
		Soluong= sl;
		tenHP= new String[100];
		diemHP= new String[100];

	}

	public SVien(SVien s) {
		mssv=new String(s.mssv);
		hten=new String(s.hten);
		ngaySinh= new Date(s.ngaySinh);
		Soluong=s.Soluong;
		tenHP=new String[100];
		diemHP=new String[100];

		// sao chep cac mon hoc
		for(int i=0; i < Soluong; i++) {
			tenHP[i]=new String(s.tenHP[i]);
			diemHP[i]=new String(s.diemHP[i]);
		}
	}

	// nhap thong tin co ban cho sinh vien
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap MSSV: ");
		mssv=sc.nextLine();
		System.out.println(" Nhap ho ten: ");
		hten=sc.nextLine();
		System.out.println(" Nhap ngay/ thang/ nam sinh: ");
		ngaySinh.NhapNgay();
	}

	public void in() {		
		System.out.println("[" + mssv + "," + hten + "," + ngaySinh);
		for(int i = 0;i < Soluong; i++) {
			System.out.println("," + tenHP[i] +":" + diemHP[i]);
		}
		System.out.println("]");
	}

	public String toString() {
		String s =("[" + mssv + "," + hten + "," + ngaySinh);
		for(int i = 0;i < Soluong; i++) {
			s += "," + tenHP[i] +":" + diemHP[i];
		}
		s += "]";
		return s;
	}

	public void themHP(String ten,String d) {
		if(Soluong < tenHP.length-1) {
			tenHP[Soluong] = new String (ten);
			tenHP[Soluong] = new String (d);
			Soluong++;
		}
		else  System.out.println("\n Mang day, khong the them ");
	}

	public void xoa(String ten) {
		int i = 0;
		// do tim trong danh sach mon hoc de xac dinh vi tri thu i
		for( i = 0;i<Soluong;i++)
			if(tenHP[i].equals(ten)) break;

		if((i < Soluong)) { // tim thay o vi tri thu i
			// sao chep don tu vi tri i => xoa mon vi tri i
			for(int j=i; j < Soluong-1; j++) {
				tenHP[i]=tenHP[j+1];
				diemHP[i]=diemHP[j+1];
			}
			Soluong--; 	// giam so mon
		}
	}			

	public void dangKyMH() {
		Scanner sc = new Scanner(System.in);
		String ten ="";
		//System.out.println(" Nhap ten mon, ket thuc voi chuoi stop");
		do {
			System.out.println(" Nhap ten mon: ");
			ten = sc.nextLine();
			if(! ten.equals("stop")) themHP(ten , "");
		}while (ten.equals("stop"));
	}

	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		String diem ="";
		for(int i = 0; i < Soluong; i++) {
			System.out.println("Nhap diem mon hoc " + tenHP[i] + ":");
			tenHP[i] = sc.nextLine();
		}
	}

	public float diemTB() {
		float d = 0.0f;
		for(int i =0; i < Soluong; i++)	{
			if(diemHP[i].equals("A"))

				d+=4f;

			else if(diemHP[i].equals("B+"))
				d+=3.5f;

			else if(diemHP[i].equals("B"))
				d+=3f;

			else if(diemHP[i].equals("C+"))
				d+=2.5f;

			else if(diemHP[i].equals("C"))
				d+=2f;

			else if(diemHP[i].equals("D+"))
				d+=1.5f;

			else if(diemHP[i].equals("D"))
				d+=1f;

			else if(diemHP[i].equals("F"))
					d+=0;
		}
		return d/Soluong;
	}

}

