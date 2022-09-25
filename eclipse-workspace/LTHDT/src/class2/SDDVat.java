package class2;

import java.util.Scanner;

public class SDDVat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVat a;
		a = new Bo();
		a.Keu();
		// danh sach DVat Bo, Heo, De
		DVat dv[];
		char c = ' ';
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap so dong vat: ");
		int n = sc.nextInt();
		dv = new DVat[n];
		for(int i=0;i<n;i++) {
			System.out.println("ban nhap con bo (B), Heo (H), De(D), Meo(M): ");
			c = sc.next().charAt(0);
			if(c == 'B')
				dv[i] = new Bo();
			else
				if(c == 'H')
					dv[i] = new Heo();
				else
					if(c == 'M')
						dv[i] = new Meo();
				else dv[i] = new De();
			dv[i].nhapDVat();
		}
		for(int i =0; i<n;i++) {
			dv[i].in();
			dv[i].Keu();
		}
	}

}
