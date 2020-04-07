package testpom;

import java.lang.annotation.Target;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Xl;
import pom.AmazonHome;
import pom.SignIn;

public class TestValidLogin extends BaseTest {

	@Test
		public static void book() throws Exception {
		String search = Xl.getData(XLPATH, SHEET, 0, 1);

		SignIn sign = new SignIn(driver);
		sign.searchBox(search);
		sign.authorName();
		sign.paperBack();
	}

	@Test
	public static void todayDeal() {
		
		SignIn sign1 = new SignIn(driver);
		sign1.bestSellers();
		sign1.babyProducts();
		sign1.safetyEqui();
		sign1.babyMoni();
		sign1.firstSelect();
	}
	
    @Test
	public static void  grocery() throws Exception
	{
		SignIn sign2 =new SignIn (driver);

	        sign2.clickHam();
	        sign2.clickGroceery();
	        sign2.diet();
            sign2.sportsSupp();
	        sign2.massGainers();
	        sign2.gncEle();
	}
    @Test 
    public static void newReleases() throws Exception
    {
		SignIn sign3 =new SignIn (driver);
		
		sign3.newRelease();
		sign3.cloth();
		sign3.boys();
		sign3.winterWear();
		sign3.jackets();
    }
    @Test 
    public static void homeKitchen() throws Exception 
    {
		SignIn sign4 =new SignIn (driver);
		
		sign4.clickHam();
		sign4.homeKitchen();
		sign4.kitchen();
		sign4.bakeWear();
		sign4.moulds();
		sign4.cakeTins();

    }

}