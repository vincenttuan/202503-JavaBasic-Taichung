public class Main11 {
	public static void main(String[] args) {
		// 計算 bmi
		// w 體重(kg) h 身高(m)
		// 公式 bmi = w / (h*h)
		double w = 60;
		double h = 1.7;
		double bmi = w / (h*h);
		System.out.printf("身高 %.1f m 體重 %.1f kg BMI %.2f%n", h, w, bmi);
		// 身高改用 cm 顯示
		System.out.printf("身高 %.1f cm 體重 %.1f kg BMI %.2f%n", h*100, w, bmi);
		System.out.printf("身高 %.1f 公分 體重 %.1f 公斤 BMI %.2f%n", h*100, w, bmi);
	}
}