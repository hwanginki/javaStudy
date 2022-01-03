package dddddds;

import java.util.*;

// <? super 클래스> : 매개변수의 자료형을 특정 클래스와 그 클래스의 상위 클래스로만 제한해줍니다!!
// 다만, super는 T에 사용 불가능!!
// super은 부모 클래스의 멤버변수를 가리킴
// Person 클래스
class Person1 {
	String name;
	
	@Override
	public String toString() {
		return name.toString();
	}
}

//Person 상속 Man 클래스
class Man1 extends Person1 {
	
	// 생성자
	Man1(String name) {
	   this.name = name;
	}
}

//Person 상속받은 Woman 클래스
class Woman1 extends Person1 {
	Woman1(String name) {
		this.name = name;
	}
}

public class WildSuper {
	
	public static void main(String[] args) {
		// Person
		List<Person1> listP1 = new ArrayList<Person1>();
        listP1.add(new Person1());
//        listP1.add(new Person1("사람"));
//        listP1.add(new Person1("인간"));
//        printData1(listP1); // 사람 인간

        // Man
        List<Man1> listM = new ArrayList<Man1>();
        listM.add(new Man1("하현우"));
        listM.add(new Man1("박효신"));
        printData1(listM); // 하현우 박효신
        
        // Woman
        List<Woman1> listW = new ArrayList<Woman1>();
        listW.add(new Woman1("백예린"));
        listW.add(new Woman1("박정현"));
        // printData1(listW); // → Man 클래스의 상위 클래스가 아니기 때문에 메소드 호출 불가
        
	}
	
	// Man 클래스와 그 상위 클래스로 생성된 인스턴스만 매개변수로 전달 가능
    public static void printData1(List<? super Man1> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
