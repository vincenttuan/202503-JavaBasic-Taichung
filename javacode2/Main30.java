import java.util.Random;
public class Main30 {

	public static void main(String[] args) {
		Random r = new Random();
		int count = 0; // 計數器
		int sum = 0; // 總和累計
		do {
			count++; // 計數器 + 1
			// 隨機產生 0~99 的數字
			// 若數字 = 0 則透過 break; 強制跳離迴圈
			int num = r.nextInt(100);
			// 數字印出
			System.out.printf("%03d -> %02d%n", count, num);
			// 數字累計
			sum = sum + num; // sum += num;
			if(num == 0) {
				break;
			}
		} while(true);
		System.out.printf("總和: %,d%n", sum);
		System.out.printf("平均: %,d%n", sum/count);
	}

}