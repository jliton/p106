package Java;

import org.testng.annotations.Test;

public class Wrapping {

	// Auto boxing is a when wrpping 
	@Test
	
	public void WrappingEx() {
		
		
		int var= 10;
		Integer obj=new Integer(var);
		System.out.println(obj);
		
		
	}
@Test
	public void UnWrappingEx() {
		
		
		int var= 10;
		Integer obj=new Integer(var);
		
		int i=obj;
		System.out.println(i);
		
		
	}
	
}
