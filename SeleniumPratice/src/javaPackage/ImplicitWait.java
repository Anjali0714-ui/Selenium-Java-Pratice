package javaPackage;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Implicit Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		 
		 List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 
		 for(int i = 0; i < AllSuggestions.size();i++)
		 {
			 String expResult = "How stuff works podcast";
			 if(AllSuggestions.get(i).getText().equalsIgnoreCase(expResult))
			 {
				 AllSuggestions.get(i).click();
				 break;
			 }
		 }

	
	}

}
