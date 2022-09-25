package buoi1;	// bai: 5

import java.util.Scanner;

public class GPTBac2 {

	public static void gptBac1(float a, float b) {
		if(a==0)
		{
			if(b==0)
				System.out.println("\nPhương trình vô số nghiệm.");
			else 
				System.out.println("Phương trình vô ngiệm .");
		}
		else
			System.out.println("Phương trình có nghiệm = "+((float)-b/a));
	}
	public static void gptBac2(float a, float b, float c) {
		if (a==0) 
			gptBac1(b, c);
		else {
			float delta=b*b-(4*a*c);
			if(delta<0)
			{
				float x1=(float)(+Math.sqrt(Math.abs(delta))/(2*a));
				float x2=(float)(-Math.sqrt(Math.abs(delta))/(2*a));

				System.out.println("Phương trình có nghiệm x1 = " + (-b/(2*a)) + " +" +x1+ "i");
				System.out.println("Phương trình có nghiệm x2 = " + (-b/(2*a)) + " " +x2+ "i");
			}
			else if (delta==0)
				System.out.println("Phương trinh có nghiệm kép = " +(-b/(2*a)));
			else if (delta>0) {

				float x1=(float)((-b +Math.sqrt(delta))/(2*a));
				float x2=(float)((-b -Math.sqrt(delta))/(2*a));

				System.out.println("Phương trinh có nghiệm x1 = " +x1);
				System.out.println("Phương trinh có nghiệm x2 = " +x2);
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap b: ");
		float b = sc.nextFloat();
		System.out.println("Nhap c: ");
		float c = sc.nextFloat();
		GPTBac2.gptBac2(a, b, c);
	}
}
