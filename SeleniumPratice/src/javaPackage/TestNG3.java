package javaPackage;
import org.testng.annotations.Test;
public class TestNG3 {
	
		@Test(priority = -10)
				public void a()
				{
					System.out.println("Hello a Test Method");
				}
		 @Test(priority = 2)
				public void b()
				{
					System.out.println("Hello b Test Method");
				}
		 @Test(priority = 0)
				public void c()
				{
					System.out.println("Hello c Test Method");
				}
		 @Test
				public void d()
				{
					System.out.println("Hello d Test Method");
				}
					
		}
