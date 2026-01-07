package javaPackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		// 1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=1]")).click();
		
		
		// 2nd way
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons : "+radios.size());
		System.out.println(radios.get(0).isSelected());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(2).isDisplayed());
		Thread.sleep(2000);
		radios.get(1).click();
		System.out.println(radios.get(2).isSelected());
		
		//3rd May
		List<WebElement> radiosText = driver.findElements(By.xpath("//label[@class=\"_8esa\"]"));
		System.out.println("Total Radio Button Text : " +radiosText.size());
		String expResult = "Female";
		for(int i = 0; i< radiosText.size();i++)
		{
			if(radiosText.get(i).getText().equalsIgnoreCase(expResult))
			{
				radiosText.get(i).click();
				System.out.println(expResult+ "clicked");
				
			}
		}
		
		}

}
