package class2;
import java.util.Scanner;

import buoi2.Diem;

public class DDiemMau extends Diem {
	private String mau;
	
	public DDiemMau() {
		// x=0; y=0;		vi phạm tính bao gói
		super();	//Diem()
		mau = new String();
	}
	
	public DDiemMau(int x1, int y1, String m) {
		super(x1,y1);	//Diem(x1, y1)
		mau = new String(m);
	}
	
	public DDiemMau(DDiemMau dm) {	//dm(x, y, mau)
		super(dm);	//Diem(Diem d)
		mau = new String(dm.mau);
	}
	
	public void nhapDiemM() {
		Scanner sc = new Scanner(System.in);
		// x=sc.nextInt();		vi pham tinh bao goi
		super.nhap();		//Diem.nhap();
		System.out.println("\n Nhap mau:");
		mau = sc.nextLine();
	}
	
	public void in() {
		super.in();	// Diem.in()
		System.out.println(", mau: " + mau);
	}
	
	public String toString() {
		return(super.toString() +", mau " + mau);
	}
	
	public void ganMau(String mau) {
		mau = new String();
	}

}
