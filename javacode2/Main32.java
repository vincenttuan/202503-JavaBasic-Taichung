import java.util.Random;

public class Main32 {

	public static void main(String[] args) {
		// 利用 for-loop 產生四星彩電腦選號
		Random r = new Random();
		for(int i=1;i<=4;i++) {
			int num = r.nextInt(10); // 0~9
			System.out.printf("第 %d 顆球 號碼: %d%n", i, num);
		}


	}

}