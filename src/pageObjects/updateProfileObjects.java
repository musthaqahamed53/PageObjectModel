package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class updateProfileObjects {
	
	@FindBy(xpath = "//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	 
	@FindBy(name = "phone")
	public static WebElement phone;
	
	@FindBy(name = "city")
	public static WebElement city;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[3]/ul/li[1]/a")
	public static WebElement submit;
	
	
	
	 
	/*
	 * public static WebElement myProfile(WebDriver driver) { return
	 * driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")
	 * ); }
	 * 
	 * public static WebElement phone(WebDriver driver) { return
	 * driver.findElement(By.name("phone")); }
	 * 
	 * public static WebElement city(WebDriver driver) { return
	 * driver.findElement(By.name("city")); }
	 * 
	 * 
	 * public static WebElement submit(WebDriver driver) { return
	 * driver.findElement(By.xpath(
	 * "/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"
	 * )); }
	 */
}
