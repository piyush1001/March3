package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T7 {



	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before suite");

	}

	@BeforeClass
	public void beforeClass(){
		System.out.println(" Before Class");

	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("Before test");
	}

	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Before method");
	}


	public void before(){

	}

	@AfterSuite
	public void afterSuite(){

		System.out.println("After Suite");
	}

	@AfterClass
	public void afterClass(){

		System.out.println("After class");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}

	@AfterMethod
	public void afterMethod(){

		System.out.println("After method");
	}


	@Test
	public void test2(){
		System.out.println("test2");
	}







	@Test
	public void test(){
		System.out.println("Test method");
	}
}
