import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		
		
		/*driver.findElement(By.name("email")).sendKeys("manisha.desai@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
		*/
		
		//By using Xpath
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manisha.desai@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		
		System.out.println("for Git Testing");
		
		//driver.close();
		
		
	}

}
