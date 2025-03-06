public class Main16 {

	public static void main(String[] args) {
		// 飲料一瓶 35 元
		// 第二件 10 元
		// 試問買 5 瓶要花多少錢
		int price = 35;
		int discountPrice = 10;
		int amount = 5;
		int total = (amount / 2)*(price + discountPrice) + (amount % 2)*price;
		System.out.printf("應支付 %d 元%n", total);
	}

}