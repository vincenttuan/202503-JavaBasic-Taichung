public class Main15 {
	public static void main(String[] args) {
		// 飲料一瓶 10 元
		// 買四送三
		// 試問買 8 瓶要花多少錢
		int x = 4, y = 3; // 買 x 送 y
		int price = 10; // 飲料 10 元/瓶
		int amount = 8; // 購買數量
		//int bottles = (amount/7)*4 + (amount%7); // 需要支付的瓶數
		int bottles = (amount/(x+y))*x + (amount%(x+y)); // 需要支付的瓶數
		int cost = price * bottles; // 支付金額
		System.out.printf("飲料 %d 元 買 %d 送 %d%n", price, x, y);
		System.out.printf("購買 %d 瓶%n", amount);
		System.out.printf("需要支付的瓶數: %d 瓶%n", bottles);
		System.out.printf("需要支付的金額: %d 元%n", cost);

	}
}