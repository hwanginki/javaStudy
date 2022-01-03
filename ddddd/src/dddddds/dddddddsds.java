package dddddds;

// 이렇다고 칩시다
class 직능원<IT융합분야> {
	
	// 그런데 static이라는 키워드 불가능
	String person;

	public 직능원(String person) {
		this.person = person;
	}
	
	@Override
	public String toString() {
		return person.toString();
	}
}

class 수업열심히듣는사람<수강생> {
	수강생 bestPerson;
}

class 수업포기하는사람<수강생> {
	수강생 worstPerson;
}

public class dddddddsds {

	public static void main(String[] args) {
		직능원<수업열심히듣는사람> ps1 = new 직능원<>("김진원");
		직능원<수업열심히듣는사람> ps2 = new 직능원<>("박영연");
		직능원<수업열심히듣는사람> ps3 = new 직능원<>("황인기");
		직능원<수업포기하는사람> ps4 = new 직능원<>("김대원");
		
		show(ps1);
		show(ps2);
		show(ps3);
		show(ps4);
	}
	
	// 수업듣는 사람 출력 메소드
	public static void show(직능원<?> personList) {
		System.out.println(personList);
	}
}