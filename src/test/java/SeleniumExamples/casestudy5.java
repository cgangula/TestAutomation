package SeleniumExamples;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class casestudy5 {
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
	private void navigate() throws InterruptedException, IOException {
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.switchTo()
		By testPopUp = By.xpath("//button[@class='_2AkmmA _29YdH8']");
		
		if(driver.findElements(testPopUp).size() > 0) {
			driver.findElement(testPopUp).click();
		}
		driver.findElement(By.name("q")).sendKeys("selenium book");
		//"//button[@class='vh79eN']"
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Selenium 2 Testing Tools : Beginner's Guide")).click();
		Thread.sleep(4000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		//pincodeInputId
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("560013");
		
		//driver.findElement(By.xpath("//span[@class='_3nCwDW']"));
		 String myText = driver.findElement(By.xpath("//span[@class='_3nCwDW']")).getText();
	        System.out.println("print the duration  :  " + myText);
		driver.findElement(By.xpath("//span[@class='_2aK_gu']")).click();


		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		//"//span[@class='_3nCwDW']"
		//"//button[@class='_2AkmmA _14O7kc _7UHT_c']"
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _14O7kc _7UHT_c']")).click();
		
		//WebElement errorMessage= driver.findElement(By.xpath("//*[@id='errorMessage']");
		//Assert.assertEquals(errorMessage.getText(),"Wrong username or password!");
		//"//input[@class='_2zrpKA _2rqcw- F_Atl2 _14H79F']"
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("abcd");
		//_2AkmmA _1poQZq _7UHT_c
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']")).click();
		//_2zrpKA _2rqcw- F_Atl2 _14H79F
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		@SuppressWarnings("unused")
		BufferedImage  fullImg = ImageIO.read(screenshot);
	}
	
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		casestudy5 sel = new casestudy5();
		sel.setupSelenium("chrome", "https://www.flipkart.com");

		sel.navigate();

	}

}
