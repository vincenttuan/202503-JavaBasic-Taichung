public class Main14 {

	public static void main(String[] args) {
		// 飲料一瓶 10 元
		// 買一送一
		// 試問買 9 瓶要花多少錢
		int price = 10; // 飲料 10 元/瓶
		int amount = 9; // 購買數量
		int bottles = amount/2 + amount%2; // 需要支付的瓶數
		int cost = price * bottles; // 支付金額
		System.out.printf("需要支付的瓶數: %d 瓶%n", bottles);
		System.out.printf("需要支付的金額: %d 元%n", cost);
			
	}

}