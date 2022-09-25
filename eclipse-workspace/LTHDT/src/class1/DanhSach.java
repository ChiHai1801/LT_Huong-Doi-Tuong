package class1;

import java.util.Scanner;

public class DanhSach {

	int a[];
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử: ");
		int n = sc.nextInt();
		a = new int [n];
		for(int i=0; i<n; i++)
		{
			System.out.println("Nhập phần tử thứ "+(i+1));
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
		int temp;
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
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
		// TODO Auto-generated method stub
		DanhSach t = new DanhSach();
		t.nhap();
		System.out.println("\nMảng vừa nhập là: ");
		t.hienthi();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhập số cần đếm: ");
		int n = sc.nextInt();
		System.out.println("Số lượng phần tử "+ n +" có trong mảng là: " + t.dem(n));
		t.sapxep();
		System.out.println("Mảng vừa sắp xếp là: ");
		t.hienthi();
	}
}

