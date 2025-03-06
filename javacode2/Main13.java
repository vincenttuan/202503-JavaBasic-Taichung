public class Main13 {
	public static void main(String[] args) {
		// 假設一台車可以乘坐 4 人
		// 試問: 10 個人要乘坐幾台車
		int person = 10;
		int car = person / 4;
		int remain = person % 4;
		System.out.printf("剩餘人數 %d%n", remain);
		// 若剩餘人數 > 0 要多加一台車
		if(remain > 0) {
			//car = car + 1;
			car += 1;
			//car++;
		}

		System.out.printf("%d 台車%n", car);

	}
}