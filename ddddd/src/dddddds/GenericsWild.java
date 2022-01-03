package dddddds;

// <T>애가 클래스를 설정해줍니다.
class OrderedPair<K, V, E, 나이 extends Integer> {
	private K key;
	private V value;
	private E name;
	private 나이 age;
 
	public OrderedPair(K key, V value, E name, 나이 age) {
		this.key = key;
		this.value = value;
		this.name = name;
		this.age = age;
	}
 
	public K getKey() { 
		return key; 
	}
	
	public V getValue() { 
		return value; 
	}
	
	public E getName() {
		return name;
	}
	
	public 나이 getAge() {
		return age;
	}
}

public class GenericsWild {
	public static void main(String[] args) {
		OrderedPair<Integer, String, String, Integer> pair1
		= new OrderedPair<Integer, String, String, Integer>(1, "java", "김진원", 33);

		// 1.5 버전은 제네릭이 도입되었으나, 1.7 버전되니까 <>에 들어가있는 타입 생략 가능
//		OrderedPair<Integer, String, String> pair2 = new OrderedPair<>(2, "python", "박영연");
//		OrderedPair<Integer, String, String> pair3 = new OrderedPair<>(2, "C#", "황인기");
		System.out.println(pair1.getAge());
		
		//pair1과 pair2는 인터페이서 Pair 참조 변수로 선언되었다.
		//new OrderPair<String, Integer>은 K를 String으로 실체화하고, V를 Integer로 실체화한다.
		//오토박싱(autoboxing)에 의하여 int(위의 값 8)가 Integer 객체로 자동 변환된다.
		//오토박싱이란 기초 자료형을 대응되는 클래스 객체로 자동 변환해주는 기능이다.
		 
		//또는 아래와 같은 방식도 가능하다.
		 
		//Pair<String, Integer> pair1 = new OrderedPair<>(“Even”, 8);
		//Pair<String, String> pair2 = new OrderedPair<>(“Hi”, “nice~”);
		
    }
}