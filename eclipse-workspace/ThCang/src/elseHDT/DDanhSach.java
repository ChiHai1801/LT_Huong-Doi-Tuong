package elseHDT;

import java.util.Scanner;

public class DDanhSach {
	int a[];
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		int n = sc.nextInt();
		a = new int [n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
	}
	
	public int dem(int b) {
		int c = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==b)
				c++;
		}
		return c;
	}
	
	public void sapxep() {
		int x;
		for (int i = 0; i < a.length; i++) {
		    for (int j = a.length-1; j > i; j--) {
		        if (a[j] < a[j - 1])
				{
		        	x = a[i];
					a[i] = a[j-1];
					a[j-1] = a[j];
					a[j] = x;
				}
			}
		}
	}
	
	public void hienthi() {
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		DDanhSach t = new DDanhSach();
        t.nhap();
	//	System.out.println(t.dem(n));
    //	t.dem(n);
		t.sapxep();
		t.hienthi();
	}
}