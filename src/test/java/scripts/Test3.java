package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void tc1() {
		Reporter.log("Hello git", true);
		Reporter.log("tst",true);
	}
	

}
