package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() {
		Reporter.log("Hello Java", true);
		Reporter.log("check",true);
		Reporter.log("test",true);
	}
	

}
