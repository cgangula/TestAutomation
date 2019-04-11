
package SeleniumExamples;

//import java.security.Timestamp;
//import java.sql.Time;
//import java.util.NoSuchElementException;
//import java.util.Timer;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.support.ui.Select;


public class assignment2 {
	public static WebDriver driver;

	public void setupSelenium(String browserTpe, String url) {
		String currDir = System.getProperty("user.dir");

		if (browserTpe.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "//driver//chromedriver.exe");

			driver = new ChromeDriver();
		}

		if (browserTpe.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}

	}

	private void navigate() {
		driver.navigate().to("http://www.edureka.co");

		//driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		

		System.out.println("done");
		

	}

	
	public void locatorTest() throws InterruptedException {
		
		
		driver.findElement(By.linkText("Log In")).click();
		//data[User][email]
		driver.findElement(By.id("si_popup_email")).sendKeys("uk.dasari@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Welcome01");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-toggle='dropdown'][@data-button-name='Profile picture']/span[contains(text(),'Uday')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("My Profile")).click();
		//icon-pr-edit"//a[@id='personal_details']"
		driver.findElement(By.xpath("//a[@id='personal_details']")).click();
		
//		By uday = By.name("fullname");
//		WebElement uday1 =driver.findElement(uday); 
//		uday1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE),"Uday Dasari");
		Thread.sleep(4000);
		Select dropdown = new Select(driver.findElement(By.id("experience")));
		dropdown.selectByVisibleText("2-4 years");
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//button[@class='btn btn-default pull-right verify-continue-btn'][text()='Continue']")).click();
		
		//driver.findElement(By.name("companyName")).sendKeys("Testing");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn pull-right onboarding-primary-button'][text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn onboarding-primary-button pull-right'][text()='Next']")).click();
		Thread.sleep(4000);//btn pull-right onboarding-primary-button
		driver.findElement(By.xpath("//button[@class='btn pull-right onboarding-primary-button'][text()='Save']")).click();
		Thread.sleep(4000);
		//driver.navigate().back();
		driver.findElement(By.linkText("Home")).click();
        Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@data-toggle='dropdown'][@data-button-name='Profile picture']/span[contains(text(),'Uday')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log Out")).click();
		
	}



//
//		assignment2 sel = new assignment2();
//		sel.setupSelenium("chrome", "http://www.edureka.co");
//		sel.navigate();
//		sel.locatorTest();

		

//	}

}
