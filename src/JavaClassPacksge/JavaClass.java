package JavaClassPacksge;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaClass {

	WebDriver driver = new ChromeDriver();
	String myMobile = "796565656";
	String myWebSite = "https://smartbuy-me.com/smartbuystore/en/login";
	int SSS = 5;
	
	

	@BeforeTest

	public void myBeforeTest() {

		driver.manage().window().maximize();

//		String myname = "abedalraheem";
//		driver.get(myMobile);

//		System.out.println(myname.charAt(0));
//		System.out.println(myname.toUpperCase());
//		System.out.println(myname.toUpperCase().charAt(0));
//		System.out.println(myname.replace('a', 'm'));
//		System.out.println(myname.contains("z"));
//		System.out.println(myname.endsWith("zz"));
	}

	@Test (invocationCount = 8)
	
	public void myTest () throws InterruptedException
	
		{
		;
		
		
//		driver.get(myWebSite);
//		WebElement mobile = driver.findElement(By.id("mobileNumber"));
//		mobile.sendKeys(myMobile);
		
		
//		System.out.println(SSS);
//		System.out.println(Math.pow(SSS, 2));
		
		
//		String FirstName= "John";
//				String LastName = "Doe";
//				System.out.println(FirstName.concat("").concat(LastName));
		
		
		
		
		String FirstName1= "rana";
		String LastName1= "asfour";
		String space = " ";
		String domain= "@gmail.com";
		Random rand = new Random();
	int RandomId = rand.nextInt(10);
	String MyEmai= FirstName1+LastName1+RandomId+domain;
	
System.out.println(FirstName1+LastName1+RandomId+domain);

driver.get(myWebSite);

WebElement email = driver.findElement(By.id("register.email"));

email.sendKeys(MyEmai);
Thread.sleep(2000);


	}
}
