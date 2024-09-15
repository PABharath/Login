package adding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addto {

	WebDriver driver;
	public addto(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

//	List<WebElement> cardsdata=driver.findElements(By.cssSelector(".mb-3"));
	
//	WebElement Bharath=cardsdata.stream().filter(s->s.getText().contains("ZARA COAT 3")).findFirst().orElse(null);	
//	
//	driver.findElement(By.cssSelector("[routerlink*='/dashboard/cart']")).click();
	
	@FindBy (css=".mb-3")
	List<WebElement> cardsdata;
	
	
	@FindBy(css="[routerlink*='/dashboard/cart']")
	WebElement addtocart;
	

	
	public List<WebElement> data() {
		return cardsdata;
	}
	

	
	public WebElement alldata(String product) throws InterruptedException {
		Thread.sleep(3000);
		WebElement Bharath=cardsdata.stream().filter(s->s.getText().contains(product)).findFirst().orElse(null);	
		return Bharath;
	}
	
	
	public void clicked(String product) throws InterruptedException {
		Thread.sleep(3000);
		WebElement all=   alldata(product);
		all.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		Thread.sleep(5000);
		addtocart.click();
		
	}
}
