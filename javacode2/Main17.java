public class Main17 {

	public static void main(String[] args) {
		// 飲料一瓶 35 元
		// 第二件 6 折
		// 試問買 5 瓶要花多少錢
		int price = 35;
		double discount = 0.6;
		int discountPrice = (int)(price * discount);
		System.out.printf("第一件飲料 %d 元%n", price);
		System.out.printf("第二件飲料 %.1f 折 %d 元%n", (discount*10), discountPrice);
		int amount = 5;
		int total = (amount / 2)*(price + discountPrice) + (amount % 2)*price;
		System.out.printf("購買 %d 瓶應支付 %d 元%n", amount, total);
	}

}