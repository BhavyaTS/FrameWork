package pom;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	@FindBy(xpath = "//i[@class='a-icon a-icon-checkbox']/following::span[text()='Amish Tripathi']")
	private WebElement amish;
@FindBy(xpath="//span[text()='Paperback']")
private WebElement paperback;
	
	@FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
	private WebElement bestSellers;
	@FindBy(xpath = "//a[text()='Baby Products']")
	private WebElement babyProducts;
	@FindBy(xpath = "//a[text()='Safety Equipment']")
	private WebElement safetyEqui;
	@FindBy(xpath="//a[text()='Baby Monitors']")
	private WebElement babyMonitors;
	@FindBy(xpath="(//span[@class='aok-inline-block zg-item'])[1]")
	private WebElement firstSelect ;
	
	@FindBy(id="nav-hamburger-menu")
	private WebElement hamburger;
	@FindBy(xpath="//div[contains(text(),'Beauty, Health, Grocery')]")
	private  WebElement grocery;
	@FindBy(xpath="//div[contains(text(),'Diet & Nutrition')]")
	private WebElement dietNutrition;
	@FindBy(xpath="(//span[text()='Sports Supplements'])[1]")
	private WebElement sportsSupplements ;
	@FindBy(xpath="//img[@alt='mass gainers']")
	private WebElement massGainers;
	@FindBy(xpath="//span[text()='GNC']")
	private WebElement gncEle;
	
	@FindBy(xpath="//a[text()='New Releases']")
	private WebElement newReleases;
	@FindBy(xpath="//a[text()='Clothing & Accessories']")
	private  WebElement clothing;
	@FindBy(xpath="//a[text()='Boys']")
	private WebElement boys;
	@FindBy(xpath="//a[text()='Winterwear']")
	private WebElement winterWear;
	@FindBy(xpath="//a[text()='Jackets']")
	private WebElement jackets;
	
	
	@FindBy(xpath="//div[text()='Home, Kitchen, Pets']")
	private WebElement homeKitchen;
	@FindBy(xpath="//a[text()='Kitchen & Dining']")
	private WebElement kitchen;
	@FindBy(xpath="//span[text()='Bakeware']")
	private WebElement bakeware;
	@FindBy(xpath="//span[text()='Bakeware Moulds & Tins']")
	private WebElement moulds;
	@FindBy(xpath="//span[text()='Cake Tins']")
	private WebElement cakeTins;
	

	WebDriver driver;

	public SignIn(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void searchBox(String text) {
		search.sendKeys(text, Keys.ENTER);
	}

	public void authorName() {
		amish.click();
	}
	public void paperBack()
	{
		paperback.click();
	}
	
	public void bestSellers() {
	bestSellers.click();
	}

	public void babyProducts() {
		babyProducts.click();
	}

	public void safetyEqui() {
		safetyEqui.click();
	}
	
	public void babyMoni() {
	   babyMonitors.click();
	}
	public void firstSelect() {
		firstSelect.click();
	}

	public void clickHam()
	{
		hamburger.click();
	}
	public void clickGroceery()
	{
		grocery.click();
	}
	public void diet ()
	{
	 dietNutrition.click();
	}
public void sportsSupp()
{
	sportsSupplements.click();
}
public void massGainers()
{
	massGainers.click();
}
public void gncEle()
{
	gncEle.click();
}
 
public void newRelease()
{
	newReleases.click();
}
 public void cloth()
 {
	 clothing.click();
	 
 }

 public void boys()
 {
	 boys.click();
 }
 public void winterWear()
 {
	 winterWear.click();
 }
 
 public void jackets()
 {
	 jackets.click();
 }
 
 public void homeKitchen()
 {
	 homeKitchen.click();
 }
 public void kitchen()
 {
	 kitchen.click();
 }
 public void bakeWear()
 {
	 bakeware.click();
 }
 public void moulds()
 {
	 moulds.click();
 }
 public void cakeTins ()
 {
	 cakeTins.click();
 }
public void handelWindow2() throws Exception{

	driver.get(
			"https://www.amazon.in/Protoner-10kg-Adjustable-Dumbbells-String/dp/B07B8M7WYY/ref=sr_1_1_sspa?keywords=dumbles+for+men+10kg&qid=1580721583&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEySElZS1U3MkJSMTBYJmVuY3J5cHRlZElkPUEwMzk0MzQ2MzY1TjJMVU5FMEI2TyZlbmNyeXB0ZWRBZElkPUEwMDQyMjU1MlYxMjA0SThUU05QRCZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Set<String> Win = driver.getWindowHandles();
	Win.remove(parent);
	for (String CWin : Win) {
		Thread.sleep(10000);
		System.out.println(CWin);
		driver.switchTo().window(CWin);
		driver.close();
	}
}
}
