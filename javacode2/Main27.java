import java.util.Random;

public class Main27 {
	public static void main(String[] args) {
		// 四星彩
		// 請印出 4 組 0~9 的隨機數
		Random r = new Random();
		int num1 = r.nextInt(10);
		int num2 = r.nextInt(10);
		int num3 = r.nextInt(10);
		int num4 = r.nextInt(10);

		System.out.printf("四星彩電腦選號 本期頭獎 12 萬 號碼是: %d %d %d %d %n", 
			num1, num2, num3, num4);
		
	}
}