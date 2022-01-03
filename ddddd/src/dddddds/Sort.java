package dddddds;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
	
	static void sortCollection() {
		List<String> list = Arrays.asList("Toy", "Box", "Rebot");
		
		list.sort(null);
		
		for (String e : list) {
			System.out.println(e);
		}
			
		System.out.println(sort1(list));
	}
	
	
	public static void main(String[] args) {
		sortCollection();
	}
	
	public static <T extends Comparable<? super T>> String sort1(List<T> list) {
		return "정렬되었습니다.";
	}
	
}
