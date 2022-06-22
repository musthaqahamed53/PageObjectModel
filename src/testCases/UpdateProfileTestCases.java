package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.updateProfileObjects;

public class UpdateProfileTestCases {

	@Test
public void updatePro() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\CTS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		
		PageFactory.initElements(driver,LoginPageObjects.class ); 
		PageFactory.initElements(driver,updateProfileObjects.class); 
		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.password.sendKeys("demouser");
		LoginPageObjects.loginBtn.click();
		
		updateProfileObjects.myProfile.click();
		updateProfileObjects.phone.clear();
		updateProfileObjects.phone.sendKeys("9234567890");
		updateProfileObjects.city.sendKeys("Coimbatore"); 
		updateProfileObjects.submit.click();
		
		
		/*
		 * LoginPageObjects.userName.sendKeys("user@phptravels.com");
		 * LoginPageObjects.password.sendKeys("demouser");
		 * LoginPageObjects.loginBtn.click();
		 * 
		 * updateProfileObjects.myProfile(driver).click();
		 * updateProfileObjects.phone(driver).clear();
		 * updateProfileObjects.phone(driver).sendKeys("9234567890");
		 * updateProfileObjects.city(driver).sendKeys("Coimbatore");
		 * updateProfileObjects.submit(driver).click();
		 */
		
	}
}
