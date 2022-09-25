package elseHDT;	//else

public class Solonnhat {

	public static void main(String[] args) {
		double n, tong = 0;
		double max = Double.MIN_VALUE;
		for (String e : args) {
			try {
				n= Double.parseDouble (e);
			}
			catch(NumberFormatException ex) {
				n=0;
			}
			tong+=n;
			if (max<n) {
				max=n;
			}	
		}
		System.out.println("Tổng = " + tong + ", max =" + max);
	}
}

