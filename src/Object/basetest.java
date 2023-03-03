package Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class basetest {

	public WebDriver Driver;
	  @BeforeSuite
	  public void beforeSuite() {
		  System.setProperty("webdriver.chrome.driver", "./chrome/chromedriver.exe");
		  Driver=new ChromeDriver();
		  Driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		  Driver.manage().window().maximize();
	  }

}
