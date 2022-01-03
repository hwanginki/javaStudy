package dddddds;

import java.util.ArrayList;
import java.util.List;

// <T extends 클래스> 사용법
// 상속을 이용해서 T의 자료형을 제한해주는 것!!
// 클래스 선언 시 사용하며 인스턴스 생성시 특정 클래스를 상속받은 클래스형 만 인스턴스 내부에서
// 사용할 수 있도록 함, 특정 인터페이스를 구현한 클래스만 사용하려는 경유에도 사용 가능

// <? extends 클래스,T>


// Person 클래스
class Person {
	String name;
	
	@Override
	public String toString() {
		return name.toString();
	}
}

// Person 상속아닌 클래스
class Test12 {
	String name;
}

//Person 상속 Man 클래스
class Man extends Person {
 // 생성자
 Man(String name) {
     this.name = name;
 }
}

//Person 상속 Woman 클래스
class Woman extends Person {
 Woman(String name) {
     this.name = name;
 }
}

public class WildExtends {
	
	public static void main(String[] args) {
		
		// Person
//		List<Person> listP = new ArrayList<Person>();
//		listP.add(new Person());
//		printData(listP);
		
		// Man
		ArrayList<Man> listM = new ArrayList<Man>();
		listM.add(new Man("이순신"));
		listM.add(new Man("하현우"));
		listM.add(new Man("김자바"));
		printData(listM);
		
		// Woman
		ArrayList<Woman> listW = new ArrayList<Woman>();
		listW.add(new Woman("유관순"));
		listW.add(new Woman("백예린"));
		//printData(listW);
		
		// Test
		ArrayList<Test> listT = new ArrayList<Test>();
		listT.add(new Test());
		// printData(listT); // → Person 클래스를 상속받지 않았기 때문에 메소드 호출 불가
		
	}
	
	// Person 클래스와 그 하위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
	public static void printData(ArrayList<? extends Man> list) {
		for (Person obj : list) {
			System.out.println(obj);
		}
	}
	
}
