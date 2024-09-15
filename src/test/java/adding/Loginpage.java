package adding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	public  Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
		
		
		
		
//		
//driver.findElement(By.id("userEmail")).sendKeys("Bhar@gmail.com");
//		
//		driver.findElement(By.id("userPassword")).sendKeys("Bhar@123");
//		
//		driver.findElement(By.id("login")).click();
		
		
		
	}
	@FindBy(id="userEmail")
	WebElement username;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void logindata(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
	}
	
	

}
