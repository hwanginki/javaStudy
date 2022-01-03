package dddddds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class dsfsfsds {

	public void listTest(ArrayList<Object> list) {
		list.add("Hello");
		list.add(1);
	}
	
	public void listTest2(ArrayList<String> list) {
		list.add("Hello");
	}

	public void listTest3(ArrayList<Integer> list) {
		list.add(123);
	}

	public void listTest31(ArrayList<Integer> list) {
		list.add(123);
	}

	public void listTest4(ArrayList<? extends Object> list) {
		
	}
	
	public void listTest5(Collection<String> list) {
		list.add("test");
//		list.add(12);
	}
	
	
	
	public static void printListObject(List<Object> list) {    
	    for (Object element : list) {        
	        System.out.print(element + " ");    
	    }        
	}    
	
	public static void printListWildCard(List<?> list) {    
	    for (Object element: list) {        
	        System.out.print(element + " ");    
	    }     
	}
	
	public static void printTest(Collection<? extends Number> list) {
		
	}
	
	// <Object>로 선언하면 모든 Collection 타입 모두를 받을 수 있다고 잘못 이해한 코드예요!!
	// 그니까 모든 Collection 타입 모두를 허용할 수 있다는 것이 아니구요
	// <?>로 안전하게 사용할 수 있긴 한데, 뭐 객체를 다 받을 수 없어요!
	void printCollection(Collection<?> c) {
		for (Object e : c) {
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(123);
		a.add(456);
		
		ArrayList<String> b = new ArrayList<>();
		b.add("안녕하세요");
		b.add("김진원");
		
		ArrayList<Object> c = new ArrayList<>();
		c.add(123);
		c.add("test");
		System.out.println(">>>" + c.get(0));
		
		Collection<Object> zs = new ArrayList<>();
		zs.add(123456);
		zs.add(123456);
		System.out.println(">>>" + zs.size());
		
		Collection<Integer> sss = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		
		Collection<Integer> sss12 = new HashSet<>();
		
		HashSet<String> set1 = new HashSet<>();
		
//		<String> 나오면 add추가하고
//		<Integer> 나오면 add추가하는데
//		<?> 나오면 어떤 타입인지 알 수가 없어서 추가 못하답니다. 대신 이렇게 표현 가능하긴 해요
//		<?> 표현할 수도 있는데 뭔가 안어울려요 ?인데 알 수 없는 타입형으로 나와서 구현할 수 없어요
		
		ArrayList<?> ab;
		ab = new ArrayList<Integer>();
		ab = new ArrayList<String>();
		ab = new ArrayList<Object>();
		
	}

}
