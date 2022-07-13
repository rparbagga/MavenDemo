package LearnMaven.LearnMTS;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class ApiTest {

	@Test(groups="SmokeTest")
	public void AndroidApp(){
		System.out.println("AndroidApp");
	}

	@Test(enabled=false)  //instead of commenting the testcase or deleting it use enabled=false its professional 
	public void IOSapp() {
		System.out.println("IOSapp");
	}

	
	@BeforeTest
	public void m1() {
		System.out.println("Execute first");}
	
	@AfterTest
	public void m2(){
		System.out.println("Execute last");}
	
	@BeforeSuite
	public void m3() {
		System.out.println("Execute before suite");}
	
	@AfterSuite
	public void m4(){
		System.out.println("Execute after suite");}
}
