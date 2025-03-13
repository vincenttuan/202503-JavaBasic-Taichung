import java.util.Random;
public class Main30 {

	public static void main(String[] args) {
		Random r = new Random();

		do {
			// 隨機產生 0~99 的數字
			// 若數字 = 0 則透過 break; 強制跳離迴圈
			int num = r.nextInt(100);
			System.out.println(num);
			if(num == 0) {
				break;
			}
		} while(true);


	}

}