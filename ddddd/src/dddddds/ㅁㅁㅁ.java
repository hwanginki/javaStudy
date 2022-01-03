package dddddds;

public class ㅁㅁㅁ {

	public static void main(String[] args) {
		// 1. 숫자 비교
		int x2 = 1;
		int y2 = 2;
		// 비교가 x가 크면 1, 같으면 0, x가 작으면 -1
		System.out.println(Integer.compare(x2, y2));

		// int 형타입 대신 Integer 타입도 사용 가능
		Integer x = 1;
		Integer y = 2;
		
//		System.out.println(x.compareTo(y));
		
		char alpabet = 'a';
		int ialpabet = (int) alpabet;
		
//		System.out.println(">>>" + ialpabet);
		
		
		// 2. 문자열 비교(아스키코드 값을 사용됨 이유는 compare의 int 타입 사용하기 때문에 아스키코드 기준으로 변환
		String str = "ab";
		
//		System.out.println(Integer.parseInt(""));
		System.out.println(str.compareTo("abc"));
		
	}

}
