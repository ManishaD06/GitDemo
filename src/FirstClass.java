import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Basic Steps for invoking Browser and opening any URL");
		
		//Invoking Chrome Browser
		
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriverNew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
						
		driver.get("https://www.google.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.get("https://www.youtube.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		//driver.close();
		
	}
	

}
