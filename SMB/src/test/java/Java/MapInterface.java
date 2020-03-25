package Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
		
		
		Map<String,String> map=new HashMap<String,String>();
		map.put("Fname", "jabed");
		map.put("LastName", "Newaj");
		map.put("Middle", "Liton");
		
		
		//for(String key:map.keySet()) {
			for(String key:map.keySet()) {
			
			//System.out.println(key+"="+ map.get(key));//get method to get key value
			
			//System.out.println(map.entrySet());
			System.out.println(map.entrySet());
			break;
			
		}
		
	 
	}
	@org.testng.annotations.Test
	public void Test() {
		
		Map<String,List<String>> map1=new HashMap<String,List<String>>();
		List <String> list=new ArrayList<String>();	
		list.add("gmail.com");
		list.add("gmail1.com");
		list.add("gmail2.com");
		
		map1.put("Emails" ,list);
		System.out.println(map1.entrySet());
		
		
	}
	}

