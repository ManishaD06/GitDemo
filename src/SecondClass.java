import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SecondClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Basic Steps for invoking Browser and opening any URL");
		
		//Invoking IE Browser
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriver\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
	
		System.out.println(driver.getTitle());
		
		
		

	}

}
