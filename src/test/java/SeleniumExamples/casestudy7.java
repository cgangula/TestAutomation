package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.Gmailpage;

public class casestudy7 extends Gmailpage {
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
		driver.navigate().to("http://www.gmail.com");
		driver.manage().window().maximize();
	}

	public void locatorTest() throws InterruptedException {
		Gmailpage gmail= new Gmailpage();
		
		driver.findElement(gmail.username).sendKeys("gangulachaitanya88");
		driver.findElement(gmail.next).click();
		Thread.sleep(4000);
		driver.findElement(gmail.password).sendKeys("balajii88");
		driver.findElement(gmail.signin).click();
		Thread.sleep(4000);
		driver.findElement(gmail.compose).click();
		driver.findElement(gmail.to).sendKeys("venu.kiran83@gmail.com");
		Thread.sleep(4000);
		driver.findElement(gmail.subject).sendKeys("Testing");
		Thread.sleep(4000);
		driver.findElement(gmail.send).click();
		Thread.sleep(4000);
		driver.findElement(gmail.account).click();
		Thread.sleep(4000);
		driver.findElement(gmail.signout).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		casestudy7 sel = new casestudy7();
		sel.setupSelenium("chrome", "http://www.gmail.com");

		sel.navigate();
		sel.locatorTest();

	}

}
