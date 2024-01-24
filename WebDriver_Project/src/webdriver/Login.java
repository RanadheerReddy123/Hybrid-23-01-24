package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
public static void main(String[] args)throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch url in a browser
		driver.get("https://www.saucedemo.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.quit();
	}
   }
