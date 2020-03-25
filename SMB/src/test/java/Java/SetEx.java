package Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class SetEx {

	
	@Test
	public void SetExe() {
		
		Set<String> set=new HashSet<String>();
		set.add("jabed");
		set.add("Newaj");
		set.add("Liton");
		Iterator< String> itr=set.iterator();
		for(String var:set) {
			System.out.print(var+" ");
			if(itr.next().equals("jabed")) {
				
		System.out.println("\n"+var);
				
		
	}
}
}}