package dddddds;

import java.util.ArrayList;
import java.util.Iterator;

public class damda {
	// 람다식 : 간단히 말하자면 메소드를 하나의 식으로 표현하는 것!
	
	// 원래 우리는 이렇게 메소드 작성했어요
	public int sum(int x, int y) {
		return x + y;
	}
	
	
	
	public static void main(String[] args) {
		// 우리는 원래 만약에 이렇게 작성하고 있어요
		// Collection<> 이거 저도 처음 써보지만 그래도 작성해볼게요
		// 왜 안되지 그냥 ArrayLlist로 선언할게요
		// 람다식 함수는 21라인부터 같은 기능이라고 생각하시면 돼요
		//
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("김진원");
		al.add("박영연");
		al.add("황인기");
		
		System.out.println("이터레이터 사용");
		
		// 이터레이터는 al의 요소를 여러 개 불러오는 메서드
		// 이터레이터는 컬렉션(Arraylist, Map 등)에 있는 요소를 불러오기 위한 의미
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			// al.iterator() : 이게 for문안에 있어서 마치 무한루프로 돌린다고 보면 돼요
			// 근데 옆에 있는 iterator.hasNext()가 false가 나오면
			// 무한루프가 종료시켜요
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("기존 for문 사용");
		// for문으로 작성한 여러 개 호출 메서드
		for (int m = 0; m < al.size(); m++) {
			System.out.println(al.get(m));
		}
		
		System.out.println("java8부터 만들었던 람다식 함수 사용");
		// 이 메소드를 람다식 표현하면 ( 매개변수 ) -> { 표현식 };
		al.forEach(m -> System.out.print(m));
		
		// 코드상 낯설고 다르지만 기능이 똑같다고 보면 될거 같아요
	}

}
