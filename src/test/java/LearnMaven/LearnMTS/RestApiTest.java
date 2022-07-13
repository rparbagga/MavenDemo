package LearnMaven.LearnMTS;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RestApiTest {

	@Test
	public void postJira() {
		System.out.println("postJira");
	}
	
	@Test
	public void postFB() {
		System.out.println("postFB");
	}

	@Test
	public void postInsta() {
		System.out.println("postInsta");
	}
	
	@Test(groups="SmokeTest")
	public void postMeta() {
		System.out.println("postMeta");
	}

	@Test
	public void deleteTwitter() {
		System.out.println("deleteTwitter");
	}
	
}
