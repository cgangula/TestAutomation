package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumExample {
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
		driver.navigate().to("http://www.edureka.co/");

		driver.manage().window().maximize();
		locatorTest();

	}

	public void locatorTest() {

		// id
		driver.findElement(By.id("search-inp")).sendKeys("Search for a Course");

		// name
		driver.findElement(By.name("user_v1[query]")).sendKeys("Search for a Course");

		// no className
		// driver.findElement(By.className("search_inp collapse TrackElementHeader")).sendKeys("From className");

		// tagName input
		// driver.findElement(By.tagName("input")).sendKeys("From TagName");

		// css selector
		driver.findElement(By.cssSelector("#search-inp")).sendKeys("From CSS selector");

		// xpath
		driver.findElement(By.xpath("//input[@id='search-inp']")).sendKeys("From xpath");
		
		// linkText
		 driver.findElement(By.linkText("Log In")).click();

		// PartialLinkText
		//driver.findElement(By.partialLinkText("og")).click();

		
	}

	public static void main(String[] args) {

		BasicSeleniumExample sel = new BasicSeleniumExample();
		sel.setupSelenium("chrome", "http://www.edureka.co/");

		sel.navigate();

		sel.locatorTest();

		

	}

}
