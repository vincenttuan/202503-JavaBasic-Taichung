import java.util.Random;
public class Main28 {

	public static void main(String[] args) {
		// 我想要產生 10 組 0~99 的亂數
		Random r = new Random();
		int count = 10;
		while(count > 0) {
			//System.out.println(count);
			int num = r.nextInt(100); // 0~99
			System.out.println(num);
			count--;
		}

	}
}