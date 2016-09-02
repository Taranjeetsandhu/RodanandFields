package MavenRodanFieldsPackage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RodanFieldsPage {
	WebDriver driver;
	String Parent;
	By shopCare=By.xpath("//div[@class='hidden-xs']//a[@id='our-products']");
	By allProducts=By.xpath("//div[@class='hidden-xs']//ul[@id='dropdown-menu']/li[7]/div/a");
	By selectRedefine=By.xpath("//div[@id='main-content']//div[2]//input[@tabindex='1']");
	By refine=By.xpath("//div[@class='dropdown-wrapper']//li[1]//div[@class='pull-right']/div");
	By reverse=By.xpath("//ul[@class='refine-products select-dropdown open']/li[2]//div[@class='repaired-checkbox']");

	By price=By.xpath("//div[@id='main-content']/div[2]//input[@tabindex='2']");
	By selectPrice=By.xpath("//ul[@class='refine-products select-dropdown open']//li[2]//div[@class='pull-right']/div");
	By product=By.xpath(".//*[@id='main-content']/div[5]//span");
	By label=By.xpath("//div[@id='quick-filtered']/ul/li");
	By becomeAConsultant=By.xpath(".//a[@id='corp-opp']");
	By enrollNow=By.xpath("/nav[@class='row navbar navbar-inverse hidden-xs']//li[@id='BusinessSystemBar']//li[2]//a");
	By procedures=By.xpath("//div[@id='disclaimer']/div/p/a[1]");

	By enterTest=By.xpath("//input[@id='sponserparam']");
	By clickSearch=By.xpath("//button[@id='search-sponsor-button']");
	By selectProduct=By.xpath("//div[@id='search-results']/div/div[1]/form/div/div/input");


	public  RodanFieldsPage (WebDriver driver){
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}



	public void shopCare() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(shopCare)).build().perform();
		Thread.sleep(5000);
		driver.findElement(allProducts).click();

	}
	public String verifyUrl()
	{
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();


	}

	public void selectRedefine() throws InterruptedException
	{

		driver.findElement(selectRedefine).click();
		Thread.sleep(5000);
		driver.findElement(refine).click();;
		Thread.sleep(5000);
		driver.findElement(selectRedefine).click();
		Thread.sleep(5000);
		driver.findElement(reverse).click();
		Thread.sleep(5000);
		driver.findElement(price).click();
		Thread.sleep(5000);
		driver.findElement(selectPrice).click();
		Thread.sleep(5000);
	}
	public boolean verifyLabel()
	{
		System.out.println(driver.findElement(label).getText());

		return	driver.findElement(label).getText().contains("REDIFNE REVERSE");
	}

	public String verifyPrice()
	{
		return	driver.findElement(price).getText();
	}


	public void enroll() throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(becomeAConsultant)).build().perform();
		Thread.sleep(5000);
		driver.findElement(enrollNow).click();
		Thread.sleep(5000);
		driver.findElement(procedures).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		driver.findElement(enterTest).click();

		driver.findElement(clickSearch).click();
		Thread.sleep(5000);
		driver.findElement(selectProduct).click();

	}
	public String verifyProcedureURL()
	{
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();


	}
}
