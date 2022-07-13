package LearnMaven.LearnMTS;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.Test;

public class SelTest {

	@Test
	public void browserAutomation(){
		System.out.println("browserAutomation");
	}

	@Test(groups="SmokeTest")
	public void elementsUI() {
		System.out.println("elementsUI");		
	}
	
	@Test(dependsOnMethods="tm2")
	public void tm1() {
		System.out.println("depending on timed out method");		
	}
	
	@Test(timeOut =4000)
	public void tm2() {
		System.out.println("timed out method");		
	}
	
	@Parameters({"Url","KeyId"})
	@Test
	public void pmt(String urlname, String key){
		System.out.println(urlname);
		System.out.println(key);
	}
}
