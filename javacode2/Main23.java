public class Main23 {
	public static void main(String[] args) {
		/* 
			成績 level 判斷
			90~100 印出 A
			80~89  印出 B
			70~79  印出 C
			60~69  印出 D
			 0~59  印出 F
			其餘   印出 成績錯誤
		*/
		int score = 82; // 成績
		// 請印出 level
		if(score >= 90 && score <= 100) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else if(score >= 60 && score < 70) {
			System.out.println("D");
		} else if(score >= 0 && score < 60) {
			System.out.println("F");
		} else {
			System.out.println("成績錯誤");
		}
	}
}