package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		w.manage().window().maximize();
		//login
		
		w.findElement(By.name("email")).sendKeys("9833468375");
		Thread.sleep(2000);
		w.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		w.findElement(By.name("password")).sendKeys("Ajay@123");
		Thread.sleep(2000);
		w.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		
//		Search a product
		
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes for women");
		Thread.sleep(2000);
		w.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);

//		Update a product
		
		w.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(2000);
		Select s = new Select(w.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[3]/div[1]/span[1]/span/span[1]/span/select")));
		Thread.sleep(2000);
		s.selectByIndex(2);
	    Thread.sleep(2000);
	    
//	    delete a product
	    
	    w.findElement(By.className("a-color-link")).click();
		Thread.sleep(2000);
		
//		Logout
	
	    Actions act = new Actions(w);
	    List<WebElement> menus= w.findElements(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span/span"));
		for (WebElement menu : menus)
		{
			act.moveToElement(menu).perform();
			Thread.sleep(2000);
			System.out.println(menu.getText());
			}
		
		w.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);

		}
	   
	}


