package class1;
import java.util.Scanner;
public class SoNguyenToT {
	boolean kiemtranguyento(int n){
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
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		System.out.printf("Nhap so nguyen to:");
		int n = sc.nextInt();
		SoNguyenToT snt = new SoNguyenToT();
		if(snt.kiemtranguyento(n)){
			System.out.printf("So " +n +" la so nguyen to co dang nhi phan la: "+Integer.toBinaryString(n));
		}
		else{
			System.out.printf("So " +n +" khong phai la so nguyen to co dang nhi phan la: "+Integer.toBinaryString(n));
		}
	}
}



/*boolean kiemtranguyento(int n){
   if(n<2) {
  	 return false;
   }
  for(int i =2; i<=Math.sqrt(n);i++){
    if(n%i == 0){
        return false;
    }
  }
        return true;
  }*/