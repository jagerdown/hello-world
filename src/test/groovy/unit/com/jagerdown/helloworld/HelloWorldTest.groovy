package unit.com.jagerdown.helloworld;

import static org.junit.Assert.fail

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

import com.jagerdown.helloworld.HelloWorld

public class HelloWorldTest {

	def helloWorld;
	
	@Before
	public void setup() {
		helloWorld = new HelloWorld()
	}
	
	@After
	public void tearDown() {
		
	}
		
	@Test
	public void testHello() {
		Assert.assertTrue("HelloWorld".equals(helloWorld.hello()))
	}
	
	@Test
	public void testHelloFails() {
		Assert.assertFalse("coolString".equals(helloWorld.hello()))
	}

}
