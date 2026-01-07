package javaPackage;
import org.testng.annotations.*;

public class TestNG1 {
	@Test
	public void a2()
	{
		System.out.println("Hello a2 Test Method");
		
	}
	 @BeforeTest 
	 public void b(){
		 System.out.println("Hello method B");
		 
	 }

	 @BeforeSuite
	 public void C(){
		 System.out.println("Hello method C");
	 }
	 @AfterMethod
	 public void d() {
		 System.out.println("Hello method D");
	 }
	 @BeforeClass
	 public void e() {
		System.out.println("Hello method e");
		 
	 }
	 @AfterTest
	 public void f()
	 {
		 System.out.println("Hello method f");
	 }
	 
	 @AfterClass
	 public void g() {
		 System.out.println("Hello method f");
		 
	 }
	 @BeforeMethod
	 public void h() {
		 System.out.println("Hello method h");
	 }
	 @AfterSuite
	 public void i() {
		 System.out.println("Hello method i");
	 }
	 @Test
	 public void a1()
	 {
		 System.out.println("Hello a1 test method"); 
	 }
	 
	 @Test
	 public void A1()
	 {
		 System.out.println("Hello A1 test method"); 
	 }
	  
	 
}
