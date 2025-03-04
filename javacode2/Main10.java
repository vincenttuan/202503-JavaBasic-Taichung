public class Main10 {
	public static void main(String[] args) {
		// 對日匯率(r) 0.2194
		// 台幣(twd)金額 50000
		// 請問可以兌換多少日幣(jpy) ?
		double r = 0.2194; // 匯率
		double twd = 50000; // 台幣
		double jpy = twd / r;
		System.out.println(jpy);
		System.out.println((int)jpy); // 將 double 轉 int
		System.out.printf("%,.0f%n", jpy);
		System.out.printf("%,d%n", (int)jpy);
		System.out.printf("台幣 NT %,.0f, 可換日幣 ¥ %,.0f%n", twd, jpy);
		System.out.printf("台幣 NT %,d, 可換日幣 ¥ %,d%n", (int)twd, (int)jpy);

	}
}