package buoi2;
import java.util.Scanner;
public class Diem {

		private int x;
		private int y;

		public Diem(){
			x = 0;
			y = 0;
		}

		public Diem(int x1, int y1) {
			x = x1;
			y = y1;
		}

		public void tinhTien(int dx, int dy) {
			x += dx;
			y += dy;
		}
		public Diem(Diem d) {
			x = d.x;
			y = d.y;
		}

		public void nhap() {
			Scanner sc = new   Scanner(System.in); 
			System.out.println("nhap vao hoanh do X: ");
			x = sc.nextInt();
			System.out.println("nhap vao tung do Y: ");
			y = sc.nextInt();
			sc.close();
		}

		public void HienThi() {
			System.out.println("("+ x +","+ y +")");
		}

		public int giaTrix() {
			return x;
		}

		public int giaTriy() {
			return y;
		}

		public float khoangCach () {
			return (float) Math.sqrt(x * x + y * y);
		}

		public float khoangCach(Diem B) {
			return (float) Math.sqrt((x - B.x)*(x - B.x)+(y - B.y) * (y - B.y));
		}
		public void ganx(int x1) {
			x = x1;
		}
		public void gany(int y1) {
			x = y1;
		}
		public void gan(int x1, int y1) {
			x = x1;
			y = y1;
		}

	}
