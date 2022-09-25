package buoi3;
import java.util.Scanner;

import buoi2.Datee;
public class Sinhvien {

	private String MSSV,Ten;
	private Datee ns;
	private int SL;
	private String tenHP[],DiemHP[];

	public Sinhvien() {
		MSSV=new String();
		Ten=new String();
		ns= new Datee();
		SL= 0;
		tenHP=new String[SL];
		DiemHP=new String[SL];
	}

	public Sinhvien(String ms, String name, Datee nam, int sl) {
		MSSV= ms;
		Ten= name;
		ns= new Datee(nam);
		SL= sl;
		String[] tenHP= new String[SL];
		String[] DiemHP= new String[SL];
		for(int i=0;i<SL;i++) {
			tenHP[i]=new String();
			DiemHP[i]=new String();
		}
	}

	public Sinhvien(Sinhvien s) {
		MSSV=new String(s.MSSV);
		Ten=new String(s.Ten);
		ns= new Datee(s.ns);
		SL=s.SL;
		tenHP=new String[50];
		DiemHP=new String[50];
		for(int i=0;i<SL;i++) {
			tenHP[i]=new String(s.tenHP[i]);
			DiemHP[i]=new String(s.DiemHP[i]);
		}
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MSSV: ");
		MSSV=sc.nextLine();
		System.out.println("Nhap ho ten: ");
		Ten=sc.nextLine();
		System.out.println("Nhap ngay/ thang/ nam sinh: ");
		ns.NhapNgay();
	}

	public void dKy() {
		Scanner sc = new Scanner(System.in);
		SL = sc.nextInt();
		sc.nextLine();
		for( int i = 0; i < SL; i++) {
			System.out.println("nhap mon thu:"+(i+1)+":");
			tenHP[i]= sc.nextLine();
		}
	}
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		for( int i = 0; i < SL; i++) {
			System.out.println("Nhap diem mon hoc:"+tenHP[i]+":");
			DiemHP[i]= sc.nextLine();
		}
	}
	public String toString() {
		String s = MSSV+","+Ten+","+ns;
		for (int i = 0; i < SL; i++)
			s += tenHP[i]+":"+DiemHP[i]+","; 		
		return "["+s+"]";
	}
	public float dTB() {
		float d = 0.0f;
		for(int i = 0; i < SL;i++)
			if(DiemHP[i].equals("A"))
				d += 4;
			else if(DiemHP[i].equals("B+"))
				d += 3.5;
		return d/SL;
	}
	public void themHP(String ten, String d) {
		if(SL < tenHP.length-1) {
			tenHP[SL] = new String(ten);
			DiemHP[SL] = new String(d);
			SL++;
		}
	}

	public void xoaHP(String ten) {
		int pos=-1;
		for(int i=0;i<SL;i++)
			if(tenHP[i].equals(ten)) {
				pos=i;
				break;
			}
		if((pos!=-1)) {
			for(int i=pos;i<SL-1;i++) {
				tenHP[i]=tenHP[i+1];
				DiemHP[i]=DiemHP[i+1];
			}
			SL--;
		}
	}

	public String layTen() {
		String h=Ten.trim();
		return h.substring(h.lastIndexOf("")+1);
	}
	
}
