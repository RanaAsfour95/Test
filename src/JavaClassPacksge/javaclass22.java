package JavaClassPacksge;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.org.objectweb.asm.Label;

public class javaclass22 {
	
	
	WebDriver driver = new ChromeDriver();
	double myHighest = 173.5;
	int myAge = 28;
	
	@BeforeTest
	
	
	public void myBeforeTest ()
	{
		
	//	driver.get("https://www.google.com");
		//driver.get("https://www.saucedemo.com/");
		//driver.get("http://127.0.0.1:5500/index25.html");
		driver.get("https://www.saucedemo.com/");

	}
	
	
	@Test
	
	public void myTest()
	{
		
//		String newVariable =Double.toString(myHighest);
//		String newVariable2 = Integer.toString(myAge);
//		
//		WebElement Search = driver.findElement(By.id("APjFqb"));
//		Search.sendKeys(newVariable);
//		Search.sendKeys(newVariable2);
		
		

//		//String Lable = driver.findElement(By.className("YellowLable")).getText();
//		List<WebElement> Lables = driver.findElements(By.className("YellowLable"));
//		for(int i =0 ; i<Lables.size() ; i++)
//		{
//			
		
		
		WebElement UserName = driver.findElement(By.id("user-name"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.id("login-button"));
		UserName.sendKeys("standard_user");
		Password.sendKeys("secret_sauce");
		login.click();
		

		List <WebElement> AddToCartButton = driver.findElements(By.className("btn"));
		
		for (int i =0 ; i<AddToCartButton.size() ; i++)
		{
			
			AddToCartButton.get(i).click();
		}

//			System.out.println(Lables.get(i).getText());
//		}
		
		
		
		
		
		
		

	}
	

}
