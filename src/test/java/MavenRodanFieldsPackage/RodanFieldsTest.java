package MavenRodanFieldsPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;


import java.util.concurrent.TimeUnit;


//@Listeners(MyListeners.class)
public class RodanFieldsTest {


	static WebDriver driver=new FirefoxDriver();
	RodanFieldsPage rodanFields=new  RodanFieldsPage(driver);


	@BeforeClass
	public void setUp() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.rodanandfields.com/ca/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	@Test(priority=1)
	public void rodanFieldsTest1() throws InterruptedException{
		rodanFields.shopCare();
		//Assert.assertTrue(rodanFields.verifyUrl().contains("quickShop"), "incorrect");
		rodanFields.selectRedefine();

		//Assert.assertTrue(rodanFields.verifyLabel(), "Labels not matching");
	
		//assertTrue(50 <= rodanFields.verifyPrice() && rodanFields.verifyPrice() <= 200, "not in range");

	}

	
	@Test(priority=2)
	public void rodanFieldsTest2() throws InterruptedException{	
	
		rodanFields.enroll();
	//	Assert.assertTrue(rodanFields.verifyProcedureURL().contains("Policies_Procedures_CANADA."), "incorrect");
	}
}


