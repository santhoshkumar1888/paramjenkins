package day20;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
@Parameters({"city"})
	@Test
	public void testA(String test) {
		Reporter.log("Test report"+test,true);
	}
}
