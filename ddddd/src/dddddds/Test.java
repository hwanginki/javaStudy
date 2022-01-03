package dddddds;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class Test {
	
	private Map<String, Member> map = new HashMap<>();
	
	public Collection<Member> selectAll() {
        return map.values();
    }
	
	public static void main(String[] args) {
		Test t = new Test();
		t.selectAll();
	}
}
