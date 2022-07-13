package LearnMaven.LearnMTS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {

	
	@Test
	public void deleteTwitter() {
		System.out.println("deleteTwitter");
	}
	
	/*
	 @Test(groups="SmokeTest")
	public void deleteFB() {
		System.out.println("deleteFB");
	}
	*/
	
	@Test(dependsOnMethods ="deleteTwitter")  //Using dependsOnMethods so that they don't print alphabetically
	public void deleteFB() {
		System.out.println("deleteFB");
	}
	
	@BeforeMethod
	public void bfm() {
		System.out.println("beforemethod");
	}
	
	@AfterMethod
	public void afm() {
		System.out.println("aftermethod");
	}
	
	@BeforeClass
	public void bfc() {System.out.println("beforeclass");}
	
	@AfterClass
	public void afc() {System.out.println("afterclass");}

	
	
	/* O/p
	 * 
		beforeclass
		beforemethod
		deleteFB  //FB first then twitter because alphabetically
		aftermethod
		beforemethod
		deleteTwitter
		aftermethod
		afterclass
	 * 
	 * 
	 * Using dependsOn we get below o/p
	 *  beforeclass
		beforemethod
		deleteTwitter
		aftermethod
		beforemethod
		deleteFB
		aftermethod
		afterclass
	 * 
	 * 
	 * 
	 * */
}
