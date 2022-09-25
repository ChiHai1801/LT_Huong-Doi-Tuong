package buoi1;		// bai:6
import java.util.Scanner;

public class SoNguyenTo {
    public static boolean laSoNguyenTo(int n) {
	if(n<=1)
	    return false;
	else
	    for (int i=2; i<n; i++)
		if(n%i == 0)
		    return false;
	return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n:");
        int n = sc.nextInt();
        if(laSoNguyenTo(n)){
	    System.out.print(n + " la so nguyen to\n" + "Nhi phan cua " + n + " la ");
	    System.out.print(Integer.toBinaryString(n));
	    
	}
	else
	    System.out.print(n + " khong la so nguyen to");
    }
}

