public class Main18 {

	public static void main(String[] args) {
		// Math 類可以用來使用許多常見的數學公式
		System.out.printf("圓周率 %f%n", Math.PI);
		System.out.printf("指數 2 的 3 次方 = %.1f%n", Math.pow(2, 3));
		System.out.printf("開根號 9 開根號 = %.1f%n", Math.sqrt(9));
		System.out.printf("四捨五入 4.5 = %d%n", Math.round(4.5));
		System.out.printf("無條件進入 4.1 = %.1f%n", Math.ceil(4.1));
		System.out.printf("無條件捨去 4.9 = %.1f%n", Math.floor(4.9));
		System.out.printf("浮點數轉整數 4.9 = %d%n", (int)(4.9));
		System.out.printf("絕對值 -4.9 = %.1f%n", Math.abs(-4.9));
		System.out.printf("取最大 (15, 25) = %d%n", Math.max(15, 25));
		System.out.printf("取最小 (15, 25) = %d%n", Math.min(15, 25));
		// 計算二點間的距離
		// A(x1, y1) B(x2, y2)
		// 若 A點座標(10, 20) B點座標(15, 35)
		// 求 AB 的距離
		int x1 = 10, y1 = 20;
		int x2 = 15, y2 = 35;

		double dx = Math.pow(x1-x2, 2);
		double dy = Math.pow(y1-y2, 2);

		double d = Math.sqrt(dx + dy);

		System.out.println(d);

	}

}