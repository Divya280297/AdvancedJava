package demo.junit.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {

	@Test
	public void test() {
		System.out.println("Im a test 1");
	}
	
	public void testSomething() {
		System.out.println("Not");
	}

}
