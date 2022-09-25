package bai1; // câu: 3 th.cang

public class TongSo {

	/*Bài 3 : Viết chương trình nhận vào đối số dòng lệnh là 1 danh sách các số thực.
	  Hiển thị số lớn nhất và tổng của các số thực có trong danh sách đó. Chú ý loại 
	  trừ các số thực nhập vào không đúng định dạng.*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// args = {"7.5", "2.3" ,"20a1", "50"}	Double. 
		// >  		7.5		2.3		0	   50.0
		double tong = 0, n, max = Double.MIN_VALUE;// là giá trị hằng nhỏ nhất
		for(String e: args) {
			try { n = Double.parseDouble(e);}
			catch (NumberFormatException ex) {n = 0;}
			tong += n;
			if (max < n) max=n;
		}
		System.out.println("\n Tong = " + tong + "\n max = " + max);
	}
}
