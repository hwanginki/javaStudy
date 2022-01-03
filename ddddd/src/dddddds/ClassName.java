package dddddds;

import java.util.Comparator;

public class ClassName implements Comparator<ClassName> {
	int age;
	
	public ClassName(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		ClassName a = new ClassName(20);
		ClassName b = new ClassName(25);
		
		a.compare(a, b);
	}

	@Override
	public int compare(ClassName o1, ClassName o2) {
		
		if (o1.age == o2.age) {
			System.out.println("동갑이시네요~1");
			return 1;
		} else if (o1.age < o2.age) {
			System.out.println("오 형이시네요 ㅋㅋ2");
			return 0;
		} else {
			System.out.println("내가 형이네 ㅋㅋ3");
			return -1;
		}
	}

}
