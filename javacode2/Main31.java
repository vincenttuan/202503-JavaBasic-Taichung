import java.util.Random;

public class Main31 {
	public static void main(String[] args) {
		Random r = new Random();
		int min = 0, max = 99;
		int ans = r.nextInt(max + 1); // 隨機產生答案
		int count = 0;
		do {
			count++;
			// 自行撰寫一個 AI 演算法來猜數字
			int guess = (max + min)/2; // 利用二分法
			System.out.printf("次數:%d -> AI猜:%d%n", count, guess);
			if(guess > ans) {
				max = guess - 1;
			} else if (guess < ans) {
				min = guess + 1;
			} else {
				System.out.printf("猜中了 答案:%d%n", ans);
				break;
			}

		} while(true);

	}
}