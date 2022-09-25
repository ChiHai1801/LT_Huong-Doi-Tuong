package bai1; // câu: 5

import java.util.Scanner;

public class GPTrinh {

		public static void gptb1(float a, float b) { // ax + b = 0
	    //giai phuong trinh
		}
		public static void gptb2(float a, float b, float c) {// ax2+bx+c=0
		if(a==0)	gptb1(b,c);
		else {
			float delta =(float) (Math.pow(b, 2)-4*a*c);
			if(delta > 0) delta = (float)Math.sqrt(delta);
			// giai phuong trinh bac 2
		}
	}
			public static void main(String[] args) {
			GPTrinh p = new GPTrinh();
			Scanner sc = new Scanner(System.in);
			System.out.println("\n nhap he so a=");
			float a = sc.nextFloat();
			System.out.println("\n nhap he so b=");
			float b = sc.nextFloat();
			System.out.println("\n nhap he so c=");
			float c = sc.nextFloat();
			p.gptb2(a, b, c);
	}
			
		    public static void GPTBac2(float a, float b, float c) {
		        if (a == 0) {
		            if (b == 0) {
		                System.out.println("Phương trình vô nghiệm!");
		            } else {
		                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
		            }
		            return;
		        }

		        float delta = b*b - 4*a*c;
		        float x1;
		        float x2;
		        if (delta > 0) {
		            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
		            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
		            System.out.println("Phương trình có 2 nghiệm là: "
		                    + "x1 = " + x1 + " và x2 = " + x2);
		        } else if (delta == 0) {
		            x1 = (-b / (2 * a));
		            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		        } else {
		            System.out.println("Phương trình vô nghiệm!");
		        }
		}
}
