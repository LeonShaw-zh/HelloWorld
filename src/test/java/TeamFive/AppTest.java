package TeamFive;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest{
	public App app = new App();

	@Test
	public void testPrin(){
		assertEquals("Hello, hahaha", app.prin());
	}
}
