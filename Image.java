package Generic;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Image {


	public static void getScreenShot(WebDriver driver, String name) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File From = ts.getScreenshotAs(OutputType.FILE);
		File To = new File("./ScreenShot/" + name + ".png");
		Files.copy(From, To);
	}

}