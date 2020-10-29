import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivernew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Manisha");//Regular Expression for xpath
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("desaimanisha10@gmail.com"); //normal xpath
		
		
		driver.findElement(By.cssSelector("input[id*='exampleInputPass']")).sendKeys("12345"); //Regular Expression for CSS
		//driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("12345");   //Normal CSS Method 2 
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");        //Normal CSS Method 1
		
		
		driver.findElement(By.cssSelector("input[type='submit']")).click(); //Normal CSS Method 1
		
	    //String msg = driver.findElement(By.className("close")).getText();	
	    
	   // System.out.println(msg);
	    
		
		                                   
		
		
	}

}
