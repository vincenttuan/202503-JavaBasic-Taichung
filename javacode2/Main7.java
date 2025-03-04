public class Main7 {

	public static void main(String[] args) {
		int salary = 200_0000;
		System.out.println(salary);
		System.out.println("薪資: " + salary + " 元");
		// 利用 printf 格式化資料
		// %d  用來格式化整數資料
		// %,d 用來格式化整數資料會有千分號
		// %n  換行符號
		System.out.printf("薪資: %d 元%n", salary);
		System.out.printf("薪資: %,d 元%n", salary);

	}

}