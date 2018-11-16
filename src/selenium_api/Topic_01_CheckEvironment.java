package selenium_api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Topic_01_CheckEvironment {
	WebDriver driver;
  @Test
  public void TC_01_CheckUrlAndTitle() {
	  String homePageTitle = driver.getTitle();
	  Assert.assertEquals(homePageTitle, "Guru99 Bank Home Page");
	  
	  String homePageUrl = driver.getCurrentUrl();
	  Assert.assertEquals(homePageUrl, "http://demo.guru99.com/V4/");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("http://demo.guru99.com/V4/");
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//mở trong 30s
	  driver.manage().window().maximize();//phóng to trình duyệt
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
