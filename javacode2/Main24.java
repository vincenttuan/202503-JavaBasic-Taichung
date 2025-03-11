public class Main24 {
	public static void main(String[] args) {
		String id = "A123456789";
		//           0123456789 <-- 位置
		char gender = id.charAt(1);
		System.out.println(gender);
		switch(gender) {
			case '1':
				System.out.println("男性");
				break;
			case '2':
				System.out.println("女性");
				break;
			default:
				System.out.println("性別錯誤");
		}
	}
}