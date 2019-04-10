package SeleniumExamples;



import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class casestudy2 {
	public static WebDriver driver;

	public void setupSelenium(String browserTpe, String url) {
		String currDir = System.getProperty("user.dir");

		if(browserTpe.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir+"//driver//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
		}
		
		if(browserTpe.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir+"//driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		}
				
        //driver.manage().window().maximize();
		//driver.get("http://www.edureka.co");//open up a page
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
	
	
	
	

	private void navigate() {
		driver.navigate().to("http://www.edureka.co");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
	
		driver.navigate().back();
	
		driver.navigate().forward();
	
		System.out.println("done");
		
	}
	

	public void locatorTest() {
		
		
		
		
		  driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		  WebDriverWait waitExplicit = new WebDriverWait(driver, 30); WebElement
		  radioButtonMale =
		  waitExplicit.until(ExpectedConditions.elementToBeClickable(By.id("u_0_a")));
		  radioButtonMale.click();
		 
		 
		/// Wait waitFluent = new FluentWait(driver).withTimeout(30,
		// TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
		 // .ignoring(NoSuchElementException.class);
		 
		
		
//		System.out.println("Class attribute value - "+driver.findElement(By.id("u_0_11")).getAttribute("class"));
		

		Select m = new Select(driver.findElement(By.id("year")));
//		m.selectByVisibleText("Sept");
//		m.selectByValue("11");
		m.selectByIndex(7);
		
		
		
		
	}
	
	public static void main(String[] args) {

		casestudy2 sel = new casestudy2();
		sel.setupSelenium("chrome", "http://www.edureka.co");
		sel.navigate();
		sel.locatorTest();
		
		
		
		
		
		
		/*
		 * String title = sel.getTitle(); System.out.println(title);
		 * if(title.equals("Facebook – log in or sign")) {
		 * System.out.println("Test case passed"); } else {
		 * System.err.println("Test case failed"); }
		 */
//		sel.quitBrowser();

	}


}
