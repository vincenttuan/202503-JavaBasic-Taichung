public class Main8 {
	public static void main(String[] args) {
		// printf 的使用
		int salaryOfMonth = 88000; // 月薪
		int months = 12; // 一年的月份
		// 請計算出年薪
		int salaryOfYear = salaryOfMonth * months; 
		System.out.printf("月薪: %,d 年薪: %,d%n", salaryOfMonth, salaryOfYear);

		System.out.println("月薪: " + salaryOfMonth + " 年薪: " + salaryOfYear);
	}
}