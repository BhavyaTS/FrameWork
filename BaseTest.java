package Generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements INconstant {
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name = "chrome";

	static {
		try {
			fis = new FileInputStream("./santu.properties");
			Properties con = new Properties();
			con.load(fis);
			browser_name = con.getProperty("browser");
			if (browser_name.contains("chrome")) {
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@BeforeMethod()
	public static void beforeM() {
		if (browser_name.contains("chrome")) {
			ChromeOptions co=new ChromeOptions();
			co.addArguments("--disable-notifications");
			driver = new ChromeDriver(co);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		
		driver.get(URL);

	}

	@AfterMethod
	public static void afterM() throws Exception {

//		String path = IMG + IMG + ".png";
//		Image.getScreenShot(driver, path);
//		driver.close();

	}

	public static void closeApp(ITestResult result) throws Exception {
		int status = result.getStatus();
		String testCase = result.getName();
		if (status == 1) {
			Reporter.log(testCase + "is pass", true);

		} else {
			Reporter.log(testCase + "is fail", true);
			Image.getScreenShot(driver, testCase);
		}
		driver.close();
	}

}