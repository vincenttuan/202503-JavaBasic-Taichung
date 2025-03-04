public class Main9 {
	public static void main(String[] args) {
		// 浮點數
		double r = 10; // 半徑
		System.out.println("半徑: " + r);
		// %f    表示格式化浮點數
		// %.1f  表示格式化浮點數到小數點第一位
		// %.2f  表示格式化浮點數到小數點第二位
		// %,.2f 表示格式化浮點數到小數點第二位並且有千分號
		// %n    換行符號
		System.out.printf("半徑: %f%n", r);
		System.out.printf("半徑: %.1f%n", r);
		// 請幫我算圓面積與球體積
		double pi = 3.1415926;
		double area = pi * r * r;
		double volume = 4/3.0 * pi * r * r * r;
		System.out.printf("圓面積: %,.2f 球體積: %,.2f%n", area, volume);
	}
}