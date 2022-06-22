package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects { 

	@FindBy(how=How.NAME,using="email")	//can use this
	public static WebElement userName;
	
	@FindBy(name="password") // also this ..both are correct
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginBtn;
	
	
	
	
	
	
	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.name("email")); }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.name("password")); }
	 * 
	 * public static WebElement loginBtn(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button")); }
	 */

}
