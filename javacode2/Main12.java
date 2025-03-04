public class Main12 {

	public static void main(String[] args) {
		int score = 88;
		boolean pass = score >= 60;
		System.out.println("成績 = " + score + " 及格 = " + pass);
		// %b 用來放 boolean 資料
		System.out.printf("成績 = %d 及格 = %b%n", score, pass);
	}

}