public class Main25 {
	public static void main(String[] args) {
		String id = "A183456789";
		//           0123456789
		// 請印出第三碼身份碼的意義
		//0 ~ 5	臺灣出生之本籍國民
		//  6	入籍國民，原為外國人
		//  7	入籍國民，原為無戶籍國民
		//  8	入籍國民，原為香港居民或澳門居民
		//  9	入籍國民，原為大陸地區居民
		int identityCode = id.charAt(2);

		// Java 11(含) 以前的寫法
		switch(identityCode) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
				System.out.println("臺灣出生之本籍國民");
				break;
			case '6':
				System.out.println("入籍國民，原為外國人");
				break;
			case '7':
				System.out.println("入籍國民，原為無戶籍國民");
				break;
			case '8':
				System.out.println("入籍國民，原為香港居民或澳門居民");
				break;
			case '9':
				System.out.println("入籍國民，原為大陸地區居民");
				break;
		}

		// Java 12 新語法
		switch(identityCode) {
			case '0', '1', '2', '3', '4', '5':
				System.out.println("臺灣出生之本籍國民");
				break;
			case '6':
				System.out.println("入籍國民，原為外國人");
				break;
			case '7':
				System.out.println("入籍國民，原為無戶籍國民");
				break;
			case '8':
				System.out.println("入籍國民，原為香港居民或澳門居民");
				break;
			case '9':
				System.out.println("入籍國民，原為大陸地區居民");
				break;
		}
	}
}