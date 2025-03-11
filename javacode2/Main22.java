public class Main22 {

	public static void main(String[] args) {
		// bmi 診斷
		// bmi > 23 過重
		// bmi <= 18 過輕
		// 其餘正常 bmi > 18 && bmi <= 23 
		double h = 170.0/100; // 身高(m)
		double w = 60.0; // 體重(kg)
		double bmi = w / (h*h);
		System.out.printf("BMI: %.2f%n", bmi);
		System.out.printf("診斷: ");
		// Case1:
		if(bmi > 23) {
			System.out.println("過重");
		}
		if(bmi <= 18) {
			System.out.println("過輕");	
		}
		if(bmi > 18 && bmi <= 23) {
			System.out.println("正常");
		}
		// Case2:
		if(bmi > 23) {
			System.out.println("過重");
		} else if(bmi <= 18) {
			System.out.println("過輕");	
		} else {
			System.out.println("正常");
		}
	}
}