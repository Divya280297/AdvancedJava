package demo.junit.tests;

import org.junit.Test;

import demo.junit.first.SimpleMath;
import org.junit.Assert;
import junit.framework.AssertionFailedError;
public class SimpleMathTest {
	@Test
	public void test1() {
		int x=50,y=50;
		int result = SimpleMath.plus(x,y);
		System.out.println("Result for plus operation: "+result);
		//isEqual(x+y,result);
		Assert.assertEquals(x+y, result);
	}

	@Test
	public void test2() {
		int x=50,y=50;
		int result = SimpleMath.plus(x,y);
		System.out.println("Result for minus operation: "+result);
		//isEqual(x-y,result);
		Assert.assertEquals(x-y, result);
	}
	@Test
	public void test3() {
		int x=50,y=50;
		int result = SimpleMath.plus(x,y);
		System.out.println("Result for Multiply operation: "+result);
		int expected = x*y;
		//isEqual(x*y,actual);
		Assert.assertEquals(x*y, result);
	}
	
	public void isEqual(int expected, int actual) {
		if(actual != expected)
			throw new AssertionFailedError("Operation failed! Expected "+expected+" actual "+actual);
	}
	@Test
	public void test4() {
		int x=50,y=50;
		int result = SimpleMath.plus(x,y);
		System.out.println("Result for divide operation: "+result);
		Assert.assertEquals(x/y, result);//isEqual(x/y,result);
	}
}
