package adding;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class matchthecart {
	WebDriver driver;
	public matchthecart(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
//	List <WebElement> cartdata=driver.findElements(By.cssSelector(".cart h3"));
//	
//	boolean match=cartdata.stream().anyMatch(s->s.getText().equals(product));
//	System.out.println(match);
	
	
	
	@FindBy (css=".cart h3")
	List<WebElement> cartdata;
	
	@FindBy(css=".btn.btn-primary:last-of-type:nth-child(1)")
	WebElement clickbutton;
	
	public List<WebElement> matchthedata() {
		return cartdata;
	}
	
	
	public boolean matchcartname(String product) throws InterruptedException {
		Thread.sleep(3000);
		boolean match=cartdata.stream().anyMatch(s->s.getText().equals(product));
		System.out.println(match);
		return match;

		
	}
	
	
	public void clicking() {
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeClickable(clickbutton));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", clickbutton);
	}


}
