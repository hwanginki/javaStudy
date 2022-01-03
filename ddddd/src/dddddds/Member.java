package dddddds;

import java.util.HashMap;
import java.util.Map;

public class Member {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		
		map.put("첫번째", "김진원");
		
		System.out.println(">>>" + map.get("첫번째"));
		
	}
}
