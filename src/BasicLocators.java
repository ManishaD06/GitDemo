import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Basic Steps for invoking Browser and opening any URL");
		
		//Invoking Chrome Browser
			
		 
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("manisha.desai@yahoo.com");
				
		
		driver.close();
		
		
		
	}

}
