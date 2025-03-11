// 販賣機找零錢程式
public class Main19 {

	public static void main(String[] args) {
		// 硬幣有 50, 10, 5, 1 四種
		// 飲料一瓶 23 元, 付款 100 元
		// 試問要找多少錢 ? 如何找 ?
		int price = 23; // 飲料
		int cash = 100; // 現金
		int change = cash - price; // 找錢
		System.out.printf("飲料:$%d 付款:$%d 找錢:$%d%n", price, cash, change);
		// 如何找 ?
		// 50 元要找幾個 ?
		int fifty = change / 50; // 77/50=1 枚
		System.out.printf("50元: %d 枚%n", fifty);
		change = change % 50; // 77%50=27 (剩餘)
		
		// 10 元找幾個 ?
		int ten = change / 10; // 27/10=2 枚
		System.out.printf("10元: %d 枚%n", ten);
		change = change % 10; // 27%10=7 (剩餘)

		// 5 元找幾個 ?
		int five = change / 5; // 7/5=1 枚
		System.out.printf(" 5元: %d 枚%n", five);
		change = change % 5; // 7%5=2 (剩餘)	

		// 1 元找幾個
		int one = change; // 2 枚
		System.out.printf(" 1元: %d 枚%n", one);

	}

}