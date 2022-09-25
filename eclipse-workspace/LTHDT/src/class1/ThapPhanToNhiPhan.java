package class1;
import java.util.*;
public class ThapPhanToNhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Nhập số nguyên tố: ");
		int n = sc.nextInt();
		while (n != 0)
		{
			int d = n % 2;
			stack.push(d);
			n /= 2;
		}
		System.out.print("\nGiá trị nhị phân là: ");
		while (!(stack.isEmpty() ))
		{
			System.out.print(stack.pop());
		}
		
		
	}
}
