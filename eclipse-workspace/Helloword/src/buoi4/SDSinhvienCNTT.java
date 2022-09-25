package buoi4;

import java.util.Scanner;
import buoi3.Sinhvien;
public class SDSinhvienCNTT {
	
	

		public static void main(String[] args) {
		    Scanner sc = new Scanner (System.in);
		    int n;
		    char c =' ';
		    Sinhvien ds[];
		    System.out.println("nhap so sinh vien: ");
		    n = sc.nextInt();
		    sc.nextLine();
		    ds = new Sinhvien[n+1];
		    for(int i =0; i<n; i++) {
		    	System.out.println("nhap thong tin cho Sinhvien(s) cho SinhvienCNTT(c)");
		    	c= sc.nextLine().charAt(0);
		    	if(c=='s')
		    		ds[i] = new SinhvienCNTT();
		    	else ds[i] = new SinhvienCNTT();
		    	ds[i].nhap();
		    	boolean Value = false;
		    	while(!Value) {
		    		System.out.println("Lua chon:");
		    		System.out.println("1. Sinhvien");
		    		System.out.println("2. Sinh vien cong nghe thong tin");
		    		String x;
		    		x = sc.nextLine();
		    		
		    		if(x.equals(1)) {
		    			ds[i] = new Sinhvien();
		    			Value = true;
		    		}
		    		else
		    			if(x.equals(2)) {
		    				ds[i] = new SinhvienCNTT();
		    				Value = true;
		    			}
		    			else System.out.println("khong ton tai lua chon. chuong trinh loi !!!");
		    	}
		    	System.out.println("nhap thong tin sinh vien"+ (i+2)+":");
		    	ds[i].nhap();
		    }
		    sc.nextLine();
		    
		    for(int i =0; i< n;i++)
		    	System.out.println(ds[i]);
		    String email = new String();
		    //lay email
		    System.out.println("nhap email sinh vien can tim: ");
		    email = sc.nextLine();
		    for(int i=0;i<n ;i++) {
		    	if(ds[i].layTen().equalsIgnoreCase(email)) {
		    		System.out.println("sinh vien can tim tai khoan: "+ ds[i].layTen());
		    		ds[i].toString();
		    		break;
		    	}
		    	else
		    		System.out.println("khong tim thay tai khoan: ");
		    }
   }
}