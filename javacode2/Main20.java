// 買火車票找錢程式
public class Main20 {

	public static void main(String[] args) {
		// 台中到台北火車票 183
		// 買 2 張
		// 付款金額 1000 元
		// 試問要找多少? 如何找(可以找紙幣與硬幣)?
		int ticket = 183; // 車資
		int amount = 2;   // 數量
		int cash = 1000;  // 付款金額
		int change = cash - (ticket * amount); // 找錢

		System.out.printf("車票:$%d 數量:$%d 付款:$%d 找錢:$%d%n", ticket, amount, cash, change);
		int fiveHundred = change / 500; // 張
		change = change % 500; // 剩餘

		int oneHundred = change / 100; // 張
		change = change % 100; // 剩餘

		int fifty = change / 50; // 枚
		change = change % 50; // 剩餘
		
		int ten = change / 10; // 枚
		change = change % 10; // 剩餘
		
		int five = change / 5; // 枚
		change = change % 5; // 剩餘
		
		int one = change;
		System.out.println("===========");
		System.out.printf("500元: %d 張%n", fiveHundred);
		System.out.printf("100元: %d 張%n", oneHundred);
		System.out.printf(" 50元: %d 枚%n", fifty);
		System.out.printf(" 10元: %d 枚%n", ten);
		System.out.printf("  5元: %d 枚%n", five);
		System.out.printf("  1元: %d 枚%n", one);
		System.out.println("===========");
	}

}