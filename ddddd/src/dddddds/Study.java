package dddddds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Study implements Comparable<Study> {

	int age; // 나이
	
	public Study(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Study o) {
		if (this.age == o.age) {
			System.out.println("동갑이네요~");
			return 1;
		} else if (this.age < o.age) {
			System.out.println("오 형이시네요 ㅋㅋ");
			return 0;
		} else {
			System.out.println("내가 형이네 ㅋㅋ");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		Study a = new Study(26);
		Study b = new Study(27);
		
		a.compareTo(b);
		
		Comparable<Integer> age = new Comparable<Integer>() {
			
			int age = 10; // 나이
		
			@Override
			public int compareTo(Integer o) {
				if (age == o) {
					System.out.println("동갑이네요~");
					return 1;
				} else if (age < o) {
					System.out.println("오 형이시네요 ㅋㅋ");
					return 0;
				} else {
					System.out.println("내가 형이네 ㅋㅋ");
					return -1;
				}
			}
		};
		
		age.compareTo(10);
		
		// compareTo();
		// Comparable<T>는 "자기 자신과 매개변수 객체를 비교"
		// Comparator<T>는 "두 매개변수 객체를 비교" 그리고 반드시 임포트 필요, 인터페이스아닌 객체로 생성하는 점을 유의
		// static <T extends Comparable<? super T>> Comparator<T>
		// <?> : 언바운드 와일드카드 타입, Unbouded : 한이 없는, 무한한 곧 제한없다는 의미
		// <?> : 메소드 매개변수의 자료형에 사용되는 제네릭, 즉 어떤 자료형의 객체도 매개변수로 받겠다는 의미
		// <?> = <? extends Object>의 줄임 표현이자
		
	}

}
/*
 * int compare(T o1, T o2) 전달된 두 객체의 순서를 비교함. boolean equals(Object obj) 해당
 * comparator와 전달된 객체가 같은지를 확인함. default Comparator<T> reversed() 해당 comparator의
 * 역순인 comparator를 반환함.
 */