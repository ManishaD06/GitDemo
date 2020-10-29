import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivernew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.qaclickacademy.com/");
		
		
		//XPATH- Absolute
		
					//driver.findElement(By.xpath("//div/div/nav/ul/li[2]")).click();
		
		//x Path Relative(Parent node not required , directly use attribute of that element
		
					//driver.findElement(By.xpath("//li[@class='active']/a[1]")).click();
		
		//traverse to sibling from one element by Xpath
		
					//driver.findElement(By.xpath("//*[@class='active']/following-sibling::li[2]")).click();
		
		
		//traverse from Child to parent/Back - Only possible with Xpath
		
					//driver.findElement(By.xpath("//*[@class='active']/parent::ul")).click();
		
		
		//Identifying element by Xpath with text visible on UI
		
				driver.findElement(By.xpath("//*[text()='Courses']")).click();
		
		
		
	}

}
