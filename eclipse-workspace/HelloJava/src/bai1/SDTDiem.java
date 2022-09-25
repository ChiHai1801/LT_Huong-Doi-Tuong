package bai1;

public class SDTDiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TDiem F = new TDiem(3,4);
		System.out.println("F");
		F.in();
		
		TDiem D = new TDiem();
		D.nhap();
		System.out.println("D");
		D.in();
		
		TDiem I = new TDiem(-D.laygiatrin(),-D.laygiatrim());
		System.out.println("\nI");
		I.in();
		
		System.out.println("\nkhoang cach tu D dan O la: "+D.khoangCach());
		System.out.println("\nkhoang cach tu F dan D la: "+F.khoangCach(D));
	}

}
