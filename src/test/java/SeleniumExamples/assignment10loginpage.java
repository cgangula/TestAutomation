package SeleniumExamples;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment10loginpage {
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
		driver.manage().window().maximize();
	}

	public void locatorTest() throws InterruptedException {

		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.id("si_popup_email")).sendKeys("uk.dasari@gmail.com");
		driver.findElement(By.id("si_popup_passwd")).sendKeys("Welcome01");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		Thread.sleep(4000);

		// search-inp
		driver.findElement(By.id("search-inp")).sendKeys("Devops certification training");
		Thread.sleep(4000);
		driver.findElement(By
				.xpath("//strong[contains(text(),'DevOps')]/following-sibling::strong[contains(text(),'Certification']"))
				.click();

	}
	
	public static void main(String[] args) throws InterruptedException {
		assignment10loginpage sel = new assignment10loginpage();
		sel.setupSelenium("chrome", "http://www.edureka.co");
		sel.navigate();
		sel.locatorTest();
	}

}
