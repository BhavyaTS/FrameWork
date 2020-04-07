package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.INconstant;
import Generic.Image;
import Generic.Xl;

public class AmazonHome implements INconstant {

	public AmazonHome(WebDriver driver) {

		this.AmazonHome(driver);
	}

	public void AmazonHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageIsDisplayed(WebDriver driver, long ETO, String title) throws Exception {
		try {
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("Amazon Home is Displayed", true);

		} catch (Exception e) {
			Reporter.log("Amazon Home is not displayed", true);
			try {
				Image.getScreenShot(driver, title);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}

}
