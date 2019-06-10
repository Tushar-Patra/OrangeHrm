package pack1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class abc {
	ProfilesIni pr;
	FirefoxProfile fp;
	WebDriver driver;
	@BeforeTest
	public void Open()
	{
		pr=new ProfilesIni();
		fp=pr.getProfile("OnlineQa");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void Data()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='fjkgkjgg'");
		js.executeScript("document.getElementById('pass').value='fjkgkjgg'");
		js.executeScript("document.getElementById('u_0_8').click()");
	}


}
