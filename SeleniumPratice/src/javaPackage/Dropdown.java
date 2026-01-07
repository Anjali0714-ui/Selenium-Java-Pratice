package javaPackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	// 1 st way
	List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
	System.out.println("Total dropdown values :-" + birthMonth.size());
	birthMonth.get(3).click();
	Thread.sleep(2000);
	birthMonth.get(8).click();
	
	// 2nd way
	WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
	Select month = new Select(bm);
	Thread.sleep(2000);
	month.selectByVisibleText("Apr");
	Thread.sleep(2000);
	month.selectByValue("12");
	Thread.sleep(2000);
	month.selectByIndex(7);
	System.out.println(month.getFirstSelectedOption().getText());
	
	// 3rd way
	List<WebElement>dropdown = month.getOptions();
	System.out.println(dropdown.size());
	for(int i =0; i < dropdown.size(); i++)
	{
		if(dropdown.get(i).getText().equalsIgnoreCase("Sep"));
		{
			dropdown.get(i).click();
			
	    }
	}
	
	// 4th way
	Thread.sleep(2000);
	WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
	bm1.sendKeys("Jun");
	
	// 5th Way
	Thread.sleep(2000);
	driver.findElement(By.id("month")).sendKeys("Mar");
	
	// Check If dropdown support multi selection
	System.out.println(month.isMultiple());
	month.selectByVisibleText("Apr");
	month.selectByValue("12");
	month.selectByIndex(7);
	
	// Deselect multi selected value from dropdown
	month.deselectByVisibleText("Apr");
	month.deselectByValue("12");
	month.deselectByIndex(7);
	month.deselectAll();
	
	

	}

}
