package elseHDT;		//bài trên else
import java.util.Scanner;

public class SSoNguyenTo {

	static boolean ktraSoNguyenTo(int n){
		 if(n<2) {
			 return false;
		 }
	    for(int i =2; i<=Math.sqrt(n);i++){
	       if(n%i == 0){
	           return false;
	       }
	    }
	           return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(ktraSoNguyenTo(n))
		{
			System.out.print("n là số nguyên tố\n");
		}
		else
			System.out.print("n không là số nguyên tố\n");
			System.out.print(Integer.toBinaryString(n));
	}
}