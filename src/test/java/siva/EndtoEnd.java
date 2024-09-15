package siva;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import adding.Loginpage;
import adding.addto;
import adding.matchthecart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEnd {

	@Test
	public void mainpage() throws InterruptedException {
		
		String product="ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
		
		Loginpage log=new Loginpage(driver);
		log.logindata("Bhar@gmail.com", "Bhar@123");
		
		
		addto carts=new addto(driver);
		List<WebElement>cardsdata=carts.data();
		carts.clicked(product);
		
		
		matchthecart matching=new matchthecart(driver);
		List<WebElement>cartdata=matching.matchthedata();
		matching.clicking();

		
//		Thread.sleep(3000);
		
//		List<WebElement> cardsdata=driver.findElements(By.cssSelector(".mb-3"));
//		
//		WebElement Bharath=cardsdata.stream().filter(s->s.getText().contains("ZARA COAT 3")).findFirst().orElse(null);	  
//		Thread.sleep(2000);
//		Bharath.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.cssSelector("[routerlink*='/dashboard/cart']")).click();
		
		
//		List <WebElement> cartdata=driver.findElements(By.cssSelector(".cart h3"));
//		
//		boolean match=cartdata.stream().anyMatch(s->s.getText().equals("ZARA COAT 3"));
//		System.out.println(match);
//		
//		Thread.sleep(5000);
//		
//		WebElement button = driver.findElement(By.cssSelector(".btn.btn-primary:last-of-type:nth-child(1)"));
//		if (button.isDisplayed() && button.isEnabled()) {
//		    button.click();
//		} else {
//		    System.out.println("Button is not clickable at the moment.");
//		}	
		
		
	}

}
