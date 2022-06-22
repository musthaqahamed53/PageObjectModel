package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;


public class LoginTestCase {
	@Test
	public void login() throws InterruptedException {
		//added sample line for git
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,LoginPageObjects.class ); 
		/*
		 * to give the webdriver driver to login page objects thus to find element using
		 * page factory findby ->> we use pagefactory.initelements
		 */
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginBtn.click();
		
		 
		/*
		 * LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		 * LoginPageObjects.password(driver).sendKeys("demouser");
		 * LoginPageObjects.loginBtn(driver).click();
		 */
		 
		 
		
	}
	
	
	
	
	
}
