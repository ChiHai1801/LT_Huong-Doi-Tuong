package buoi1;		// bai:5

import java.util.Scanner;

public class GPTBac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		System.out.print("\nNhập b: ");
		int b = sc.nextInt();
		if(a==0)
		{
			if(b==0)
				System.out.println("\nPhương trình vô số nghiệm.");
			else 
				System.out.println("Phương trình vô nghiêm.");
		}
		else
			System.out.println("Phương trình có nghiệm = " + ((float)-b/a));
	}
}

