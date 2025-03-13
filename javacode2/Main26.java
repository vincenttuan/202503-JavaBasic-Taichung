import java.util.Random; // 載入一個 Random 類

public class Main26 {
	public static void main(String[] args) {
		// 隨機數(亂數, 在數學上不可預測/可預測)
		Random r = new Random(); // 建立一個 Random 物件, r 表示此物件的名稱
		System.out.println(r.nextInt()); // 隨機生成一個整數並印出
		System.out.println(r.nextInt(10)); // 隨機生成一個 0~9 的整數並印出
		System.out.println(r.nextInt(10) + 1); // 隨機生成一個 1~10 的整數並印出
		// 請問如何產生一個 11~15 的亂數
		System.out.println(r.nextInt(5) + 11); // 隨機生成一個 11~15 的整數並印出
		// 請問如何產生一個 90~100 的亂數
		System.out.println(r.nextInt(11) + 90);
	}
}