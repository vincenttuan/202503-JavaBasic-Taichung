public class Main29 {

	public static void main(String[] args) {
		int x = 0;
		while(x < 10) {
			x++;

			if(x == 8) {
				break;
			}

			if(x % 3 == 0) {
				continue;
			}

			System.out.println(x);
		}
	}

}