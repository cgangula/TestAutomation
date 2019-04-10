package SeleniumExamples;

import java.util.concurrent.TimeUnit;

//import java.security.Timestamp;
//import java.sql.Time;
//import java.util.NoSuchElementException;
//import java.util.Timer;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
////import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class casestudy3{
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
		driver.navigate().to("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	public void onewaytrip() {
	
	driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[2]/span[1]/label")).click();
	}
	public void From() throws InterruptedException {
		
		By uday = By.xpath("//input[@name='or-src']");
		WebElement uday1 =driver.findElement(uday); 
		uday1.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Thread.sleep(4000);
		By uday2 = By.xpath("//input[@name='or-src']/../div/div/div[@data-name='Bengaluru']");
		driver.findElement(uday2).click();
        Thread.sleep(4000);
      
        
	
	}
	public void To() throws InterruptedException {
		driver.findElement(By.name("or-dest")).sendKeys("Lucknow (LKO)");
		//Thread.sleep(4000);
		By chaithanya=By.name("or-depart");
		WebElement chaithanya1=driver.findElement(chaithanya);
		chaithanya1.sendKeys("15 Feb 2019");
		Thread.sleep(4000);
		By chaithanya2=By.xpath("//span[text()='February']/./../../div/./../../div/./../..//table[1]/following::a[@class='ui-state-default'][text()='15']");
		driver.findElement(chaithanya2).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
//		 driver.findElement(By.linkText("8")).click();
//		Thread.sleep(4000);
//		//*[@id="bookFlightTab"]/form/div[3]/div[2]/div[2]/div/input
//		driver.findElement(By.name("or-return")).click();
//		Thread.sleep(4000);
//		//*[@id="dp1549487028217"]/div/div[1]/table/tbody/tr[2]/td[6]/a
//		//#dp1549487028217 > div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(2) > td.selected-date.ui-datepicker-current-day > a
//		driver.findElement(By.xpath("//*[@id=\"dp1549486814789\"]/div/div[1]/table/tbody/tr[2]/td[6]/a")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {

		casestudy3 sel = new casestudy3();
		sel.setupSelenium("chrome", "hhttps://www.goindigo.in/?linkNav=home_header");

		sel.navigate();
		sel.onewaytrip();
		sel.From();
		sel.To();
		//clicking on the passenger textbox
		driver.findElement(By.xpath("//div[@class='ig-input-group field-float']/following::input[@name='passenger']")).click();
		//clicking on '+' button to increase the passenger count for adult
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']/ul/li/div/button[2]")).click();
		//clicking on 'Done' Button
		driver.findElement(By.xpath("//button[contains(text(),'Done')]")).click();
}
}