
package SeleniumExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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


public class assignment8 {
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
		By username = By.id("si_popup_email");
		By password =By.id("si_popup_passwd");
		
		driver.findElement(username).sendKeys(username1);
		driver.findElement(password).sendKeys(password1);
		
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("dropdownMenu4")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Blog")).click();
}
	
String username1 ;
String password1;
	public void logindata()
	 {
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("C:\\Users\\uddasari\\Documents\\chaithanya.xls");
		
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet worksheet = workbook.getSheet("sheet1");
        HSSFRow row1 = worksheet.getRow(1);
        HSSFCell cellA1 = row1.getCell((short) 0);
        username1 = cellA1.getStringCellValue();
        HSSFCell cellB1 = row1.getCell((short) 1);
        password1 = cellB1.getStringCellValue();

        System.out.println("A1: " + username1);
        System.out.println("B1: " + password1);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	

	public static void main(String[] args) throws InterruptedException {

		assignment8 sel = new assignment8();
		sel.setupSelenium("chrome", "http://www.edureka.co");
		sel.navigate();
		sel.logindata();

		sel.locatorTest();
		

		

	}

}
