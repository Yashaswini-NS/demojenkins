package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc1() {
		Reporter.log("Hello testng", true);
		Reporter.log("poll_scm",true);
	}
	

}
