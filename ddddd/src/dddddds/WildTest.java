package dddddds;

import java.util.ArrayList;
import java.util.List;

public class WildTest {

	public static void main(String[] args) {
		// 클래스의 타입 매개변수<T>와 메서드의 타입 매개변수 <T>는 별개임
		
		// List는 인터페이스이기 때문에 ArrayList 생성 후 Upcasting 이동
		List<String> list = new ArrayList<>();
		list.add("test1");
		list.add("test2");
		
		List<Integer> list2 = new ArrayList<>();
        list2.add(956);
        list2.add(50);
        list2.add(new Integer(16));
        
        // Double형 list3 생성
        List<Double> list3 = new ArrayList<>();
        list3.add(10.1);
        list3.add(11.2);
        list3.add(12.3);
        
        printData(list);
        printData(list2);
        printData(list3);
        
	}
	
	// 메서드의 매개변수에 와일드 카드를 사용하는 로직
    public static void printData(List<?> list) {
        for (Object v : list) {
            System.out.println(v);
        }
    }
    
}