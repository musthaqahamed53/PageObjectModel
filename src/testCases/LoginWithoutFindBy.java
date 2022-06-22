package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginWithoutFindBy {

	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	@Test
	public void login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/");
		
		PageFactory.initElements(driver, LoginWithoutFindBy.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
